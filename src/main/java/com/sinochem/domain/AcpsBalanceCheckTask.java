package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AcpsBalanceCheckTask {
    private Long id;

    private String sinoChemOrderId;

    private String sinoChemTradeId;

    private String mastAcctNum;

    private String acctNum;

    private Long custId;

    private String gatewayChannel;

    private String gatewayChannelCode;

    private String drCr;

    private String transTime;

    private String tranType;

    private String curType;

    private BigDecimal tranAmt;

    private BigDecimal curBalAfterTrans;

    private BigDecimal curBalBeforeTrans;

    private Long acctTransDtlSq;

    private Integer banalceStatus;

    private Integer offsetNum;

    private Integer realtimeStatus;

    private Integer realtimeOffsetNum;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSinoChemOrderId() {
        return sinoChemOrderId;
    }

    public void setSinoChemOrderId(String sinoChemOrderId) {
        this.sinoChemOrderId = sinoChemOrderId == null ? null : sinoChemOrderId.trim();
    }

    public String getSinoChemTradeId() {
        return sinoChemTradeId;
    }

    public void setSinoChemTradeId(String sinoChemTradeId) {
        this.sinoChemTradeId = sinoChemTradeId == null ? null : sinoChemTradeId.trim();
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

    public String getDrCr() {
        return drCr;
    }

    public void setDrCr(String drCr) {
        this.drCr = drCr == null ? null : drCr.trim();
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }

    public String getCurType() {
        return curType;
    }

    public void setCurType(String curType) {
        this.curType = curType == null ? null : curType.trim();
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getCurBalAfterTrans() {
        return curBalAfterTrans;
    }

    public void setCurBalAfterTrans(BigDecimal curBalAfterTrans) {
        this.curBalAfterTrans = curBalAfterTrans;
    }

    public BigDecimal getCurBalBeforeTrans() {
        return curBalBeforeTrans;
    }

    public void setCurBalBeforeTrans(BigDecimal curBalBeforeTrans) {
        this.curBalBeforeTrans = curBalBeforeTrans;
    }

    public Long getAcctTransDtlSq() {
        return acctTransDtlSq;
    }

    public void setAcctTransDtlSq(Long acctTransDtlSq) {
        this.acctTransDtlSq = acctTransDtlSq;
    }

    public Integer getBanalceStatus() {
        return banalceStatus;
    }

    public void setBanalceStatus(Integer banalceStatus) {
        this.banalceStatus = banalceStatus;
    }

    public Integer getOffsetNum() {
        return offsetNum;
    }

    public void setOffsetNum(Integer offsetNum) {
        this.offsetNum = offsetNum;
    }

    public Integer getRealtimeStatus() {
        return realtimeStatus;
    }

    public void setRealtimeStatus(Integer realtimeStatus) {
        this.realtimeStatus = realtimeStatus;
    }

    public Integer getRealtimeOffsetNum() {
        return realtimeOffsetNum;
    }

    public void setRealtimeOffsetNum(Integer realtimeOffsetNum) {
        this.realtimeOffsetNum = realtimeOffsetNum;
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