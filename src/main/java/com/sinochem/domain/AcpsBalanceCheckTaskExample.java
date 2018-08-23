package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcpsBalanceCheckTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcpsBalanceCheckTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdIsNull() {
            addCriterion("sino_chem_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdIsNotNull() {
            addCriterion("sino_chem_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdEqualTo(String value) {
            addCriterion("sino_chem_order_id =", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdNotEqualTo(String value) {
            addCriterion("sino_chem_order_id <>", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdGreaterThan(String value) {
            addCriterion("sino_chem_order_id >", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sino_chem_order_id >=", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdLessThan(String value) {
            addCriterion("sino_chem_order_id <", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sino_chem_order_id <=", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdLike(String value) {
            addCriterion("sino_chem_order_id like", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdNotLike(String value) {
            addCriterion("sino_chem_order_id not like", value, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdIn(List<String> values) {
            addCriterion("sino_chem_order_id in", values, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdNotIn(List<String> values) {
            addCriterion("sino_chem_order_id not in", values, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdBetween(String value1, String value2) {
            addCriterion("sino_chem_order_id between", value1, value2, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemOrderIdNotBetween(String value1, String value2) {
            addCriterion("sino_chem_order_id not between", value1, value2, "sinoChemOrderId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdIsNull() {
            addCriterion("sino_chem_trade_id is null");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdIsNotNull() {
            addCriterion("sino_chem_trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdEqualTo(String value) {
            addCriterion("sino_chem_trade_id =", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdNotEqualTo(String value) {
            addCriterion("sino_chem_trade_id <>", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdGreaterThan(String value) {
            addCriterion("sino_chem_trade_id >", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("sino_chem_trade_id >=", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdLessThan(String value) {
            addCriterion("sino_chem_trade_id <", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdLessThanOrEqualTo(String value) {
            addCriterion("sino_chem_trade_id <=", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdLike(String value) {
            addCriterion("sino_chem_trade_id like", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdNotLike(String value) {
            addCriterion("sino_chem_trade_id not like", value, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdIn(List<String> values) {
            addCriterion("sino_chem_trade_id in", values, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdNotIn(List<String> values) {
            addCriterion("sino_chem_trade_id not in", values, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdBetween(String value1, String value2) {
            addCriterion("sino_chem_trade_id between", value1, value2, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andSinoChemTradeIdNotBetween(String value1, String value2) {
            addCriterion("sino_chem_trade_id not between", value1, value2, "sinoChemTradeId");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIsNull() {
            addCriterion("mast_acct_num is null");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIsNotNull() {
            addCriterion("mast_acct_num is not null");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumEqualTo(String value) {
            addCriterion("mast_acct_num =", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotEqualTo(String value) {
            addCriterion("mast_acct_num <>", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumGreaterThan(String value) {
            addCriterion("mast_acct_num >", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumGreaterThanOrEqualTo(String value) {
            addCriterion("mast_acct_num >=", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLessThan(String value) {
            addCriterion("mast_acct_num <", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLessThanOrEqualTo(String value) {
            addCriterion("mast_acct_num <=", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumLike(String value) {
            addCriterion("mast_acct_num like", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotLike(String value) {
            addCriterion("mast_acct_num not like", value, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumIn(List<String> values) {
            addCriterion("mast_acct_num in", values, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotIn(List<String> values) {
            addCriterion("mast_acct_num not in", values, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumBetween(String value1, String value2) {
            addCriterion("mast_acct_num between", value1, value2, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andMastAcctNumNotBetween(String value1, String value2) {
            addCriterion("mast_acct_num not between", value1, value2, "mastAcctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumIsNull() {
            addCriterion("acct_num is null");
            return (Criteria) this;
        }

        public Criteria andAcctNumIsNotNull() {
            addCriterion("acct_num is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNumEqualTo(String value) {
            addCriterion("acct_num =", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotEqualTo(String value) {
            addCriterion("acct_num <>", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumGreaterThan(String value) {
            addCriterion("acct_num >", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumGreaterThanOrEqualTo(String value) {
            addCriterion("acct_num >=", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLessThan(String value) {
            addCriterion("acct_num <", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLessThanOrEqualTo(String value) {
            addCriterion("acct_num <=", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumLike(String value) {
            addCriterion("acct_num like", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotLike(String value) {
            addCriterion("acct_num not like", value, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumIn(List<String> values) {
            addCriterion("acct_num in", values, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotIn(List<String> values) {
            addCriterion("acct_num not in", values, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumBetween(String value1, String value2) {
            addCriterion("acct_num between", value1, value2, "acctNum");
            return (Criteria) this;
        }

        public Criteria andAcctNumNotBetween(String value1, String value2) {
            addCriterion("acct_num not between", value1, value2, "acctNum");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelIsNull() {
            addCriterion("gateway_channel is null");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelIsNotNull() {
            addCriterion("gateway_channel is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelEqualTo(String value) {
            addCriterion("gateway_channel =", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelNotEqualTo(String value) {
            addCriterion("gateway_channel <>", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelGreaterThan(String value) {
            addCriterion("gateway_channel >", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_channel >=", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelLessThan(String value) {
            addCriterion("gateway_channel <", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelLessThanOrEqualTo(String value) {
            addCriterion("gateway_channel <=", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelLike(String value) {
            addCriterion("gateway_channel like", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelNotLike(String value) {
            addCriterion("gateway_channel not like", value, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelIn(List<String> values) {
            addCriterion("gateway_channel in", values, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelNotIn(List<String> values) {
            addCriterion("gateway_channel not in", values, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelBetween(String value1, String value2) {
            addCriterion("gateway_channel between", value1, value2, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelNotBetween(String value1, String value2) {
            addCriterion("gateway_channel not between", value1, value2, "gatewayChannel");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeIsNull() {
            addCriterion("gateway_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeIsNotNull() {
            addCriterion("gateway_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeEqualTo(String value) {
            addCriterion("gateway_channel_code =", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeNotEqualTo(String value) {
            addCriterion("gateway_channel_code <>", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeGreaterThan(String value) {
            addCriterion("gateway_channel_code >", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gateway_channel_code >=", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeLessThan(String value) {
            addCriterion("gateway_channel_code <", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("gateway_channel_code <=", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeLike(String value) {
            addCriterion("gateway_channel_code like", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeNotLike(String value) {
            addCriterion("gateway_channel_code not like", value, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeIn(List<String> values) {
            addCriterion("gateway_channel_code in", values, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeNotIn(List<String> values) {
            addCriterion("gateway_channel_code not in", values, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeBetween(String value1, String value2) {
            addCriterion("gateway_channel_code between", value1, value2, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andGatewayChannelCodeNotBetween(String value1, String value2) {
            addCriterion("gateway_channel_code not between", value1, value2, "gatewayChannelCode");
            return (Criteria) this;
        }

        public Criteria andDrCrIsNull() {
            addCriterion("dr_cr is null");
            return (Criteria) this;
        }

        public Criteria andDrCrIsNotNull() {
            addCriterion("dr_cr is not null");
            return (Criteria) this;
        }

        public Criteria andDrCrEqualTo(String value) {
            addCriterion("dr_cr =", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrNotEqualTo(String value) {
            addCriterion("dr_cr <>", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrGreaterThan(String value) {
            addCriterion("dr_cr >", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrGreaterThanOrEqualTo(String value) {
            addCriterion("dr_cr >=", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrLessThan(String value) {
            addCriterion("dr_cr <", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrLessThanOrEqualTo(String value) {
            addCriterion("dr_cr <=", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrLike(String value) {
            addCriterion("dr_cr like", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrNotLike(String value) {
            addCriterion("dr_cr not like", value, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrIn(List<String> values) {
            addCriterion("dr_cr in", values, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrNotIn(List<String> values) {
            addCriterion("dr_cr not in", values, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrBetween(String value1, String value2) {
            addCriterion("dr_cr between", value1, value2, "drCr");
            return (Criteria) this;
        }

        public Criteria andDrCrNotBetween(String value1, String value2) {
            addCriterion("dr_cr not between", value1, value2, "drCr");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("trans_time is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(String value) {
            addCriterion("trans_time =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(String value) {
            addCriterion("trans_time <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(String value) {
            addCriterion("trans_time >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_time >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(String value) {
            addCriterion("trans_time <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(String value) {
            addCriterion("trans_time <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLike(String value) {
            addCriterion("trans_time like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotLike(String value) {
            addCriterion("trans_time not like", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<String> values) {
            addCriterion("trans_time in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<String> values) {
            addCriterion("trans_time not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(String value1, String value2) {
            addCriterion("trans_time between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(String value1, String value2) {
            addCriterion("trans_time not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNull() {
            addCriterion("tran_type is null");
            return (Criteria) this;
        }

        public Criteria andTranTypeIsNotNull() {
            addCriterion("tran_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranTypeEqualTo(String value) {
            addCriterion("tran_type =", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotEqualTo(String value) {
            addCriterion("tran_type <>", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThan(String value) {
            addCriterion("tran_type >", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tran_type >=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThan(String value) {
            addCriterion("tran_type <", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLessThanOrEqualTo(String value) {
            addCriterion("tran_type <=", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeLike(String value) {
            addCriterion("tran_type like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotLike(String value) {
            addCriterion("tran_type not like", value, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeIn(List<String> values) {
            addCriterion("tran_type in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotIn(List<String> values) {
            addCriterion("tran_type not in", values, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeBetween(String value1, String value2) {
            addCriterion("tran_type between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andTranTypeNotBetween(String value1, String value2) {
            addCriterion("tran_type not between", value1, value2, "tranType");
            return (Criteria) this;
        }

        public Criteria andCurTypeIsNull() {
            addCriterion("cur_type is null");
            return (Criteria) this;
        }

        public Criteria andCurTypeIsNotNull() {
            addCriterion("cur_type is not null");
            return (Criteria) this;
        }

        public Criteria andCurTypeEqualTo(String value) {
            addCriterion("cur_type =", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotEqualTo(String value) {
            addCriterion("cur_type <>", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeGreaterThan(String value) {
            addCriterion("cur_type >", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cur_type >=", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLessThan(String value) {
            addCriterion("cur_type <", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLessThanOrEqualTo(String value) {
            addCriterion("cur_type <=", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeLike(String value) {
            addCriterion("cur_type like", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotLike(String value) {
            addCriterion("cur_type not like", value, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeIn(List<String> values) {
            addCriterion("cur_type in", values, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotIn(List<String> values) {
            addCriterion("cur_type not in", values, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeBetween(String value1, String value2) {
            addCriterion("cur_type between", value1, value2, "curType");
            return (Criteria) this;
        }

        public Criteria andCurTypeNotBetween(String value1, String value2) {
            addCriterion("cur_type not between", value1, value2, "curType");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNull() {
            addCriterion("tran_amt is null");
            return (Criteria) this;
        }

        public Criteria andTranAmtIsNotNull() {
            addCriterion("tran_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTranAmtEqualTo(BigDecimal value) {
            addCriterion("tran_amt =", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotEqualTo(BigDecimal value) {
            addCriterion("tran_amt <>", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThan(BigDecimal value) {
            addCriterion("tran_amt >", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt >=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThan(BigDecimal value) {
            addCriterion("tran_amt <", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amt <=", value, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtIn(List<BigDecimal> values) {
            addCriterion("tran_amt in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotIn(List<BigDecimal> values) {
            addCriterion("tran_amt not in", values, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andTranAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amt not between", value1, value2, "tranAmt");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransIsNull() {
            addCriterion("cur_bal_after_trans is null");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransIsNotNull() {
            addCriterion("cur_bal_after_trans is not null");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransEqualTo(BigDecimal value) {
            addCriterion("cur_bal_after_trans =", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransNotEqualTo(BigDecimal value) {
            addCriterion("cur_bal_after_trans <>", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransGreaterThan(BigDecimal value) {
            addCriterion("cur_bal_after_trans >", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_bal_after_trans >=", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransLessThan(BigDecimal value) {
            addCriterion("cur_bal_after_trans <", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_bal_after_trans <=", value, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransIn(List<BigDecimal> values) {
            addCriterion("cur_bal_after_trans in", values, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransNotIn(List<BigDecimal> values) {
            addCriterion("cur_bal_after_trans not in", values, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_bal_after_trans between", value1, value2, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalAfterTransNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_bal_after_trans not between", value1, value2, "curBalAfterTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransIsNull() {
            addCriterion("cur_bal_before_trans is null");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransIsNotNull() {
            addCriterion("cur_bal_before_trans is not null");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransEqualTo(BigDecimal value) {
            addCriterion("cur_bal_before_trans =", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransNotEqualTo(BigDecimal value) {
            addCriterion("cur_bal_before_trans <>", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransGreaterThan(BigDecimal value) {
            addCriterion("cur_bal_before_trans >", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_bal_before_trans >=", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransLessThan(BigDecimal value) {
            addCriterion("cur_bal_before_trans <", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_bal_before_trans <=", value, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransIn(List<BigDecimal> values) {
            addCriterion("cur_bal_before_trans in", values, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransNotIn(List<BigDecimal> values) {
            addCriterion("cur_bal_before_trans not in", values, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_bal_before_trans between", value1, value2, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andCurBalBeforeTransNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_bal_before_trans not between", value1, value2, "curBalBeforeTrans");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqIsNull() {
            addCriterion("acct_trans_dtl_sq is null");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqIsNotNull() {
            addCriterion("acct_trans_dtl_sq is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqEqualTo(Long value) {
            addCriterion("acct_trans_dtl_sq =", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqNotEqualTo(Long value) {
            addCriterion("acct_trans_dtl_sq <>", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqGreaterThan(Long value) {
            addCriterion("acct_trans_dtl_sq >", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqGreaterThanOrEqualTo(Long value) {
            addCriterion("acct_trans_dtl_sq >=", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqLessThan(Long value) {
            addCriterion("acct_trans_dtl_sq <", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqLessThanOrEqualTo(Long value) {
            addCriterion("acct_trans_dtl_sq <=", value, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqIn(List<Long> values) {
            addCriterion("acct_trans_dtl_sq in", values, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqNotIn(List<Long> values) {
            addCriterion("acct_trans_dtl_sq not in", values, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqBetween(Long value1, Long value2) {
            addCriterion("acct_trans_dtl_sq between", value1, value2, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andAcctTransDtlSqNotBetween(Long value1, Long value2) {
            addCriterion("acct_trans_dtl_sq not between", value1, value2, "acctTransDtlSq");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusIsNull() {
            addCriterion("banalce_status is null");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusIsNotNull() {
            addCriterion("banalce_status is not null");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusEqualTo(Integer value) {
            addCriterion("banalce_status =", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusNotEqualTo(Integer value) {
            addCriterion("banalce_status <>", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusGreaterThan(Integer value) {
            addCriterion("banalce_status >", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("banalce_status >=", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusLessThan(Integer value) {
            addCriterion("banalce_status <", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusLessThanOrEqualTo(Integer value) {
            addCriterion("banalce_status <=", value, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusIn(List<Integer> values) {
            addCriterion("banalce_status in", values, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusNotIn(List<Integer> values) {
            addCriterion("banalce_status not in", values, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusBetween(Integer value1, Integer value2) {
            addCriterion("banalce_status between", value1, value2, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andBanalceStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("banalce_status not between", value1, value2, "banalceStatus");
            return (Criteria) this;
        }

        public Criteria andOffsetNumIsNull() {
            addCriterion("offset_num is null");
            return (Criteria) this;
        }

        public Criteria andOffsetNumIsNotNull() {
            addCriterion("offset_num is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetNumEqualTo(Integer value) {
            addCriterion("offset_num =", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumNotEqualTo(Integer value) {
            addCriterion("offset_num <>", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumGreaterThan(Integer value) {
            addCriterion("offset_num >", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("offset_num >=", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumLessThan(Integer value) {
            addCriterion("offset_num <", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumLessThanOrEqualTo(Integer value) {
            addCriterion("offset_num <=", value, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumIn(List<Integer> values) {
            addCriterion("offset_num in", values, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumNotIn(List<Integer> values) {
            addCriterion("offset_num not in", values, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumBetween(Integer value1, Integer value2) {
            addCriterion("offset_num between", value1, value2, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andOffsetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("offset_num not between", value1, value2, "offsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusIsNull() {
            addCriterion("realtime_status is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusIsNotNull() {
            addCriterion("realtime_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusEqualTo(Integer value) {
            addCriterion("realtime_status =", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusNotEqualTo(Integer value) {
            addCriterion("realtime_status <>", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusGreaterThan(Integer value) {
            addCriterion("realtime_status >", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("realtime_status >=", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusLessThan(Integer value) {
            addCriterion("realtime_status <", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("realtime_status <=", value, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusIn(List<Integer> values) {
            addCriterion("realtime_status in", values, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusNotIn(List<Integer> values) {
            addCriterion("realtime_status not in", values, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusBetween(Integer value1, Integer value2) {
            addCriterion("realtime_status between", value1, value2, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("realtime_status not between", value1, value2, "realtimeStatus");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumIsNull() {
            addCriterion("realtime_offset_num is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumIsNotNull() {
            addCriterion("realtime_offset_num is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumEqualTo(Integer value) {
            addCriterion("realtime_offset_num =", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumNotEqualTo(Integer value) {
            addCriterion("realtime_offset_num <>", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumGreaterThan(Integer value) {
            addCriterion("realtime_offset_num >", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("realtime_offset_num >=", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumLessThan(Integer value) {
            addCriterion("realtime_offset_num <", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumLessThanOrEqualTo(Integer value) {
            addCriterion("realtime_offset_num <=", value, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumIn(List<Integer> values) {
            addCriterion("realtime_offset_num in", values, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumNotIn(List<Integer> values) {
            addCriterion("realtime_offset_num not in", values, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumBetween(Integer value1, Integer value2) {
            addCriterion("realtime_offset_num between", value1, value2, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andRealtimeOffsetNumNotBetween(Integer value1, Integer value2) {
            addCriterion("realtime_offset_num not between", value1, value2, "realtimeOffsetNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}