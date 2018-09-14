package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplaintsExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintsExample() {
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

        public Criteria andComplaintIdIsNull() {
            addCriterion("complaint_id is null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdIsNotNull() {
            addCriterion("complaint_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintIdEqualTo(Integer value) {
            addCriterion("complaint_id =", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotEqualTo(Integer value) {
            addCriterion("complaint_id <>", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdGreaterThan(Integer value) {
            addCriterion("complaint_id >", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complaint_id >=", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdLessThan(Integer value) {
            addCriterion("complaint_id <", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdLessThanOrEqualTo(Integer value) {
            addCriterion("complaint_id <=", value, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdIn(List<Integer> values) {
            addCriterion("complaint_id in", values, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotIn(List<Integer> values) {
            addCriterion("complaint_id not in", values, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdBetween(Integer value1, Integer value2) {
            addCriterion("complaint_id between", value1, value2, "complaintId");
            return (Criteria) this;
        }

        public Criteria andComplaintIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complaint_id not between", value1, value2, "complaintId");
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

        public Criteria andComplaintDateIsNull() {
            addCriterion("complaint_date is null");
            return (Criteria) this;
        }

        public Criteria andComplaintDateIsNotNull() {
            addCriterion("complaint_date is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintDateEqualTo(Date value) {
            addCriterion("complaint_date =", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateNotEqualTo(Date value) {
            addCriterion("complaint_date <>", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateGreaterThan(Date value) {
            addCriterion("complaint_date >", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateGreaterThanOrEqualTo(Date value) {
            addCriterion("complaint_date >=", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateLessThan(Date value) {
            addCriterion("complaint_date <", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateLessThanOrEqualTo(Date value) {
            addCriterion("complaint_date <=", value, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateIn(List<Date> values) {
            addCriterion("complaint_date in", values, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateNotIn(List<Date> values) {
            addCriterion("complaint_date not in", values, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateBetween(Date value1, Date value2) {
            addCriterion("complaint_date between", value1, value2, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintDateNotBetween(Date value1, Date value2) {
            addCriterion("complaint_date not between", value1, value2, "complaintDate");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNull() {
            addCriterion("complaint_content is null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIsNotNull() {
            addCriterion("complaint_content is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintContentEqualTo(String value) {
            addCriterion("complaint_content =", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotEqualTo(String value) {
            addCriterion("complaint_content <>", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThan(String value) {
            addCriterion("complaint_content >", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_content >=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThan(String value) {
            addCriterion("complaint_content <", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLessThanOrEqualTo(String value) {
            addCriterion("complaint_content <=", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentLike(String value) {
            addCriterion("complaint_content like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotLike(String value) {
            addCriterion("complaint_content not like", value, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentIn(List<String> values) {
            addCriterion("complaint_content in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotIn(List<String> values) {
            addCriterion("complaint_content not in", values, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentBetween(String value1, String value2) {
            addCriterion("complaint_content between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintContentNotBetween(String value1, String value2) {
            addCriterion("complaint_content not between", value1, value2, "complaintContent");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionIsNull() {
            addCriterion("complaint_condition is null");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionIsNotNull() {
            addCriterion("complaint_condition is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionEqualTo(Boolean value) {
            addCriterion("complaint_condition =", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionNotEqualTo(Boolean value) {
            addCriterion("complaint_condition <>", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionGreaterThan(Boolean value) {
            addCriterion("complaint_condition >", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("complaint_condition >=", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionLessThan(Boolean value) {
            addCriterion("complaint_condition <", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionLessThanOrEqualTo(Boolean value) {
            addCriterion("complaint_condition <=", value, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionIn(List<Boolean> values) {
            addCriterion("complaint_condition in", values, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionNotIn(List<Boolean> values) {
            addCriterion("complaint_condition not in", values, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionBetween(Boolean value1, Boolean value2) {
            addCriterion("complaint_condition between", value1, value2, "complaintCondition");
            return (Criteria) this;
        }

        public Criteria andComplaintConditionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("complaint_condition not between", value1, value2, "complaintCondition");
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