package com.sinochem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillInternalBalanceMistakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillInternalBalanceMistakeExample() {
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

        public Criteria andAcctNameIsNull() {
            addCriterion("acct_name is null");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNotNull() {
            addCriterion("acct_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("acct_name =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotEqualTo(String value) {
            addCriterion("acct_name <>", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThan(String value) {
            addCriterion("acct_name >", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("acct_name >=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThan(String value) {
            addCriterion("acct_name <", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThanOrEqualTo(String value) {
            addCriterion("acct_name <=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLike(String value) {
            addCriterion("acct_name like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotLike(String value) {
            addCriterion("acct_name not like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIn(List<String> values) {
            addCriterion("acct_name in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotIn(List<String> values) {
            addCriterion("acct_name not in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameBetween(String value1, String value2) {
            addCriterion("acct_name between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotBetween(String value1, String value2) {
            addCriterion("acct_name not between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNull() {
            addCriterion("acct_type is null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIsNotNull() {
            addCriterion("acct_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcctTypeEqualTo(Integer value) {
            addCriterion("acct_type =", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotEqualTo(Integer value) {
            addCriterion("acct_type <>", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThan(Integer value) {
            addCriterion("acct_type >", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("acct_type >=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThan(Integer value) {
            addCriterion("acct_type <", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeLessThanOrEqualTo(Integer value) {
            addCriterion("acct_type <=", value, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeIn(List<Integer> values) {
            addCriterion("acct_type in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotIn(List<Integer> values) {
            addCriterion("acct_type not in", values, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeBetween(Integer value1, Integer value2) {
            addCriterion("acct_type between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andAcctTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("acct_type not between", value1, value2, "acctType");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceIsNull() {
            addCriterion("internal_total_balance is null");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceIsNotNull() {
            addCriterion("internal_total_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceEqualTo(BigDecimal value) {
            addCriterion("internal_total_balance =", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceNotEqualTo(BigDecimal value) {
            addCriterion("internal_total_balance <>", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceGreaterThan(BigDecimal value) {
            addCriterion("internal_total_balance >", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_total_balance >=", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceLessThan(BigDecimal value) {
            addCriterion("internal_total_balance <", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_total_balance <=", value, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceIn(List<BigDecimal> values) {
            addCriterion("internal_total_balance in", values, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceNotIn(List<BigDecimal> values) {
            addCriterion("internal_total_balance not in", values, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_total_balance between", value1, value2, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalTotalBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_total_balance not between", value1, value2, "internalTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceIsNull() {
            addCriterion("acps_total_balance is null");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceIsNotNull() {
            addCriterion("acps_total_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceEqualTo(BigDecimal value) {
            addCriterion("acps_total_balance =", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceNotEqualTo(BigDecimal value) {
            addCriterion("acps_total_balance <>", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceGreaterThan(BigDecimal value) {
            addCriterion("acps_total_balance >", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_total_balance >=", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceLessThan(BigDecimal value) {
            addCriterion("acps_total_balance <", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_total_balance <=", value, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceIn(List<BigDecimal> values) {
            addCriterion("acps_total_balance in", values, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceNotIn(List<BigDecimal> values) {
            addCriterion("acps_total_balance not in", values, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_total_balance between", value1, value2, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsTotalBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_total_balance not between", value1, value2, "acpsTotalBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceIsNull() {
            addCriterion("internal_available_balance is null");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceIsNotNull() {
            addCriterion("internal_available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceEqualTo(BigDecimal value) {
            addCriterion("internal_available_balance =", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceNotEqualTo(BigDecimal value) {
            addCriterion("internal_available_balance <>", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceGreaterThan(BigDecimal value) {
            addCriterion("internal_available_balance >", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_available_balance >=", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceLessThan(BigDecimal value) {
            addCriterion("internal_available_balance <", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_available_balance <=", value, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceIn(List<BigDecimal> values) {
            addCriterion("internal_available_balance in", values, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceNotIn(List<BigDecimal> values) {
            addCriterion("internal_available_balance not in", values, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_available_balance between", value1, value2, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_available_balance not between", value1, value2, "internalAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceIsNull() {
            addCriterion("acps_available_balance is null");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceIsNotNull() {
            addCriterion("acps_available_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceEqualTo(BigDecimal value) {
            addCriterion("acps_available_balance =", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceNotEqualTo(BigDecimal value) {
            addCriterion("acps_available_balance <>", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceGreaterThan(BigDecimal value) {
            addCriterion("acps_available_balance >", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_available_balance >=", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceLessThan(BigDecimal value) {
            addCriterion("acps_available_balance <", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_available_balance <=", value, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceIn(List<BigDecimal> values) {
            addCriterion("acps_available_balance in", values, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceNotIn(List<BigDecimal> values) {
            addCriterion("acps_available_balance not in", values, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_available_balance between", value1, value2, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_available_balance not between", value1, value2, "acpsAvailableBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceIsNull() {
            addCriterion("internal_available_draw_balance is null");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceIsNotNull() {
            addCriterion("internal_available_draw_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceEqualTo(BigDecimal value) {
            addCriterion("internal_available_draw_balance =", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceNotEqualTo(BigDecimal value) {
            addCriterion("internal_available_draw_balance <>", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceGreaterThan(BigDecimal value) {
            addCriterion("internal_available_draw_balance >", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_available_draw_balance >=", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceLessThan(BigDecimal value) {
            addCriterion("internal_available_draw_balance <", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_available_draw_balance <=", value, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceIn(List<BigDecimal> values) {
            addCriterion("internal_available_draw_balance in", values, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceNotIn(List<BigDecimal> values) {
            addCriterion("internal_available_draw_balance not in", values, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_available_draw_balance between", value1, value2, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalAvailableDrawBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_available_draw_balance not between", value1, value2, "internalAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceIsNull() {
            addCriterion("acps_available_draw_balance is null");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceIsNotNull() {
            addCriterion("acps_available_draw_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceEqualTo(BigDecimal value) {
            addCriterion("acps_available_draw_balance =", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceNotEqualTo(BigDecimal value) {
            addCriterion("acps_available_draw_balance <>", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceGreaterThan(BigDecimal value) {
            addCriterion("acps_available_draw_balance >", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_available_draw_balance >=", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceLessThan(BigDecimal value) {
            addCriterion("acps_available_draw_balance <", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_available_draw_balance <=", value, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceIn(List<BigDecimal> values) {
            addCriterion("acps_available_draw_balance in", values, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceNotIn(List<BigDecimal> values) {
            addCriterion("acps_available_draw_balance not in", values, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_available_draw_balance between", value1, value2, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsAvailableDrawBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_available_draw_balance not between", value1, value2, "acpsAvailableDrawBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceIsNull() {
            addCriterion("internal_frozen_balance is null");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceIsNotNull() {
            addCriterion("internal_frozen_balance is not null");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceEqualTo(BigDecimal value) {
            addCriterion("internal_frozen_balance =", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceNotEqualTo(BigDecimal value) {
            addCriterion("internal_frozen_balance <>", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceGreaterThan(BigDecimal value) {
            addCriterion("internal_frozen_balance >", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_frozen_balance >=", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceLessThan(BigDecimal value) {
            addCriterion("internal_frozen_balance <", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("internal_frozen_balance <=", value, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceIn(List<BigDecimal> values) {
            addCriterion("internal_frozen_balance in", values, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceNotIn(List<BigDecimal> values) {
            addCriterion("internal_frozen_balance not in", values, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_frozen_balance between", value1, value2, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andInternalFrozenBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("internal_frozen_balance not between", value1, value2, "internalFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceIsNull() {
            addCriterion("acps_frozen_balance is null");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceIsNotNull() {
            addCriterion("acps_frozen_balance is not null");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceEqualTo(BigDecimal value) {
            addCriterion("acps_frozen_balance =", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceNotEqualTo(BigDecimal value) {
            addCriterion("acps_frozen_balance <>", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceGreaterThan(BigDecimal value) {
            addCriterion("acps_frozen_balance >", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_frozen_balance >=", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceLessThan(BigDecimal value) {
            addCriterion("acps_frozen_balance <", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("acps_frozen_balance <=", value, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceIn(List<BigDecimal> values) {
            addCriterion("acps_frozen_balance in", values, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceNotIn(List<BigDecimal> values) {
            addCriterion("acps_frozen_balance not in", values, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_frozen_balance between", value1, value2, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andAcpsFrozenBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("acps_frozen_balance not between", value1, value2, "acpsFrozenBalance");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
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