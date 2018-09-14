package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ComAdminExample implements Serializable{
	
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;
	
	public ComAdminExample() {
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

        public Criteria andComAdminIsNull() {
            addCriterion("cadmin is null");
            return (Criteria) this;
        }

        public Criteria andComAdminIsNotNull() {
            addCriterion("cadmin is not null");
            return (Criteria) this;
        }

        public Criteria andComAdminEqualTo(String value) {
            addCriterion("cadmin =", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminNotEqualTo(String value) {
            addCriterion("cadmin <>", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminGreaterThan(String value) {
            addCriterion("cadmin >", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminGreaterThanOrEqualTo(String value) {
            addCriterion("cadmin >=", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminLessThan(String value) {
            addCriterion("cadmin <", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminLessThanOrEqualTo(String value) {
            addCriterion("cadmin <=", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminLike(String value) {
            addCriterion("cadmin like", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminNotLike(String value) {
            addCriterion("cadmin not like", value, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminIn(List<String> values) {
            addCriterion("cadmin in", values, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminNotIn(List<String> values) {
            addCriterion("cadmin not in", values, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminBetween(String value1, String value2) {
            addCriterion("cadmin between", value1, value2, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdminNotBetween(String value1, String value2) {
            addCriterion("cadmin not between", value1, value2, "cadmin");
            return (Criteria) this;
        }

        public Criteria andComAdmPasswordIsNull() {
            addCriterion("ca_password is null");
            return (Criteria) this;
        }

        public Criteria andComAdmPasswordIsNotNull() {
            addCriterion("ca_password is not null");
            return (Criteria) this;
        }

        public Criteria andComAdmPasswordEqualTo(String value) {
            addCriterion("ca_password =", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotEqualTo(String value) {
            addCriterion("ca_password <>", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThan(String value) {
            addCriterion("ca_password >", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ca_password >=", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThan(String value) {
            addCriterion("ca_password <", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThanOrEqualTo(String value) {
            addCriterion("ca_password <=", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLike(String value) {
            addCriterion("ca_password like", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotLike(String value) {
            addCriterion("ca_password not like", value, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIn(List<String> values) {
            addCriterion("ca_password in", values, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotIn(List<String> values) {
            addCriterion("ca_password not in", values, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordBetween(String value1, String value2) {
            addCriterion("ca_password between", value1, value2, "caPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotBetween(String value1, String value2) {
            addCriterion("ca_password not between", value1, value2, "caPassword");
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