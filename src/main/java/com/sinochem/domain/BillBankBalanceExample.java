package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillBankBalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillBankBalanceExample() {
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

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNull() {
            addCriterion("bill_date is null");
            return (Criteria) this;
        }

        public Criteria andBillDateIsNotNull() {
            addCriterion("bill_date is not null");
            return (Criteria) this;
        }

        public Criteria andBillDateEqualTo(Date value) {
            addCriterion("bill_date =", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotEqualTo(Date value) {
            addCriterion("bill_date <>", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThan(Date value) {
            addCriterion("bill_date >", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_date >=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThan(Date value) {
            addCriterion("bill_date <", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateLessThanOrEqualTo(Date value) {
            addCriterion("bill_date <=", value, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateIn(List<Date> values) {
            addCriterion("bill_date in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotIn(List<Date> values) {
            addCriterion("bill_date not in", values, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateBetween(Date value1, Date value2) {
            addCriterion("bill_date between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andBillDateNotBetween(Date value1, Date value2) {
            addCriterion("bill_date not between", value1, value2, "billDate");
            return (Criteria) this;
        }

        public Criteria andTransSqIsNull() {
            addCriterion("trans_sq is null");
            return (Criteria) this;
        }

        public Criteria andTransSqIsNotNull() {
            addCriterion("trans_sq is not null");
            return (Criteria) this;
        }

        public Criteria andTransSqEqualTo(String value) {
            addCriterion("trans_sq =", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqNotEqualTo(String value) {
            addCriterion("trans_sq <>", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqGreaterThan(String value) {
            addCriterion("trans_sq >", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqGreaterThanOrEqualTo(String value) {
            addCriterion("trans_sq >=", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqLessThan(String value) {
            addCriterion("trans_sq <", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqLessThanOrEqualTo(String value) {
            addCriterion("trans_sq <=", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqLike(String value) {
            addCriterion("trans_sq like", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqNotLike(String value) {
            addCriterion("trans_sq not like", value, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqIn(List<String> values) {
            addCriterion("trans_sq in", values, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqNotIn(List<String> values) {
            addCriterion("trans_sq not in", values, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqBetween(String value1, String value2) {
            addCriterion("trans_sq between", value1, value2, "transSq");
            return (Criteria) this;
        }

        public Criteria andTransSqNotBetween(String value1, String value2) {
            addCriterion("trans_sq not between", value1, value2, "transSq");
            return (Criteria) this;
        }

        public Criteria andThirdCustidIsNull() {
            addCriterion("third_custId is null");
            return (Criteria) this;
        }

        public Criteria andThirdCustidIsNotNull() {
            addCriterion("third_custId is not null");
            return (Criteria) this;
        }

        public Criteria andThirdCustidEqualTo(String value) {
            addCriterion("third_custId =", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidNotEqualTo(String value) {
            addCriterion("third_custId <>", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidGreaterThan(String value) {
            addCriterion("third_custId >", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidGreaterThanOrEqualTo(String value) {
            addCriterion("third_custId >=", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidLessThan(String value) {
            addCriterion("third_custId <", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidLessThanOrEqualTo(String value) {
            addCriterion("third_custId <=", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidLike(String value) {
            addCriterion("third_custId like", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidNotLike(String value) {
            addCriterion("third_custId not like", value, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidIn(List<String> values) {
            addCriterion("third_custId in", values, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidNotIn(List<String> values) {
            addCriterion("third_custId not in", values, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidBetween(String value1, String value2) {
            addCriterion("third_custId between", value1, value2, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andThirdCustidNotBetween(String value1, String value2) {
            addCriterion("third_custId not between", value1, value2, "thirdCustid");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNull() {
            addCriterion("acct_id is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNotNull() {
            addCriterion("acct_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdEqualTo(String value) {
            addCriterion("acct_id =", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotEqualTo(String value) {
            addCriterion("acct_id <>", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThan(String value) {
            addCriterion("acct_id >", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThanOrEqualTo(String value) {
            addCriterion("acct_id >=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThan(String value) {
            addCriterion("acct_id <", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThanOrEqualTo(String value) {
            addCriterion("acct_id <=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLike(String value) {
            addCriterion("acct_id like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotLike(String value) {
            addCriterion("acct_id not like", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIn(List<String> values) {
            addCriterion("acct_id in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotIn(List<String> values) {
            addCriterion("acct_id not in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdBetween(String value1, String value2) {
            addCriterion("acct_id between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotBetween(String value1, String value2) {
            addCriterion("acct_id not between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andTranAmountIsNull() {
            addCriterion("tran_amount is null");
            return (Criteria) this;
        }

        public Criteria andTranAmountIsNotNull() {
            addCriterion("tran_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTranAmountEqualTo(BigDecimal value) {
            addCriterion("tran_amount =", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountNotEqualTo(BigDecimal value) {
            addCriterion("tran_amount <>", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountGreaterThan(BigDecimal value) {
            addCriterion("tran_amount >", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amount >=", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountLessThan(BigDecimal value) {
            addCriterion("tran_amount <", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tran_amount <=", value, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountIn(List<BigDecimal> values) {
            addCriterion("tran_amount in", values, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountNotIn(List<BigDecimal> values) {
            addCriterion("tran_amount not in", values, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amount between", value1, value2, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andTranAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tran_amount not between", value1, value2, "tranAmount");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNull() {
            addCriterion("opt_id is null");
            return (Criteria) this;
        }

        public Criteria andOptIdIsNotNull() {
            addCriterion("opt_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptIdEqualTo(Long value) {
            addCriterion("opt_id =", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotEqualTo(Long value) {
            addCriterion("opt_id <>", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThan(Long value) {
            addCriterion("opt_id >", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opt_id >=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThan(Long value) {
            addCriterion("opt_id <", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdLessThanOrEqualTo(Long value) {
            addCriterion("opt_id <=", value, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdIn(List<Long> values) {
            addCriterion("opt_id in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotIn(List<Long> values) {
            addCriterion("opt_id not in", values, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdBetween(Long value1, Long value2) {
            addCriterion("opt_id between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andOptIdNotBetween(Long value1, Long value2) {
            addCriterion("opt_id not between", value1, value2, "optId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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