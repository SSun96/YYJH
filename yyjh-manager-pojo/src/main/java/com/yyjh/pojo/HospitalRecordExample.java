package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalRecordExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalRecordExample() {
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

        public Criteria andHRecordIdIsNull() {
            addCriterion("h_record_id is null");
            return (Criteria) this;
        }

        public Criteria andHRecordIdIsNotNull() {
            addCriterion("h_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andHRecordIdEqualTo(Integer value) {
            addCriterion("h_record_id =", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdNotEqualTo(Integer value) {
            addCriterion("h_record_id <>", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdGreaterThan(Integer value) {
            addCriterion("h_record_id >", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_record_id >=", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdLessThan(Integer value) {
            addCriterion("h_record_id <", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_record_id <=", value, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdIn(List<Integer> values) {
            addCriterion("h_record_id in", values, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdNotIn(List<Integer> values) {
            addCriterion("h_record_id not in", values, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("h_record_id between", value1, value2, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_record_id not between", value1, value2, "hRecordId");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIsNull() {
            addCriterion("h_department is null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIsNotNull() {
            addCriterion("h_department is not null");
            return (Criteria) this;
        }

        public Criteria andHDepartmentEqualTo(String value) {
            addCriterion("h_department =", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotEqualTo(String value) {
            addCriterion("h_department <>", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentGreaterThan(String value) {
            addCriterion("h_department >", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("h_department >=", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLessThan(String value) {
            addCriterion("h_department <", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLessThanOrEqualTo(String value) {
            addCriterion("h_department <=", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentLike(String value) {
            addCriterion("h_department like", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotLike(String value) {
            addCriterion("h_department not like", value, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentIn(List<String> values) {
            addCriterion("h_department in", values, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotIn(List<String> values) {
            addCriterion("h_department not in", values, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentBetween(String value1, String value2) {
            addCriterion("h_department between", value1, value2, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andHDepartmentNotBetween(String value1, String value2) {
            addCriterion("h_department not between", value1, value2, "hDepartment");
            return (Criteria) this;
        }

        public Criteria andInpatientwardIsNull() {
            addCriterion("inpatientWard is null");
            return (Criteria) this;
        }

        public Criteria andInpatientwardIsNotNull() {
            addCriterion("inpatientWard is not null");
            return (Criteria) this;
        }

        public Criteria andInpatientwardEqualTo(String value) {
            addCriterion("inpatientWard =", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardNotEqualTo(String value) {
            addCriterion("inpatientWard <>", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardGreaterThan(String value) {
            addCriterion("inpatientWard >", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardGreaterThanOrEqualTo(String value) {
            addCriterion("inpatientWard >=", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardLessThan(String value) {
            addCriterion("inpatientWard <", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardLessThanOrEqualTo(String value) {
            addCriterion("inpatientWard <=", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardLike(String value) {
            addCriterion("inpatientWard like", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardNotLike(String value) {
            addCriterion("inpatientWard not like", value, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardIn(List<String> values) {
            addCriterion("inpatientWard in", values, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardNotIn(List<String> values) {
            addCriterion("inpatientWard not in", values, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardBetween(String value1, String value2) {
            addCriterion("inpatientWard between", value1, value2, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andInpatientwardNotBetween(String value1, String value2) {
            addCriterion("inpatientWard not between", value1, value2, "inpatientward");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNull() {
            addCriterion("bed_id is null");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNotNull() {
            addCriterion("bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBedIdEqualTo(Integer value) {
            addCriterion("bed_id =", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotEqualTo(Integer value) {
            addCriterion("bed_id <>", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThan(Integer value) {
            addCriterion("bed_id >", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_id >=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThan(Integer value) {
            addCriterion("bed_id <", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThanOrEqualTo(Integer value) {
            addCriterion("bed_id <=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdIn(List<Integer> values) {
            addCriterion("bed_id in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotIn(List<Integer> values) {
            addCriterion("bed_id not in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdBetween(Integer value1, Integer value2) {
            addCriterion("bed_id between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_id not between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andInhospitalidIsNull() {
            addCriterion("inhospitalID is null");
            return (Criteria) this;
        }

        public Criteria andInhospitalidIsNotNull() {
            addCriterion("inhospitalID is not null");
            return (Criteria) this;
        }

        public Criteria andInhospitalidEqualTo(Integer value) {
            addCriterion("inhospitalID =", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidNotEqualTo(Integer value) {
            addCriterion("inhospitalID <>", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidGreaterThan(Integer value) {
            addCriterion("inhospitalID >", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inhospitalID >=", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidLessThan(Integer value) {
            addCriterion("inhospitalID <", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidLessThanOrEqualTo(Integer value) {
            addCriterion("inhospitalID <=", value, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidIn(List<Integer> values) {
            addCriterion("inhospitalID in", values, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidNotIn(List<Integer> values) {
            addCriterion("inhospitalID not in", values, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidBetween(Integer value1, Integer value2) {
            addCriterion("inhospitalID between", value1, value2, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andInhospitalidNotBetween(Integer value1, Integer value2) {
            addCriterion("inhospitalID not between", value1, value2, "inhospitalid");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNull() {
            addCriterion("enterTime is null");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNotNull() {
            addCriterion("enterTime is not null");
            return (Criteria) this;
        }

        public Criteria andEntertimeEqualTo(Date value) {
            addCriterion("enterTime =", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotEqualTo(Date value) {
            addCriterion("enterTime <>", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThan(Date value) {
            addCriterion("enterTime >", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enterTime >=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThan(Date value) {
            addCriterion("enterTime <", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThanOrEqualTo(Date value) {
            addCriterion("enterTime <=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeIn(List<Date> values) {
            addCriterion("enterTime in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotIn(List<Date> values) {
            addCriterion("enterTime not in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeBetween(Date value1, Date value2) {
            addCriterion("enterTime between", value1, value2, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotBetween(Date value1, Date value2) {
            addCriterion("enterTime not between", value1, value2, "entertime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNull() {
            addCriterion("leaveTime is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIsNotNull() {
            addCriterion("leaveTime is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeEqualTo(Date value) {
            addCriterion("leaveTime =", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotEqualTo(Date value) {
            addCriterion("leaveTime <>", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThan(Date value) {
            addCriterion("leaveTime >", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leaveTime >=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThan(Date value) {
            addCriterion("leaveTime <", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeLessThanOrEqualTo(Date value) {
            addCriterion("leaveTime <=", value, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeIn(List<Date> values) {
            addCriterion("leaveTime in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotIn(List<Date> values) {
            addCriterion("leaveTime not in", values, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeBetween(Date value1, Date value2) {
            addCriterion("leaveTime between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andLeavetimeNotBetween(Date value1, Date value2) {
            addCriterion("leaveTime not between", value1, value2, "leavetime");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameIsNull() {
            addCriterion("HospitalDoctorname is null");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameIsNotNull() {
            addCriterion("HospitalDoctorname is not null");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameEqualTo(String value) {
            addCriterion("HospitalDoctorname =", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameNotEqualTo(String value) {
            addCriterion("HospitalDoctorname <>", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameGreaterThan(String value) {
            addCriterion("HospitalDoctorname >", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("HospitalDoctorname >=", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameLessThan(String value) {
            addCriterion("HospitalDoctorname <", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameLessThanOrEqualTo(String value) {
            addCriterion("HospitalDoctorname <=", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameLike(String value) {
            addCriterion("HospitalDoctorname like", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameNotLike(String value) {
            addCriterion("HospitalDoctorname not like", value, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameIn(List<String> values) {
            addCriterion("HospitalDoctorname in", values, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameNotIn(List<String> values) {
            addCriterion("HospitalDoctorname not in", values, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameBetween(String value1, String value2) {
            addCriterion("HospitalDoctorname between", value1, value2, "hospitaldoctorname");
            return (Criteria) this;
        }

        public Criteria andHospitaldoctornameNotBetween(String value1, String value2) {
            addCriterion("HospitalDoctorname not between", value1, value2, "hospitaldoctorname");
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