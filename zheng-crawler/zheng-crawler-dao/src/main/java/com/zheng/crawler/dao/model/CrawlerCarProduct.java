package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CrawlerCarProduct implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer carProductId;

    /**
     * 产品ID
     *
     * @mbg.generated
     */
    private Integer productId;

    /**
     * 车详情ID
     *
     * @mbg.generated
     */
    private Integer carDetailsId;

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

    public Integer getCarProductId() {
        return carProductId;
    }

    public void setCarProductId(Integer carProductId) {
        this.carProductId = carProductId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCarDetailsId() {
        return carDetailsId;
    }

    public void setCarDetailsId(Integer carDetailsId) {
        this.carDetailsId = carDetailsId;
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
        sb.append(", carProductId=").append(carProductId);
        sb.append(", productId=").append(productId);
        sb.append(", carDetailsId=").append(carDetailsId);
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
        CrawlerCarProduct other = (CrawlerCarProduct) that;
        return (this.getCarProductId() == null ? other.getCarProductId() == null : this.getCarProductId().equals(other.getCarProductId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getCarDetailsId() == null ? other.getCarDetailsId() == null : this.getCarDetailsId().equals(other.getCarDetailsId()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarProductId() == null) ? 0 : getCarProductId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getCarDetailsId() == null) ? 0 : getCarDetailsId().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}