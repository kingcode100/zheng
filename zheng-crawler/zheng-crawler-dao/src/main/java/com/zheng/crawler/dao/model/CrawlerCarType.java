package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CrawlerCarType implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer carTypeId;

    /**
     * 车系名
     *
     * @mbg.generated
     */
    private String carTypeName;

    /**
     * 车品牌ID
     *
     * @mbg.generated
     */
    private Integer carBrandId;

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

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
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
        sb.append(", carTypeId=").append(carTypeId);
        sb.append(", carTypeName=").append(carTypeName);
        sb.append(", carBrandId=").append(carBrandId);
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
        CrawlerCarType other = (CrawlerCarType) that;
        return (this.getCarTypeId() == null ? other.getCarTypeId() == null : this.getCarTypeId().equals(other.getCarTypeId()))
            && (this.getCarTypeName() == null ? other.getCarTypeName() == null : this.getCarTypeName().equals(other.getCarTypeName()))
            && (this.getCarBrandId() == null ? other.getCarBrandId() == null : this.getCarBrandId().equals(other.getCarBrandId()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarTypeId() == null) ? 0 : getCarTypeId().hashCode());
        result = prime * result + ((getCarTypeName() == null) ? 0 : getCarTypeName().hashCode());
        result = prime * result + ((getCarBrandId() == null) ? 0 : getCarBrandId().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}