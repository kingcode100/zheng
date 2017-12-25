package com.zheng.crawler.web.controller;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.zheng.common.base.BaseController;
import com.zheng.common.base.BaseResult;
import com.zheng.crawler.dao.model.*;
import com.zheng.crawler.rpc.api.CrawlerCarBrandService;
import com.zheng.crawler.rpc.api.CrawlerCarDetailsService;
import com.zheng.crawler.rpc.api.CrawlerCarTypeService;
import com.zheng.crawler.rpc.api.CrawlerService;
import com.zheng.crawler.rpc.api.CrawlerJointImgService;
import com.zheng.crawler.web.model.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * 测试controller
 * Created by shuzheng on 2017/3/21.
 */
@Controller
public class IndexController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CrawlerService crawlerService;

    @Autowired
    private CrawlerCarBrandService crawlerCarBrandService;

    @Autowired
    private CrawlerCarTypeService crawlerCarTypeService;

    @Autowired
    private CrawlerCarDetailsService crawlerCarDetailsService;

    @Autowired
    private CrawlerJointImgService crawlerJointImgService;

    @Autowired
    FastFileStorageClient fastFileStorageClient;

    private static String coodies = "hpbti37gbu2s50vjrc4reog7m1";



    /**
     * jsp视图
     *
     * @return
     */
    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public String jsp() {
        return jsp("/index");
    }

    /**
     * thymeleaf视图
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
    public String thymeleaf(Model model) {
        model.addAttribute("host", crawlerService.sayHello("http://www.zhangshuzheng.cn/"));
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setAge(11);
        user.setName("zhangsan");
        users.add(user);
        user = new User();
        user.setId(2L);
        user.setAge(22);
        user.setName("lisi");
        users.add(user);
        model.addAttribute("users", users);
        return thymeleaf("/index");
    }

    /**
     * 抓取汽车品牌
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/pinpai", method = RequestMethod.GET)
    public String pinpai(Model model) {

        List<CrawlerCarBrand> carBrandList = grabPinpai();

        for (CrawlerCarBrand item : carBrandList) {
            System.out.println(item.getCarBrandId() + "----" + item.getLogo());
            crawlerCarBrandService.insert(item);
        }
        return thymeleaf("/index");
    }

    /**
     * 抓取汽车品牌系列
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/xilie", method = RequestMethod.GET)
    public String xilie(Model model) {

        List<CrawlerCarBrand> carBrandList = crawlerCarBrandService.selectByExample(new CrawlerCarBrandExample());

        for (CrawlerCarBrand item : carBrandList) {
            System.out.println(item.getCarBrandId() + "----" + item.getLogo());
            List<CrawlerCarType> carTypeList = grabChexi(item.getCarBrandId());
            for (CrawlerCarType carType : carTypeList) {
                System.out.println(carType.getCarTypeId() + "----" + carType.getCarBrandId() + "-----" + carType.getCarTypeName());
                crawlerCarTypeService.insert(carType);
            }
        }

        return thymeleaf("/index");
    }

    /**
     * 抓取汽车详细信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/carDetail", method = RequestMethod.GET)
    public String carDetail(Model model) {

        List<CrawlerCarType> carTypeList = crawlerCarTypeService.selectByExample(new CrawlerCarTypeExample());
        for (CrawlerCarType item : carTypeList) {
            List<String> yearList = grabNianfen(item.getCarTypeId());
            for (String year : yearList) {
                List<String> pailiangList = grabPailiang(item.getCarBrandId(), item.getCarTypeId(), year);

                for (String pailiang : pailiangList) {
                    System.out.println(item.getCarBrandId() + "========" + item.getCarTypeId() + "========" + year + "========" + pailiang);
                    if ("null".equals(pailiang)) {
                        continue;
                    }
                    List<String> biansuxiangList = grabTransmission(item.getCarBrandId(), item.getCarTypeId(), year, pailiang);

                    for (String biansuxiang : biansuxiangList) {

                        CrawlerCarDetails crawlerCarDetails = grabResult(item.getCarBrandId(), item.getCarTypeId(), year, pailiang, biansuxiang);

                        //插入数据库
                        crawlerCarDetailsService.addCarDetails(crawlerCarDetails, crawlerCarDetails.getProductList(), crawlerCarDetails.getJointImgList());
                    }

                }

            }

        }

        return thymeleaf("/index");
    }


    /**
     * 抓取汽车详细信息
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/carimg", method = RequestMethod.GET)
    public String carimg(Model model) {

        //下载品牌IMG
//        List<CrawlerCarBrand> carBrandList = crawlerCarBrandService.selectByExample(new CrawlerCarBrandExample());
//        for (CrawlerCarBrand item : carBrandList) {
//            String url = item.getLogo();
//            if(null == url|| url.equals("null") || url.length() == 0){
//                continue;
//            }
//            String fileName = downloadPicture(url,"D:/fdfsimg/");
//            item.setLogo(fileName);
//            crawlerCarBrandService.updateByPrimaryKey(item);
//        }


//下载变速箱
        CrawlerJointImgExample crawlerJointImgExample = null;
        crawlerJointImgExample = new CrawlerJointImgExample();
        List<CrawlerJointImg> jointImgList = crawlerJointImgService.selectByExample(crawlerJointImgExample);
        Map<String,String> map = new HashMap<>();
        for (CrawlerJointImg item : jointImgList) {
            String url = item.getImg();
            if (null == url || url.equals("null") || url.length() == 0) {
                continue;
            }

            crawlerJointImgExample = new CrawlerJointImgExample();
            crawlerJointImgExample.createCriteria()
                    .andImgEqualTo(item.getImg());

            CrawlerJointImg crawlerJointImg = null;
            if (null != map.get(url)) {
                crawlerJointImg = new CrawlerJointImg();
                crawlerJointImg.setImg(map.get(url));
                crawlerJointImgService.updateByExampleSelective(crawlerJointImg, crawlerJointImgExample);
                continue;
            }


            String fileName = downloadPicture(url, "D:/fdfsdetail/");
            crawlerJointImg = new CrawlerJointImg();
            crawlerJointImg.setImg(fileName);
            crawlerJointImgService.updateByExampleSelective(crawlerJointImg, crawlerJointImgExample);
            map.put(url,fileName);
        }

        System.out.println("============================完成");
        return thymeleaf("/index");
    }


    /**
     * 转换连接
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/changeurl", method = RequestMethod.GET)
    public String changeurl(Model model) throws FileNotFoundException {

        CrawlerCarBrandExample crawlerCarBrandExample = null;
        crawlerCarBrandExample = new CrawlerCarBrandExample();
        List<CrawlerCarBrand> carBrandList = crawlerCarBrandService.selectByExample(crawlerCarBrandExample);
        Map<String,String> map = new HashMap<>();
        for (CrawlerCarBrand item : carBrandList) {
            String url = item.getLogo();
            if (null == url || url.equals("null") || url.length() == 0) {
                continue;
            }

            crawlerCarBrandExample = new CrawlerCarBrandExample();
            crawlerCarBrandExample.createCriteria()
                    .andLogoEqualTo(item.getLogo());

            CrawlerCarBrand crawlerCarBrand = null;
            if (null != map.get(url)) {
                crawlerCarBrand = new CrawlerCarBrand();
                crawlerCarBrand.setLogo(map.get(url));
                crawlerCarBrandService.updateByExampleSelective(crawlerCarBrand, crawlerCarBrandExample);
                continue;
            }

            File file = new File("/alidata/xiangshun100/img/fdfsdetail/"+item.getLogo());
            StorePath storePath = fastFileStorageClient.uploadFile(null, new FileInputStream(file), file.length(), "jpg");
//            String fileName = downloadPicture(url, "D:/fdfsdetail/");
            crawlerCarBrand = new CrawlerCarBrand();
            crawlerCarBrand.setLogo("http://image.xiangshun100.com/"+storePath.getFullPath());
            crawlerCarBrandService.updateByExampleSelective(crawlerCarBrand, crawlerCarBrandExample);
            map.put(url,storePath.getPath());
        }

        System.out.println("============================完成");
        return thymeleaf("/index");
    }

    /**
     * 转换连接
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model) throws FileNotFoundException {

        File file = new File("/alidata/xiangshun100/img/aaa.txt");
        StorePath storePath = fastFileStorageClient.uploadFile(null, new FileInputStream(file), file.length(), "txt");
        System.out.println(storePath.getPath());
        System.out.println(storePath.getFullPath());
        System.out.println(storePath.getGroup());

        return thymeleaf("/index");
    }

    //品牌页面
    private void grabCase() {
        Document doc = null;
        Map<String, String> map = null;
        try {
            map = new HashMap<>();
            Connection connection = Jsoup.connect("http://vin.wglubricants.com/Home/SK/index.html?code=0610IpsG0Eqbzk2YTBrG0iGbsG00Ipsz&state=");
            connection.header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN");
            connection.cookies(map);
            Connection.Response response = connection.execute();
            map = response.cookies();
            connection.cookies(map);
            doc = connection.timeout(50000).get();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.print(doc.toString() + "==============================================================");
            System.out.println(map.get("PHPSESSID"));//从cookies中获取PHPSESSID;
        }
    }


    //品牌
    private List<CrawlerCarBrand> grabPinpai() {
        Document doc = null;
        Map<String, String> map = null;
        CrawlerCarBrand carBrand = null;
        List<CrawlerCarBrand> carBrandList = null;
        try {
            map = new HashMap<>();
            carBrandList = new ArrayList<>();
            map.put("PHPSESSID", coodies);
            doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/getPinpai")
                    .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                    .cookies(map)
                    .ignoreContentType(true)
                    .timeout(50000).get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            String jsonStr = doc.toString();
            System.out.println(jsonStr);
            jsonStr = jsonStr.substring(jsonStr.indexOf("["), jsonStr.lastIndexOf("]") + 1);
            System.out.println(jsonStr);
            JSONArray jsonArray = JSONArray.fromObject(jsonStr);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject job = jsonArray.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                carBrand = new CrawlerCarBrand();
                carBrand.setCarBrandId(Integer.parseInt(job.get("pinpaiid").toString()));
                carBrand.setCarBrandName(job.get("name").toString());
                carBrand.setCarBrandPingyun(job.get("pinyin").toString());
                carBrand.setSort(job.get("sort").toString());
                carBrand.setLogo(job.get("logo").toString());
                carBrandList.add(carBrand);
//				System.out.println("name:" + job.get("name") +
//						"-pinyin:" + job.get("pinyin") +
//						"-sort:" + job.get("sort") +
//						"-pinpaiid:" + job.get("pinpaiid") +
//						"-logo:" + job.get("logo"));  // 得到 每个对象中的属性值
            }

        }
        return carBrandList;
    }

    //车系
    private List<CrawlerCarType> grabChexi(Integer pinpaiId) {
        List<CrawlerCarType> carTypeList = null;
        CrawlerCarType carType = null;
        Document doc = null;
        Integer falg = 1;

        while (falg == 1) {
            try {
                carTypeList = new ArrayList<>();
                Map<String, String> map = new HashMap<>();
                map.put("PHPSESSID", coodies);
                doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/getChexi")
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                        .cookies(map)
                        .ignoreContentType(true)
                        .data("pinpaiId", pinpaiId.toString())
                        .timeout(50000).post();
                falg = 0;
            } catch (Exception e) {
                e.printStackTrace();
                falg = 1;
            } finally {
                if (falg == 1) {
                    continue;
                }
                String jsonStr = doc.toString();

                jsonStr = jsonStr.substring(jsonStr.indexOf("["), jsonStr.lastIndexOf("]") + 1);
                System.out.println(jsonStr);
                JSONArray jsonArray = JSONArray.fromObject(jsonStr);
                for (int i = 0; i < jsonArray.size(); i++) {
                    carType = new CrawlerCarType();
                    JSONObject job = jsonArray.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                    carType.setCarTypeId(Integer.parseInt(job.get("chexiid").toString()));
                    carType.setCarTypeName(job.get("name").toString());
                    carType.setCarBrandId(pinpaiId);
                    carTypeList.add(carType);
//                System.out.println("name:" + job.get("name") +
//                        "-chexiid:" + job.get("chexiid") +
//                        "-pinpaiid:" + job.get("pinpaiid"));  // 得到 每个对象中的属性值
                }


            }
        }
        return carTypeList;
    }

    //年份
    private List<String> grabNianfen(Integer chexiId) {
        Document doc = null;
        List<String> yearList = null;
        Integer falg = 1;
        while (falg == 1) {
            try {
                Map<String, String> map = new HashMap<>();
                map.put("PHPSESSID", coodies);
                doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/getYear")
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                        .cookies(map)
                        .ignoreContentType(true)
                        .data("chexiId", chexiId.toString())
                        .timeout(50000).post();
                falg = 0;
            } catch (Exception e) {
                e.printStackTrace();
                falg = 1;
            } finally {
                if (falg == 1) {
                    continue;
                }
                String jsonStr = doc.toString();
                jsonStr = jsonStr.substring(jsonStr.indexOf("["), jsonStr.lastIndexOf("]") + 1);
                JSONArray jsonArray = JSONArray.fromObject(jsonStr);
                yearList = new ArrayList<>();
                for (int i = 0; i < jsonArray.size(); i++) {
                    JSONObject job = jsonArray.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                    yearList.add(job.get("year").toString());
//                System.out.println("year:" + job.get("year") +
//                        "-chexiid:" + job.get("chexiid") +
//                        "-pinpaiid:" + job.get("pinpaiid"));  // 得到 每个对象中的属性值
                }

            }
        }
        return yearList;
    }

    //排量
    private List<String> grabPailiang(Integer pinpaiId, Integer chexiId, String nianfen) {
        Document doc = null;
        List<String> pailiang = null;
        Integer falg = 1;
        while (falg == 1) {
            try {
                Map<String, String> cookiesMap = new HashMap<>();
                Map<String, String> param = new HashMap<>();
                param.put("pinpaiId", pinpaiId.toString());
                param.put("chexiId", chexiId.toString());
                param.put("year", nianfen);
                cookiesMap.put("PHPSESSID", coodies);
                doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/getDisplacement")
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                        .cookies(cookiesMap)
                        .ignoreContentType(true)
                        .data(param)
                        .timeout(50000).post();
                falg = 0;
            } catch (Exception e) {
                falg = 1;

                e.printStackTrace();
            } finally {
                if (falg == 1) {
                    continue;
                }
                String jsonStr = doc.toString();

                jsonStr = jsonStr.substring(jsonStr.indexOf("["), jsonStr.lastIndexOf("]") + 1);
                JSONArray jsonArray = JSONArray.fromObject(jsonStr);
                pailiang = new ArrayList<>();
                for (int i = 0; i < jsonArray.size(); i++) {
                    JSONObject job = jsonArray.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象

                    pailiang.add(job.get("displacement").toString());
//                System.out.println("year:" + job.get("year") +
//                        "-chexiid:" + job.get("chexiid") +
//                        "-pinpaiid:" + job.get("pinpaiid") +
//                        "-displacement:" + job.get("displacement"));  // 得到 每个对象中的属性值
                }

            }
        }
        return pailiang;
    }

    //爬取变速箱
    private List<String> grabTransmission(Integer pinpaiId, Integer chexiId, String nianfen, String displacement) {
        Document doc = null;
        List<String> transmission = null;
        Integer falg = 1;
        while (falg == 1) {
            try {
                Map<String, String> cookiesMap = new HashMap<>();
                Map<String, String> param = new HashMap<>();
                param.put("pinpaiId", pinpaiId.toString());
                param.put("chexiId", chexiId.toString());
                param.put("year", nianfen);
                param.put("displacement", displacement);
                cookiesMap.put("PHPSESSID", coodies);
                doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/getTransmission")
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                        .cookies(cookiesMap)
                        .ignoreContentType(true)
                        .data(param)
                        .timeout(50000).post();
                falg = 0;
            } catch (Exception e) {
                e.printStackTrace();
                falg = 1;
            } finally {
                if (falg == 1) {
                    continue;
                }
                String jsonStr = doc.select("body").text();
                System.out.println(jsonStr);
                JSONObject jsonObject = JSONObject.fromObject(jsonStr);

                jsonObject = JSONObject.fromObject(jsonObject.get("content").toString());
                Iterator it = jsonObject.keys();
                transmission = new ArrayList<>();
                while (it.hasNext()) {
                    String key = (String) it.next();
                    transmission.add(JSONObject.fromObject(jsonObject.get(key).toString()).get("chexingid").toString());
//                System.out.println("year:" + nianfen +
//                        "-chexiid:" + chexiId +
//                        "-chexingid:" + JSONObject.fromObject(jsonObject.get(key).toString()).get("chexingid") +
//                        "-pinpaiid:" + pinpaiId +
//                        "-spectransmission:" + key +
//                        "-displacement:" + displacement);  // 得到 每个对象中的属性值

                }
            }
        }
        return transmission;
    }


    //    (Integer pinpaiId, Integer chexiId, String nianfen, String displacement)
    //结果页面
    private CrawlerCarDetails grabResult(Integer pinpaiId, Integer chexiId, String nianfen, String displacement, String chexingId) {
        Document doc = null;
        CrawlerCarDetails carDetails = null;
        List<CrawlerJointImg> jointImgList = null;
        List<CrawlerProduct> productList = null;
        Integer falg = 1;
        while (falg == 1) {
            try {
                Map<String, String> cookiesMap = new HashMap<>();
                Map<String, String> param = new HashMap<>();
                param.put("pinpaiId", pinpaiId.toString());
                param.put("chexiId", chexiId.toString());
                param.put("year", nianfen);
                param.put("displacement", displacement);
                param.put("chexingId", chexingId);


                cookiesMap.put("PHPSESSID", coodies);
                doc = Jsoup.connect("http://vin.wglubricants.com/Home/SK/result")
                        .header("User-Agent", "Mozilla/5.0 (Linux; Android 8.1.0; Nexus 5X Build/OPM1.171019.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/61.0.3163.98 Mobile Safari/537.36 MicroMessenger/6.5.13.1100 NetType/WIFI Language/zh_CN")
                        .cookies(cookiesMap)
                        .data(param)
                        .timeout(50000).post();
                falg = 0;
            } catch (Exception e) {
                e.printStackTrace();
                falg = 1;
            } finally {
                if (falg == 1) {
                    continue;
                }
                //名称
                String carDetailsName = doc.select(".car-title").first().text();

                Elements results = doc.select(".am-g.body");
                carDetails = new CrawlerCarDetails();
                carDetails.setCarBrandId(pinpaiId);
                carDetails.setCarTypeId(chexiId);
                carDetails.setModelYear(nianfen);
                carDetails.setDisplacement(displacement);
                carDetails.setCarDetailsName(carDetailsName);

                for (Element item : results) {
                    String key = item.select(".am-fl").text();
                    String value = item.select(".am-fr").text();

                    if ("厂家".equals(key)) {
                        carDetails.setManufactor(value);
                    }
                    if ("变速器类型".equals(key)) {
                        carDetails.setTransmission(value);
                    }
                    if ("挡位数".equals(key)) {
                        carDetails.setGear(value);
                    }
                    if ("变速箱型号".equals(key)) {
                        carDetails.setTransmissionModel(value);
                    }
                    if ("更换升数".equals(key)) {
                        carDetails.setCapacity(value);
                    }
                    if ("特殊接头".equals(key)) {
                        carDetails.setJoint(value);
                    }
                }

                Elements imgs = doc.select(".result-pic-item");
                if (null != imgs & imgs.size() > 0) {
                    jointImgList = new ArrayList<>();
                    CrawlerJointImg jointImg = new CrawlerJointImg();
                    for (Element item : imgs) {
                        String name = item.select(".text-content").text();
                        String img = item.attr("s");
                        jointImg.setName(name);
                        jointImg.setImg(img);
                        jointImgList.add(jointImg);
                    }
                    carDetails.setJointImgList(jointImgList);
                }


                Elements products = doc.select(".result-pic-item-left");

                if (null != products & products.size() > 0) {
                    productList = new ArrayList<>();
                    CrawlerProduct product = new CrawlerProduct();
                    for (Element item : products) {
                        String name = item.select(".name").text();
                        String price = item.select(".price1").text();
                        String img = item.select("image").attr("src");
                        String productIdStr = item.attr("onclick");
                        productIdStr = productIdStr.substring(9, productIdStr.length() - 1);
                        product.setProductId(Integer.parseInt(productIdStr));
                        product.setProductName(name);
                        product.setPrice(price);
                        product.setImg(img);
                        productList.add(product);
                    }
                    carDetails.setProductList(productList);
                }
            }
//            System.out.print(doc.toString());
        }

        return carDetails;
    }


    public static void main(String[] args) throws IOException {
//        String configFileName = "E:\\zheng\\zheng\\zheng-crawler\\zheng-crawler-web\\src\\main\\resources\\fdfs_client.conf";
//
//        try {
//            ClientGlobal.init(configFileName);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        File file = new File("C:/Users/Public/Pictures/Sample Pictures/qie.jpg");
//        //返回储存路径:group1 M00/00/00/wKhuW1Vmj6KAZ09pAAC9przUxEk788.jpg
//        String[] files =  uploadFile(file, "test.jpg", file.length());
//        System.out.println(Arrays.asList(files));


//        IndexController i = new IndexController();
////        i.grabNianfen("2951");
////        i.grabPailiang("33","2951","2015");
//
////        i.grabTransmission("33", "2951", "2015", "1.4T");
////        i.grabResult("33", "18", "2017", "3.0T", "27961");
//        i.grabResult(58, 22, "2004", "2.0L", "1352");


//        getimg("http://car3.autoimg.cn/cardfs/brand/50/g23/M09/5B/8F/autohomecar__wKgFXFbCuGGAark9AAAOm8MlQDA537.jpg", fileName);
//        String fileName = downloadPicture("http://car3.autoimg.cn/cardfs/brand/50/g23/M09/5B/8F/autohomecar__wKgFXFbCuGGAark9AAAOm8MlQDA537.jpg");
//        System.out.println(fileName);
    }

    //链接url下载图片
    private String downloadPicture(String urlList, String path) {
        URL url = null;
        int imageNumber = 0;
        String fileName = UUID.randomUUID().toString().replace("-", "");
        String imageName = null;
        String suffixName = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            suffixName = urlList.substring(urlList.lastIndexOf("."));
            imageName = path + fileName + suffixName;

            FileOutputStream fileOutputStream = new FileOutputStream(new File(imageName));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            byte[] context = output.toByteArray();
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            return null;
        }
        return fileName+suffixName;
    }
}