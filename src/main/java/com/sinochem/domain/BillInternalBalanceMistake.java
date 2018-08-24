package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BillInternalBalanceMistake {
    private Long id;

    private String mastAcctNum;

    private String acctNum;

    private Long custId;

    private String acctName;

    private Integer acctType;

    private BigDecimal internalTotalBalance;

    private BigDecimal acpsTotalBalance;

    private BigDecimal internalAvailableBalance;

    private BigDecimal acpsAvailableBalance;

    private BigDecimal internalAvailableDrawBalance;

    private BigDecimal acpsAvailableDrawBalance;

    private BigDecimal internalFrozenBalance;

    private BigDecimal acpsFrozenBalance;

    private Date checkTime;

    private Integer checkStatus;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private Long optId;

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

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum == null ? null : acctNum.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public Integer getAcctType() {
        return acctType;
    }

    public void setAcctType(Integer acctType) {
        this.acctType = acctType;
    }

    public BigDecimal getInternalTotalBalance() {
        return internalTotalBalance;
    }

    public void setInternalTotalBalance(BigDecimal internalTotalBalance) {
        this.internalTotalBalance = internalTotalBalance;
    }

    public BigDecimal getAcpsTotalBalance() {
        return acpsTotalBalance;
    }

    public void setAcpsTotalBalance(BigDecimal acpsTotalBalance) {
        this.acpsTotalBalance = acpsTotalBalance;
    }

    public BigDecimal getInternalAvailableBalance() {
        return internalAvailableBalance;
    }

    public void setInternalAvailableBalance(BigDecimal internalAvailableBalance) {
        this.internalAvailableBalance = internalAvailableBalance;
    }

    public BigDecimal getAcpsAvailableBalance() {
        return acpsAvailableBalance;
    }

    public void setAcpsAvailableBalance(BigDecimal acpsAvailableBalance) {
        this.acpsAvailableBalance = acpsAvailableBalance;
    }

    public BigDecimal getInternalAvailableDrawBalance() {
        return internalAvailableDrawBalance;
    }

    public void setInternalAvailableDrawBalance(BigDecimal internalAvailableDrawBalance) {
        this.internalAvailableDrawBalance = internalAvailableDrawBalance;
    }

    public BigDecimal getAcpsAvailableDrawBalance() {
        return acpsAvailableDrawBalance;
    }

    public void setAcpsAvailableDrawBalance(BigDecimal acpsAvailableDrawBalance) {
        this.acpsAvailableDrawBalance = acpsAvailableDrawBalance;
    }

    public BigDecimal getInternalFrozenBalance() {
        return internalFrozenBalance;
    }

    public void setInternalFrozenBalance(BigDecimal internalFrozenBalance) {
        this.internalFrozenBalance = internalFrozenBalance;
    }

    public BigDecimal getAcpsFrozenBalance() {
        return acpsFrozenBalance;
    }

    public void setAcpsFrozenBalance(BigDecimal acpsFrozenBalance) {
        this.acpsFrozenBalance = acpsFrozenBalance;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getOptId() {
        return optId;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }
}