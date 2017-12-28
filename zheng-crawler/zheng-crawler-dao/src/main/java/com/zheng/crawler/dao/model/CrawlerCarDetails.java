package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CrawlerCarDetails implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer carDetailsId;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String carDetailsName;

    /**
     * 品牌ID
     *
     * @mbg.generated
     */
    private Integer carBrandId;

    /**
     * 车系ID
     *
     * @mbg.generated
     */
    private Integer carTypeId;

    /**
     * 厂家
     *
     * @mbg.generated
     */
    private String manufactor;

    /**
     * 年款
     *
     * @mbg.generated
     */
    private String modelYear;

    /**
     * 排量
     *
     * @mbg.generated
     */
    private String displacement;

    /**
     * 变速器
     *
     * @mbg.generated
     */
    private String transmission;

    /**
     * 档位
     *
     * @mbg.generated
     */
    private String gear;

    /**
     * 变速器型号
     *
     * @mbg.generated
     */
    private String transmissionModel;

    /**
     * 容量（这里保存更换升数）
     *
     * @mbg.generated
     */
    private String capacity;

    /**
     * 接头
     *
     * @mbg.generated
     */
    private String joint;

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

    private List<CrawlerProduct> productList;

    private List<CrawlerJointImg> jointImgList;

    public List<CrawlerProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<CrawlerProduct> productList) {
        this.productList = productList;
    }

    public List<CrawlerJointImg> getJointImgList() {
        return jointImgList;
    }

    public void setJointImgList(List<CrawlerJointImg> jointImgList) {
        this.jointImgList = jointImgList;
    }


    private static final long serialVersionUID = 1L;

    public Integer getCarDetailsId() {
        return carDetailsId;
    }

    public void setCarDetailsId(Integer carDetailsId) {
        this.carDetailsId = carDetailsId;
    }

    public String getCarDetailsName() {
        return carDetailsName;
    }

    public void setCarDetailsName(String carDetailsName) {
        this.carDetailsName = carDetailsName;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getTransmissionModel() {
        return transmissionModel;
    }

    public void setTransmissionModel(String transmissionModel) {
        this.transmissionModel = transmissionModel;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getJoint() {
        return joint;
    }

    public void setJoint(String joint) {
        this.joint = joint;
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
        sb.append(", carDetailsId=").append(carDetailsId);
        sb.append(", carDetailsName=").append(carDetailsName);
        sb.append(", carBrandId=").append(carBrandId);
        sb.append(", carTypeId=").append(carTypeId);
        sb.append(", manufactor=").append(manufactor);
        sb.append(", modelYear=").append(modelYear);
        sb.append(", displacement=").append(displacement);
        sb.append(", transmission=").append(transmission);
        sb.append(", gear=").append(gear);
        sb.append(", transmissionModel=").append(transmissionModel);
        sb.append(", capacity=").append(capacity);
        sb.append(", joint=").append(joint);
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
        CrawlerCarDetails other = (CrawlerCarDetails) that;
        return (this.getCarDetailsId() == null ? other.getCarDetailsId() == null : this.getCarDetailsId().equals(other.getCarDetailsId()))
            && (this.getCarDetailsName() == null ? other.getCarDetailsName() == null : this.getCarDetailsName().equals(other.getCarDetailsName()))
            && (this.getCarBrandId() == null ? other.getCarBrandId() == null : this.getCarBrandId().equals(other.getCarBrandId()))
            && (this.getCarTypeId() == null ? other.getCarTypeId() == null : this.getCarTypeId().equals(other.getCarTypeId()))
            && (this.getManufactor() == null ? other.getManufactor() == null : this.getManufactor().equals(other.getManufactor()))
            && (this.getModelYear() == null ? other.getModelYear() == null : this.getModelYear().equals(other.getModelYear()))
            && (this.getDisplacement() == null ? other.getDisplacement() == null : this.getDisplacement().equals(other.getDisplacement()))
            && (this.getTransmission() == null ? other.getTransmission() == null : this.getTransmission().equals(other.getTransmission()))
            && (this.getGear() == null ? other.getGear() == null : this.getGear().equals(other.getGear()))
            && (this.getTransmissionModel() == null ? other.getTransmissionModel() == null : this.getTransmissionModel().equals(other.getTransmissionModel()))
            && (this.getCapacity() == null ? other.getCapacity() == null : this.getCapacity().equals(other.getCapacity()))
            && (this.getJoint() == null ? other.getJoint() == null : this.getJoint().equals(other.getJoint()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarDetailsId() == null) ? 0 : getCarDetailsId().hashCode());
        result = prime * result + ((getCarDetailsName() == null) ? 0 : getCarDetailsName().hashCode());
        result = prime * result + ((getCarBrandId() == null) ? 0 : getCarBrandId().hashCode());
        result = prime * result + ((getCarTypeId() == null) ? 0 : getCarTypeId().hashCode());
        result = prime * result + ((getManufactor() == null) ? 0 : getManufactor().hashCode());
        result = prime * result + ((getModelYear() == null) ? 0 : getModelYear().hashCode());
        result = prime * result + ((getDisplacement() == null) ? 0 : getDisplacement().hashCode());
        result = prime * result + ((getTransmission() == null) ? 0 : getTransmission().hashCode());
        result = prime * result + ((getGear() == null) ? 0 : getGear().hashCode());
        result = prime * result + ((getTransmissionModel() == null) ? 0 : getTransmissionModel().hashCode());
        result = prime * result + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        result = prime * result + ((getJoint() == null) ? 0 : getJoint().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}