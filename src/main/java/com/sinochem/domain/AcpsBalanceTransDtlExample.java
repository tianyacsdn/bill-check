package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AcpsBalanceTransDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AcpsBalanceTransDtlExample() {
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

        public Criteria andTranRemarkIsNull() {
            addCriterion("tran_remark is null");
            return (Criteria) this;
        }

        public Criteria andTranRemarkIsNotNull() {
            addCriterion("tran_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTranRemarkEqualTo(String value) {
            addCriterion("tran_remark =", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkNotEqualTo(String value) {
            addCriterion("tran_remark <>", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkGreaterThan(String value) {
            addCriterion("tran_remark >", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tran_remark >=", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkLessThan(String value) {
            addCriterion("tran_remark <", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkLessThanOrEqualTo(String value) {
            addCriterion("tran_remark <=", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkLike(String value) {
            addCriterion("tran_remark like", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkNotLike(String value) {
            addCriterion("tran_remark not like", value, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkIn(List<String> values) {
            addCriterion("tran_remark in", values, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkNotIn(List<String> values) {
            addCriterion("tran_remark not in", values, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkBetween(String value1, String value2) {
            addCriterion("tran_remark between", value1, value2, "tranRemark");
            return (Criteria) this;
        }

        public Criteria andTranRemarkNotBetween(String value1, String value2) {
            addCriterion("tran_remark not between", value1, value2, "tranRemark");
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

        public Criteria andAvailableBalanceIsNull() {
            addCriterion("available_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIsNotNull() {
            addCriterion("available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceEqualTo(BigDecimal value) {
            addCriterion("available_balance =", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotEqualTo(BigDecimal value) {
            addCriterion("available_balance <>", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThan(BigDecimal value) {
            addCriterion("available_balance >", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance >=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThan(BigDecimal value) {
            addCriterion("available_balance <", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_balance <=", value, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceIn(List<BigDecimal> values) {
            addCriterion("available_balance in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotIn(List<BigDecimal> values) {
            addCriterion("available_balance not in", values, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_balance not between", value1, value2, "availableBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIsNull() {
            addCriterion("pending_payment_balance is null");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIsNotNull() {
            addCriterion("pending_payment_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance =", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance <>", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceGreaterThan(BigDecimal value) {
            addCriterion("pending_payment_balance >", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance >=", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceLessThan(BigDecimal value) {
            addCriterion("pending_payment_balance <", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pending_payment_balance <=", value, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceIn(List<BigDecimal> values) {
            addCriterion("pending_payment_balance in", values, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotIn(List<BigDecimal> values) {
            addCriterion("pending_payment_balance not in", values, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pending_payment_balance between", value1, value2, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andPendingPaymentBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pending_payment_balance not between", value1, value2, "pendingPaymentBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIsNull() {
            addCriterion("available_draw_balance is null");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIsNotNull() {
            addCriterion("available_draw_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance =", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance <>", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceGreaterThan(BigDecimal value) {
            addCriterion("available_draw_balance >", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance >=", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceLessThan(BigDecimal value) {
            addCriterion("available_draw_balance <", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_draw_balance <=", value, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceIn(List<BigDecimal> values) {
            addCriterion("available_draw_balance in", values, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotIn(List<BigDecimal> values) {
            addCriterion("available_draw_balance not in", values, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_draw_balance between", value1, value2, "availableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAvailableDrawBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_draw_balance not between", value1, value2, "availableDrawBalance");
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