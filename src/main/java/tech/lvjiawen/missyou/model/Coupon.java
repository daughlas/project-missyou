package tech.lvjiawen.missyou.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Coupon {
    private Object id;
    private String title;
    private Timestamp startTime;
    private Timestamp endTime;
    private String description;
    private BigDecimal fullMoney;
    private BigDecimal minus;
    private BigDecimal rate;
    private short type;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private Object activityId;
    private String remark;
    private Object wholeStore;

    @Id
    @Column(name = "id")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "full_money")
    public BigDecimal getFullMoney() {
        return fullMoney;
    }

    public void setFullMoney(BigDecimal fullMoney) {
        this.fullMoney = fullMoney;
    }

    @Basic
    @Column(name = "minus")
    public BigDecimal getMinus() {
        return minus;
    }

    public void setMinus(BigDecimal minus) {
        this.minus = minus;
    }

    @Basic
    @Column(name = "rate")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "type")
    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "delete_time")
    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Basic
    @Column(name = "activity_id")
    public Object getActivityId() {
        return activityId;
    }

    public void setActivityId(Object activityId) {
        this.activityId = activityId;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "whole_store")
    public Object getWholeStore() {
        return wholeStore;
    }

    public void setWholeStore(Object wholeStore) {
        this.wholeStore = wholeStore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coupon coupon = (Coupon) o;
        return type == coupon.type &&
                Objects.equals(id, coupon.id) &&
                Objects.equals(title, coupon.title) &&
                Objects.equals(startTime, coupon.startTime) &&
                Objects.equals(endTime, coupon.endTime) &&
                Objects.equals(description, coupon.description) &&
                Objects.equals(fullMoney, coupon.fullMoney) &&
                Objects.equals(minus, coupon.minus) &&
                Objects.equals(rate, coupon.rate) &&
                Objects.equals(createTime, coupon.createTime) &&
                Objects.equals(updateTime, coupon.updateTime) &&
                Objects.equals(deleteTime, coupon.deleteTime) &&
                Objects.equals(activityId, coupon.activityId) &&
                Objects.equals(remark, coupon.remark) &&
                Objects.equals(wholeStore, coupon.wholeStore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startTime, endTime, description, fullMoney, minus, rate, type, createTime, updateTime, deleteTime, activityId, remark, wholeStore);
    }
}
