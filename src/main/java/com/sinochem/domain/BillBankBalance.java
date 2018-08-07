package com.sinochem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.Date;

public class BillBankBalance {
    private Long id;

    private String thirdType;

    private String thirdNum;

    private String tradeType;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyyMMdd")
    private Date billDate;

    private String transSq;

    private String thirdCustid;

    private String acctId;

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

    public String getThirdType() {
        return thirdType;
    }

    public void setThirdType(String thirdType) {
        this.thirdType = thirdType == null ? null : thirdType.trim();
    }

    public String getThirdNum() {
        return thirdNum;
    }

    public void setThirdNum(String thirdNum) {
        this.thirdNum = thirdNum == null ? null : thirdNum.trim();
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