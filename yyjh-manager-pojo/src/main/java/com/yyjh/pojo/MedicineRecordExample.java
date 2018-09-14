package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicineRecordExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineRecordExample() {
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

        public Criteria andMRecordIdIsNull() {
            addCriterion("m_record_id is null");
            return (Criteria) this;
        }

        public Criteria andMRecordIdIsNotNull() {
            addCriterion("m_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andMRecordIdEqualTo(Integer value) {
            addCriterion("m_record_id =", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotEqualTo(Integer value) {
            addCriterion("m_record_id <>", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdGreaterThan(Integer value) {
            addCriterion("m_record_id >", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_record_id >=", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdLessThan(Integer value) {
            addCriterion("m_record_id <", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_record_id <=", value, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdIn(List<Integer> values) {
            addCriterion("m_record_id in", values, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotIn(List<Integer> values) {
            addCriterion("m_record_id not in", values, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("m_record_id between", value1, value2, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_record_id not between", value1, value2, "mRecordId");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(String value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(String value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(String value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(String value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(String value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(String value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLike(String value) {
            addCriterion("m_type like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotLike(String value) {
            addCriterion("m_type not like", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<String> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<String> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(String value1, String value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(String value1, String value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMMethodIsNull() {
            addCriterion("m_method is null");
            return (Criteria) this;
        }

        public Criteria andMMethodIsNotNull() {
            addCriterion("m_method is not null");
            return (Criteria) this;
        }

        public Criteria andMMethodEqualTo(String value) {
            addCriterion("m_method =", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodNotEqualTo(String value) {
            addCriterion("m_method <>", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodGreaterThan(String value) {
            addCriterion("m_method >", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodGreaterThanOrEqualTo(String value) {
            addCriterion("m_method >=", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodLessThan(String value) {
            addCriterion("m_method <", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodLessThanOrEqualTo(String value) {
            addCriterion("m_method <=", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodLike(String value) {
            addCriterion("m_method like", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodNotLike(String value) {
            addCriterion("m_method not like", value, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodIn(List<String> values) {
            addCriterion("m_method in", values, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodNotIn(List<String> values) {
            addCriterion("m_method not in", values, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodBetween(String value1, String value2) {
            addCriterion("m_method between", value1, value2, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMMethodNotBetween(String value1, String value2) {
            addCriterion("m_method not between", value1, value2, "mMethod");
            return (Criteria) this;
        }

        public Criteria andMQuantityIsNull() {
            addCriterion("m_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMQuantityIsNotNull() {
            addCriterion("m_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMQuantityEqualTo(String value) {
            addCriterion("m_quantity =", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotEqualTo(String value) {
            addCriterion("m_quantity <>", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityGreaterThan(String value) {
            addCriterion("m_quantity >", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("m_quantity >=", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityLessThan(String value) {
            addCriterion("m_quantity <", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityLessThanOrEqualTo(String value) {
            addCriterion("m_quantity <=", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityLike(String value) {
            addCriterion("m_quantity like", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotLike(String value) {
            addCriterion("m_quantity not like", value, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityIn(List<String> values) {
            addCriterion("m_quantity in", values, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotIn(List<String> values) {
            addCriterion("m_quantity not in", values, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityBetween(String value1, String value2) {
            addCriterion("m_quantity between", value1, value2, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMQuantityNotBetween(String value1, String value2) {
            addCriterion("m_quantity not between", value1, value2, "mQuantity");
            return (Criteria) this;
        }

        public Criteria andMsTimeIsNull() {
            addCriterion("mS_time is null");
            return (Criteria) this;
        }

        public Criteria andMsTimeIsNotNull() {
            addCriterion("mS_time is not null");
            return (Criteria) this;
        }

        public Criteria andMsTimeEqualTo(Date value) {
            addCriterion("mS_time =", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeNotEqualTo(Date value) {
            addCriterion("mS_time <>", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeGreaterThan(Date value) {
            addCriterion("mS_time >", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mS_time >=", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeLessThan(Date value) {
            addCriterion("mS_time <", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeLessThanOrEqualTo(Date value) {
            addCriterion("mS_time <=", value, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeIn(List<Date> values) {
            addCriterion("mS_time in", values, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeNotIn(List<Date> values) {
            addCriterion("mS_time not in", values, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeBetween(Date value1, Date value2) {
            addCriterion("mS_time between", value1, value2, "msTime");
            return (Criteria) this;
        }

        public Criteria andMsTimeNotBetween(Date value1, Date value2) {
            addCriterion("mS_time not between", value1, value2, "msTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeIsNull() {
            addCriterion("mE_time is null");
            return (Criteria) this;
        }

        public Criteria andMeTimeIsNotNull() {
            addCriterion("mE_time is not null");
            return (Criteria) this;
        }

        public Criteria andMeTimeEqualTo(Date value) {
            addCriterion("mE_time =", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeNotEqualTo(Date value) {
            addCriterion("mE_time <>", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeGreaterThan(Date value) {
            addCriterion("mE_time >", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mE_time >=", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeLessThan(Date value) {
            addCriterion("mE_time <", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeLessThanOrEqualTo(Date value) {
            addCriterion("mE_time <=", value, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeIn(List<Date> values) {
            addCriterion("mE_time in", values, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeNotIn(List<Date> values) {
            addCriterion("mE_time not in", values, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeBetween(Date value1, Date value2) {
            addCriterion("mE_time between", value1, value2, "meTime");
            return (Criteria) this;
        }

        public Criteria andMeTimeNotBetween(Date value1, Date value2) {
            addCriterion("mE_time not between", value1, value2, "meTime");
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