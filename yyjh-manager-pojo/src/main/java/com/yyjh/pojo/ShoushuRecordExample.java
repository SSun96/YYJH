package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoushuRecordExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoushuRecordExample() {
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

        public Criteria andShoushuIdIsNull() {
            addCriterion("shoushu_id is null");
            return (Criteria) this;
        }

        public Criteria andShoushuIdIsNotNull() {
            addCriterion("shoushu_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoushuIdEqualTo(Integer value) {
            addCriterion("shoushu_id =", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdNotEqualTo(Integer value) {
            addCriterion("shoushu_id <>", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdGreaterThan(Integer value) {
            addCriterion("shoushu_id >", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoushu_id >=", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdLessThan(Integer value) {
            addCriterion("shoushu_id <", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdLessThanOrEqualTo(Integer value) {
            addCriterion("shoushu_id <=", value, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdIn(List<Integer> values) {
            addCriterion("shoushu_id in", values, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdNotIn(List<Integer> values) {
            addCriterion("shoushu_id not in", values, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdBetween(Integer value1, Integer value2) {
            addCriterion("shoushu_id between", value1, value2, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shoushu_id not between", value1, value2, "shoushuId");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeIsNull() {
            addCriterion("shoushu_type is null");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeIsNotNull() {
            addCriterion("shoushu_type is not null");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeEqualTo(String value) {
            addCriterion("shoushu_type =", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeNotEqualTo(String value) {
            addCriterion("shoushu_type <>", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeGreaterThan(String value) {
            addCriterion("shoushu_type >", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shoushu_type >=", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeLessThan(String value) {
            addCriterion("shoushu_type <", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeLessThanOrEqualTo(String value) {
            addCriterion("shoushu_type <=", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeLike(String value) {
            addCriterion("shoushu_type like", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeNotLike(String value) {
            addCriterion("shoushu_type not like", value, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeIn(List<String> values) {
            addCriterion("shoushu_type in", values, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeNotIn(List<String> values) {
            addCriterion("shoushu_type not in", values, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeBetween(String value1, String value2) {
            addCriterion("shoushu_type between", value1, value2, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTypeNotBetween(String value1, String value2) {
            addCriterion("shoushu_type not between", value1, value2, "shoushuType");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeIsNull() {
            addCriterion("shoushu_time is null");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeIsNotNull() {
            addCriterion("shoushu_time is not null");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeEqualTo(Date value) {
            addCriterion("shoushu_time =", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeNotEqualTo(Date value) {
            addCriterion("shoushu_time <>", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeGreaterThan(Date value) {
            addCriterion("shoushu_time >", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shoushu_time >=", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeLessThan(Date value) {
            addCriterion("shoushu_time <", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeLessThanOrEqualTo(Date value) {
            addCriterion("shoushu_time <=", value, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeIn(List<Date> values) {
            addCriterion("shoushu_time in", values, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeNotIn(List<Date> values) {
            addCriterion("shoushu_time not in", values, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeBetween(Date value1, Date value2) {
            addCriterion("shoushu_time between", value1, value2, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andShoushuTimeNotBetween(Date value1, Date value2) {
            addCriterion("shoushu_time not between", value1, value2, "shoushuTime");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeIsNull() {
            addCriterion("Before_judge is null");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeIsNotNull() {
            addCriterion("Before_judge is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeEqualTo(String value) {
            addCriterion("Before_judge =", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeNotEqualTo(String value) {
            addCriterion("Before_judge <>", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeGreaterThan(String value) {
            addCriterion("Before_judge >", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("Before_judge >=", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeLessThan(String value) {
            addCriterion("Before_judge <", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeLessThanOrEqualTo(String value) {
            addCriterion("Before_judge <=", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeLike(String value) {
            addCriterion("Before_judge like", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeNotLike(String value) {
            addCriterion("Before_judge not like", value, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeIn(List<String> values) {
            addCriterion("Before_judge in", values, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeNotIn(List<String> values) {
            addCriterion("Before_judge not in", values, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeBetween(String value1, String value2) {
            addCriterion("Before_judge between", value1, value2, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andBeforeJudgeNotBetween(String value1, String value2) {
            addCriterion("Before_judge not between", value1, value2, "beforeJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeIsNull() {
            addCriterion("After_judge is null");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeIsNotNull() {
            addCriterion("After_judge is not null");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeEqualTo(String value) {
            addCriterion("After_judge =", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeNotEqualTo(String value) {
            addCriterion("After_judge <>", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeGreaterThan(String value) {
            addCriterion("After_judge >", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("After_judge >=", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeLessThan(String value) {
            addCriterion("After_judge <", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeLessThanOrEqualTo(String value) {
            addCriterion("After_judge <=", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeLike(String value) {
            addCriterion("After_judge like", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeNotLike(String value) {
            addCriterion("After_judge not like", value, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeIn(List<String> values) {
            addCriterion("After_judge in", values, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeNotIn(List<String> values) {
            addCriterion("After_judge not in", values, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeBetween(String value1, String value2) {
            addCriterion("After_judge between", value1, value2, "afterJudge");
            return (Criteria) this;
        }

        public Criteria andAfterJudgeNotBetween(String value1, String value2) {
            addCriterion("After_judge not between", value1, value2, "afterJudge");
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