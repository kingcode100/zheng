package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.Date;

public class CrawlerJointImg implements Serializable {
    /**
     * 编号
     *
     * @mbg.generated
     */
    private Integer jointImgId;

    /**
     * 车详情ID
     *
     * @mbg.generated
     */
    private Integer carDetailsId;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String name;

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

    public Integer getJointImgId() {
        return jointImgId;
    }

    public void setJointImgId(Integer jointImgId) {
        this.jointImgId = jointImgId;
    }

    public Integer getCarDetailsId() {
        return carDetailsId;
    }

    public void setCarDetailsId(Integer carDetailsId) {
        this.carDetailsId = carDetailsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append(", jointImgId=").append(jointImgId);
        sb.append(", carDetailsId=").append(carDetailsId);
        sb.append(", name=").append(name);
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
        CrawlerJointImg other = (CrawlerJointImg) that;
        return (this.getJointImgId() == null ? other.getJointImgId() == null : this.getJointImgId().equals(other.getJointImgId()))
            && (this.getCarDetailsId() == null ? other.getCarDetailsId() == null : this.getCarDetailsId().equals(other.getCarDetailsId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJointImgId() == null) ? 0 : getJointImgId().hashCode());
        result = prime * result + ((getCarDetailsId() == null) ? 0 : getCarDetailsId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}