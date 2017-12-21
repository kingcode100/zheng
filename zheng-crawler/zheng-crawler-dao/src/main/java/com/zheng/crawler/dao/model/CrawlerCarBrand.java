package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CrawlerCarBrand implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer carBrandId;

    /**
     * 品牌名
     *
     * @mbg.generated
     */
    private String carBrandName;

    /**
     * 拼音
     *
     * @mbg.generated
     */
    private String carBrandPingyun;

    /**
     * logo
     *
     * @mbg.generated
     */
    private String logo;

    /**
     * 首字母排序
     *
     * @mbg.generated
     */
    private String sort;

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

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandPingyun() {
        return carBrandPingyun;
    }

    public void setCarBrandPingyun(String carBrandPingyun) {
        this.carBrandPingyun = carBrandPingyun;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
        sb.append(", carBrandId=").append(carBrandId);
        sb.append(", carBrandName=").append(carBrandName);
        sb.append(", carBrandPingyun=").append(carBrandPingyun);
        sb.append(", logo=").append(logo);
        sb.append(", sort=").append(sort);
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
        CrawlerCarBrand other = (CrawlerCarBrand) that;
        return (this.getCarBrandId() == null ? other.getCarBrandId() == null : this.getCarBrandId().equals(other.getCarBrandId()))
            && (this.getCarBrandName() == null ? other.getCarBrandName() == null : this.getCarBrandName().equals(other.getCarBrandName()))
            && (this.getCarBrandPingyun() == null ? other.getCarBrandPingyun() == null : this.getCarBrandPingyun().equals(other.getCarBrandPingyun()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarBrandId() == null) ? 0 : getCarBrandId().hashCode());
        result = prime * result + ((getCarBrandName() == null) ? 0 : getCarBrandName().hashCode());
        result = prime * result + ((getCarBrandPingyun() == null) ? 0 : getCarBrandPingyun().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}