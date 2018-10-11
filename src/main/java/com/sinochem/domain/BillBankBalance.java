package com.sinochem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class BillBankBalance {
    private Long id;

    private String gatewayChannel;

    private String gatewayChannelCode;

    private String tradeType;

    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date billDate;

    private String transSq;

    private String thirdCustid;

    private String acctId;

    private String acctName;

    private BigDecimal tranAmount;

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

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
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

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public BigDecimal getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(BigDecimal tranAmount) {
        this.tranAmount = tranAmount;
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