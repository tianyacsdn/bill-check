package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class AcpsBalanceTransDtl {
    private Long id;

    private String sinoChemTradeId;

    private String sinoChemOrderId;

    private Long custId;

    private String tranRemark;

    private BigDecimal tranAmt;

    private BigDecimal availableBalance;

    private BigDecimal pendingPaymentBalance;

    private BigDecimal availableDrawBalance;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String tranType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSinoChemTradeId() {
        return sinoChemTradeId;
    }

    public void setSinoChemTradeId(String sinoChemTradeId) {
        this.sinoChemTradeId = sinoChemTradeId == null ? null : sinoChemTradeId.trim();
    }

    public String getSinoChemOrderId() {
        return sinoChemOrderId;
    }

    public void setSinoChemOrderId(String sinoChemOrderId) {
        this.sinoChemOrderId = sinoChemOrderId == null ? null : sinoChemOrderId.trim();
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getTranRemark() {
        return tranRemark;
    }

    public void setTranRemark(String tranRemark) {
        this.tranRemark = tranRemark == null ? null : tranRemark.trim();
    }

    public BigDecimal getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(BigDecimal tranAmt) {
        this.tranAmt = tranAmt;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getPendingPaymentBalance() {
        return pendingPaymentBalance;
    }

    public void setPendingPaymentBalance(BigDecimal pendingPaymentBalance) {
        this.pendingPaymentBalance = pendingPaymentBalance;
    }

    public BigDecimal getAvailableDrawBalance() {
        return availableDrawBalance;
    }

    public void setAvailableDrawBalance(BigDecimal availableDrawBalance) {
        this.availableDrawBalance = availableDrawBalance;
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

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType == null ? null : tranType.trim();
    }
}