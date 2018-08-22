package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AcpsAcctMast {
    private Long id;

    private String mastAcctNum;

    private Long custId;

    private BigDecimal totalBalance;

    private BigDecimal availableBalance;

    private BigDecimal availableDrawBalance;

    private BigDecimal frozenBalance;

    private BigDecimal preMinusAmt;

    private Integer totalModCount;

    private BigDecimal cumDrAmt;

    private BigDecimal cumCrAmt;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Long optId;

    private String lastUserId;

    private Date lastTime;

    private Date lastModifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMastAcctNum() {
        return mastAcctNum;
    }

    public void setMastAcctNum(String mastAcctNum) {
        this.mastAcctNum = mastAcctNum == null ? null : mastAcctNum.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getAvailableDrawBalance() {
        return availableDrawBalance;
    }

    public void setAvailableDrawBalance(BigDecimal availableDrawBalance) {
        this.availableDrawBalance = availableDrawBalance;
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public BigDecimal getPreMinusAmt() {
        return preMinusAmt;
    }

    public void setPreMinusAmt(BigDecimal preMinusAmt) {
        this.preMinusAmt = preMinusAmt;
    }

    public Integer getTotalModCount() {
        return totalModCount;
    }

    public void setTotalModCount(Integer totalModCount) {
        this.totalModCount = totalModCount;
    }

    public BigDecimal getCumDrAmt() {
        return cumDrAmt;
    }

    public void setCumDrAmt(BigDecimal cumDrAmt) {
        this.cumDrAmt = cumDrAmt;
    }

    public BigDecimal getCumCrAmt() {
        return cumCrAmt;
    }

    public void setCumCrAmt(BigDecimal cumCrAmt) {
        this.cumCrAmt = cumCrAmt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOptId() {
        return optId;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public String getLastUserId() {
        return lastUserId;
    }

    public void setLastUserId(String lastUserId) {
        this.lastUserId = lastUserId == null ? null : lastUserId.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}