package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderlistExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderConditionIsNull() {
            addCriterion("order_condition is null");
            return (Criteria) this;
        }

        public Criteria andOrderConditionIsNotNull() {
            addCriterion("order_condition is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConditionEqualTo(Boolean value) {
            addCriterion("order_condition =", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionNotEqualTo(Boolean value) {
            addCriterion("order_condition <>", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionGreaterThan(Boolean value) {
            addCriterion("order_condition >", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_condition >=", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionLessThan(Boolean value) {
            addCriterion("order_condition <", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionLessThanOrEqualTo(Boolean value) {
            addCriterion("order_condition <=", value, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionIn(List<Boolean> values) {
            addCriterion("order_condition in", values, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionNotIn(List<Boolean> values) {
            addCriterion("order_condition not in", values, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionBetween(Boolean value1, Boolean value2) {
            addCriterion("order_condition between", value1, value2, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderConditionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_condition not between", value1, value2, "orderCondition");
            return (Criteria) this;
        }

        public Criteria andOrderStypeIsNull() {
            addCriterion("order_stype is null");
            return (Criteria) this;
        }

        public Criteria andOrderStypeIsNotNull() {
            addCriterion("order_stype is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStypeEqualTo(String value) {
            addCriterion("order_stype =", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeNotEqualTo(String value) {
            addCriterion("order_stype <>", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeGreaterThan(String value) {
            addCriterion("order_stype >", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_stype >=", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeLessThan(String value) {
            addCriterion("order_stype <", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeLessThanOrEqualTo(String value) {
            addCriterion("order_stype <=", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeLike(String value) {
            addCriterion("order_stype like", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeNotLike(String value) {
            addCriterion("order_stype not like", value, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeIn(List<String> values) {
            addCriterion("order_stype in", values, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeNotIn(List<String> values) {
            addCriterion("order_stype not in", values, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeBetween(String value1, String value2) {
            addCriterion("order_stype between", value1, value2, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderStypeNotBetween(String value1, String value2) {
            addCriterion("order_stype not between", value1, value2, "orderStype");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceIsNull() {
            addCriterion("order_sprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceIsNotNull() {
            addCriterion("order_sprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceEqualTo(String value) {
            addCriterion("order_sprice =", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceNotEqualTo(String value) {
            addCriterion("order_sprice <>", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceGreaterThan(String value) {
            addCriterion("order_sprice >", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceGreaterThanOrEqualTo(String value) {
            addCriterion("order_sprice >=", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceLessThan(String value) {
            addCriterion("order_sprice <", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceLessThanOrEqualTo(String value) {
            addCriterion("order_sprice <=", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceLike(String value) {
            addCriterion("order_sprice like", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceNotLike(String value) {
            addCriterion("order_sprice not like", value, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceIn(List<String> values) {
            addCriterion("order_sprice in", values, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceNotIn(List<String> values) {
            addCriterion("order_sprice not in", values, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceBetween(String value1, String value2) {
            addCriterion("order_sprice between", value1, value2, "orderSprice");
            return (Criteria) this;
        }

        public Criteria andOrderSpriceNotBetween(String value1, String value2) {
            addCriterion("order_sprice not between", value1, value2, "orderSprice");
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