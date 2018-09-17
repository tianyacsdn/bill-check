package com.sinochem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BalanceBillCheck {
    private Long id;

    private Date billDate;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date checkDate;

    private String transSq;

    private String thirdCustid;

    private String gatewayChannel;

    private String gatewayChannelCode;

    private String tradeType;

    private String mastAcctNum;

    private String acctNum;

    private Long custId;

    private String acctName;

    private Integer acctType;

    private BigDecimal bankTotalBalance;

    private BigDecimal acpsTotalBalance;

    private BigDecimal bankAvailableBalance;

    private BigDecimal acpsAvailableBalance;

    private BigDecimal bankAvailableDrawBalance;

    private BigDecimal acpsAvailableDrawBalance;

    private BigDecimal bankFrozenBalance;

    private BigDecimal acpsFrozenBalance;

    private BigDecimal bankPreMinusAmt;

    private BigDecimal acpsPreMinusAmt;

    private BigDecimal bankPendingPaymentBalance;

    private BigDecimal acpsPendingPaymentBalance;

    private Integer checkStatus;

    private Integer alarmState;

    private String errorType;

    private Long optId;

    private String remark;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd hh:mm:ss")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getTransSq() {
        return transSq;
    }

    public void setTransSq(String transSq) {
        this.transSq = transSq == null ? null : transSq.trim();
    }

    public String getThirdCustid() {
        return thirdCustid;
    }

    public void setThirdCustid(String thirdCustid) {
        this.thirdCustid = thirdCustid == null ? null : thirdCustid.trim();
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

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
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

    public BigDecimal getBankPreMinusAmt() {
        return bankPreMinusAmt;
    }

    public void setBankPreMinusAmt(BigDecimal bankPreMinusAmt) {
        this.bankPreMinusAmt = bankPreMinusAmt;
    }

    public BigDecimal getAcpsPreMinusAmt() {
        return acpsPreMinusAmt;
    }

    public void setAcpsPreMinusAmt(BigDecimal acpsPreMinusAmt) {
        this.acpsPreMinusAmt = acpsPreMinusAmt;
    }

    public BigDecimal getBankPendingPaymentBalance() {
        return bankPendingPaymentBalance;
    }

    public void setBankPendingPaymentBalance(BigDecimal bankPendingPaymentBalance) {
        this.bankPendingPaymentBalance = bankPendingPaymentBalance;
    }

    public BigDecimal getAcpsPendingPaymentBalance() {
        return acpsPendingPaymentBalance;
    }

    public void setAcpsPendingPaymentBalance(BigDecimal acpsPendingPaymentBalance) {
        this.acpsPendingPaymentBalance = acpsPendingPaymentBalance;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Integer getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(Integer alarmState) {
        this.alarmState = alarmState;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType == null ? null : errorType.trim();
    }

    public Long getOptId() {
        return optId;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}