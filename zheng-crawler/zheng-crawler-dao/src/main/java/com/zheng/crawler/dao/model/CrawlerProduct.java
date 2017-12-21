package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CrawlerProduct implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String productName;

    /**
     * 产品介绍
     *
     * @mbg.generated
     */
    private String productIntroduction;

    /**
     * 产品特点
     *
     * @mbg.generated
     */
    private String productFeatures;

    /**
     * 技术参数
     *
     * @mbg.generated
     */
    private String technicalParameter;

    /**
     * 零售价
     *
     * @mbg.generated
     */
    private String price;

    /**
     * 图片
     *
     * @mbg.generated
     */
    private String img;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    private Integer creator;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public String getProductFeatures() {
        return productFeatures;
    }

    public void setProductFeatures(String productFeatures) {
        this.productFeatures = productFeatures;
    }

    public String getTechnicalParameter() {
        return technicalParameter;
    }

    public void setTechnicalParameter(String technicalParameter) {
        this.technicalParameter = technicalParameter;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productIntroduction=").append(productIntroduction);
        sb.append(", productFeatures=").append(productFeatures);
        sb.append(", technicalParameter=").append(technicalParameter);
        sb.append(", price=").append(price);
        sb.append(", img=").append(img);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CrawlerProduct other = (CrawlerProduct) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductIntroduction() == null ? other.getProductIntroduction() == null : this.getProductIntroduction().equals(other.getProductIntroduction()))
            && (this.getProductFeatures() == null ? other.getProductFeatures() == null : this.getProductFeatures().equals(other.getProductFeatures()))
            && (this.getTechnicalParameter() == null ? other.getTechnicalParameter() == null : this.getTechnicalParameter().equals(other.getTechnicalParameter()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductIntroduction() == null) ? 0 : getProductIntroduction().hashCode());
        result = prime * result + ((getProductFeatures() == null) ? 0 : getProductFeatures().hashCode());
        result = prime * result + ((getTechnicalParameter() == null) ? 0 : getTechnicalParameter().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}