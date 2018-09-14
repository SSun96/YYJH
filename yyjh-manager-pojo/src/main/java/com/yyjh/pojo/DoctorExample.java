package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DoctorExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDHospitalIsNull() {
            addCriterion("d_hospital is null");
            return (Criteria) this;
        }

        public Criteria andDHospitalIsNotNull() {
            addCriterion("d_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andDHospitalEqualTo(String value) {
            addCriterion("d_hospital =", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalNotEqualTo(String value) {
            addCriterion("d_hospital <>", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalGreaterThan(String value) {
            addCriterion("d_hospital >", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("d_hospital >=", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalLessThan(String value) {
            addCriterion("d_hospital <", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalLessThanOrEqualTo(String value) {
            addCriterion("d_hospital <=", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalLike(String value) {
            addCriterion("d_hospital like", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalNotLike(String value) {
            addCriterion("d_hospital not like", value, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalIn(List<String> values) {
            addCriterion("d_hospital in", values, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalNotIn(List<String> values) {
            addCriterion("d_hospital not in", values, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalBetween(String value1, String value2) {
            addCriterion("d_hospital between", value1, value2, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDHospitalNotBetween(String value1, String value2) {
            addCriterion("d_hospital not between", value1, value2, "dHospital");
            return (Criteria) this;
        }

        public Criteria andDDepartmentIsNull() {
            addCriterion("d_department is null");
            return (Criteria) this;
        }

        public Criteria andDDepartmentIsNotNull() {
            addCriterion("d_department is not null");
            return (Criteria) this;
        }

        public Criteria andDDepartmentEqualTo(String value) {
            addCriterion("d_department =", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentNotEqualTo(String value) {
            addCriterion("d_department <>", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentGreaterThan(String value) {
            addCriterion("d_department >", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("d_department >=", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentLessThan(String value) {
            addCriterion("d_department <", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentLessThanOrEqualTo(String value) {
            addCriterion("d_department <=", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentLike(String value) {
            addCriterion("d_department like", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentNotLike(String value) {
            addCriterion("d_department not like", value, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentIn(List<String> values) {
            addCriterion("d_department in", values, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentNotIn(List<String> values) {
            addCriterion("d_department not in", values, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentBetween(String value1, String value2) {
            addCriterion("d_department between", value1, value2, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDDepartmentNotBetween(String value1, String value2) {
            addCriterion("d_department not between", value1, value2, "dDepartment");
            return (Criteria) this;
        }

        public Criteria andDIntroductionIsNull() {
            addCriterion("d_introduction is null");
            return (Criteria) this;
        }

        public Criteria andDIntroductionIsNotNull() {
            addCriterion("d_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andDIntroductionEqualTo(String value) {
            addCriterion("d_introduction =", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionNotEqualTo(String value) {
            addCriterion("d_introduction <>", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionGreaterThan(String value) {
            addCriterion("d_introduction >", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("d_introduction >=", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionLessThan(String value) {
            addCriterion("d_introduction <", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionLessThanOrEqualTo(String value) {
            addCriterion("d_introduction <=", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionLike(String value) {
            addCriterion("d_introduction like", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionNotLike(String value) {
            addCriterion("d_introduction not like", value, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionIn(List<String> values) {
            addCriterion("d_introduction in", values, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionNotIn(List<String> values) {
            addCriterion("d_introduction not in", values, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionBetween(String value1, String value2) {
            addCriterion("d_introduction between", value1, value2, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIntroductionNotBetween(String value1, String value2) {
            addCriterion("d_introduction not between", value1, value2, "dIntroduction");
            return (Criteria) this;
        }

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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