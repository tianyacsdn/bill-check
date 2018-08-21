package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BillBalanceMistake {
    private Long id;

    private String acctNum;

    private Long custId;

    private String acctName;

    private Integer acctType;

    private String gatewayChannel;

    private String gatewayChannelCode;

    private BigDecimal bankTotalBalance;

    private BigDecimal acpsTotalBalance;

    private BigDecimal bankAvailableBalance;

    private BigDecimal acpsAvailableBalance;

    private BigDecimal bankAvailableDrawBalance;

    private BigDecimal acpsAvailableDrawBalance;

    private BigDecimal bankFrozenBalance;

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

    public String getGatewayChannel() {
        return gatewayChannel;
    }

    public void setGatewayChannel(String gatewayChannel) {
        this.gatewayChannel = gatewayChannel == null ? null : gatewayChannel.trim();
    }

    public String getGatewayChannelCode() {
        return gatewayChannelCode;
    }

    public void setGatewayChannelCode(String gatewayChannelCode) {
        this.gatewayChannelCode = gatewayChannelCode == null ? null : gatewayChannelCode.trim();
    }

    public BigDecimal getBankTotalBalance() {
        return bankTotalBalance;
    }

    public void setBankTotalBalance(BigDecimal bankTotalBalance) {
        this.bankTotalBalance = bankTotalBalance;
    }

    public BigDecimal getAcpsTotalBalance() {
        return acpsTotalBalance;
    }

    public void setAcpsTotalBalance(BigDecimal acpsTotalBalance) {
        this.acpsTotalBalance = acpsTotalBalance;
    }

    public BigDecimal getBankAvailableBalance() {
        return bankAvailableBalance;
    }

    public void setBankAvailableBalance(BigDecimal bankAvailableBalance) {
        this.bankAvailableBalance = bankAvailableBalance;
    }

    public BigDecimal getAcpsAvailableBalance() {
        return acpsAvailableBalance;
    }

    public void setAcpsAvailableBalance(BigDecimal acpsAvailableBalance) {
        this.acpsAvailableBalance = acpsAvailableBalance;
    }

    public BigDecimal getBankAvailableDrawBalance() {
        return bankAvailableDrawBalance;
    }

    public void setBankAvailableDrawBalance(BigDecimal bankAvailableDrawBalance) {
        this.bankAvailableDrawBalance = bankAvailableDrawBalance;
    }

    public BigDecimal getAcpsAvailableDrawBalance() {
        return acpsAvailableDrawBalance;
    }

    public void setAcpsAvailableDrawBalance(BigDecimal acpsAvailableDrawBalance) {
        this.acpsAvailableDrawBalance = acpsAvailableDrawBalance;
    }

    public BigDecimal getBankFrozenBalance() {
        return bankFrozenBalance;
    }

    public void setBankFrozenBalance(BigDecimal bankFrozenBalance) {
        this.bankFrozenBalance = bankFrozenBalance;
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