package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OldmanInformationExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldmanInformationExample() {
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

        public Criteria andXueyaIsNull() {
            addCriterion("xueya is null");
            return (Criteria) this;
        }

        public Criteria andXueyaIsNotNull() {
            addCriterion("xueya is not null");
            return (Criteria) this;
        }

        public Criteria andXueyaEqualTo(String value) {
            addCriterion("xueya =", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaNotEqualTo(String value) {
            addCriterion("xueya <>", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaGreaterThan(String value) {
            addCriterion("xueya >", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaGreaterThanOrEqualTo(String value) {
            addCriterion("xueya >=", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaLessThan(String value) {
            addCriterion("xueya <", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaLessThanOrEqualTo(String value) {
            addCriterion("xueya <=", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaLike(String value) {
            addCriterion("xueya like", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaNotLike(String value) {
            addCriterion("xueya not like", value, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaIn(List<String> values) {
            addCriterion("xueya in", values, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaNotIn(List<String> values) {
            addCriterion("xueya not in", values, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaBetween(String value1, String value2) {
            addCriterion("xueya between", value1, value2, "xueya");
            return (Criteria) this;
        }

        public Criteria andXueyaNotBetween(String value1, String value2) {
            addCriterion("xueya not between", value1, value2, "xueya");
            return (Criteria) this;
        }

        public Criteria andXuetangIsNull() {
            addCriterion("xuetang is null");
            return (Criteria) this;
        }

        public Criteria andXuetangIsNotNull() {
            addCriterion("xuetang is not null");
            return (Criteria) this;
        }

        public Criteria andXuetangEqualTo(String value) {
            addCriterion("xuetang =", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangNotEqualTo(String value) {
            addCriterion("xuetang <>", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangGreaterThan(String value) {
            addCriterion("xuetang >", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangGreaterThanOrEqualTo(String value) {
            addCriterion("xuetang >=", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangLessThan(String value) {
            addCriterion("xuetang <", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangLessThanOrEqualTo(String value) {
            addCriterion("xuetang <=", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangLike(String value) {
            addCriterion("xuetang like", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangNotLike(String value) {
            addCriterion("xuetang not like", value, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangIn(List<String> values) {
            addCriterion("xuetang in", values, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangNotIn(List<String> values) {
            addCriterion("xuetang not in", values, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangBetween(String value1, String value2) {
            addCriterion("xuetang between", value1, value2, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXuetangNotBetween(String value1, String value2) {
            addCriterion("xuetang not between", value1, value2, "xuetang");
            return (Criteria) this;
        }

        public Criteria andXueyangIsNull() {
            addCriterion("xueyang is null");
            return (Criteria) this;
        }

        public Criteria andXueyangIsNotNull() {
            addCriterion("xueyang is not null");
            return (Criteria) this;
        }

        public Criteria andXueyangEqualTo(String value) {
            addCriterion("xueyang =", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangNotEqualTo(String value) {
            addCriterion("xueyang <>", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangGreaterThan(String value) {
            addCriterion("xueyang >", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangGreaterThanOrEqualTo(String value) {
            addCriterion("xueyang >=", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangLessThan(String value) {
            addCriterion("xueyang <", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangLessThanOrEqualTo(String value) {
            addCriterion("xueyang <=", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangLike(String value) {
            addCriterion("xueyang like", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangNotLike(String value) {
            addCriterion("xueyang not like", value, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangIn(List<String> values) {
            addCriterion("xueyang in", values, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangNotIn(List<String> values) {
            addCriterion("xueyang not in", values, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangBetween(String value1, String value2) {
            addCriterion("xueyang between", value1, value2, "xueyang");
            return (Criteria) this;
        }

        public Criteria andXueyangNotBetween(String value1, String value2) {
            addCriterion("xueyang not between", value1, value2, "xueyang");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongIsNull() {
            addCriterion("shengaotizhong is null");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongIsNotNull() {
            addCriterion("shengaotizhong is not null");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongEqualTo(String value) {
            addCriterion("shengaotizhong =", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongNotEqualTo(String value) {
            addCriterion("shengaotizhong <>", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongGreaterThan(String value) {
            addCriterion("shengaotizhong >", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongGreaterThanOrEqualTo(String value) {
            addCriterion("shengaotizhong >=", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongLessThan(String value) {
            addCriterion("shengaotizhong <", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongLessThanOrEqualTo(String value) {
            addCriterion("shengaotizhong <=", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongLike(String value) {
            addCriterion("shengaotizhong like", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongNotLike(String value) {
            addCriterion("shengaotizhong not like", value, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongIn(List<String> values) {
            addCriterion("shengaotizhong in", values, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongNotIn(List<String> values) {
            addCriterion("shengaotizhong not in", values, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongBetween(String value1, String value2) {
            addCriterion("shengaotizhong between", value1, value2, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andShengaotizhongNotBetween(String value1, String value2) {
            addCriterion("shengaotizhong not between", value1, value2, "shengaotizhong");
            return (Criteria) this;
        }

        public Criteria andZhifanglvIsNull() {
            addCriterion("zhifanglv is null");
            return (Criteria) this;
        }

        public Criteria andZhifanglvIsNotNull() {
            addCriterion("zhifanglv is not null");
            return (Criteria) this;
        }

        public Criteria andZhifanglvEqualTo(String value) {
            addCriterion("zhifanglv =", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvNotEqualTo(String value) {
            addCriterion("zhifanglv <>", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvGreaterThan(String value) {
            addCriterion("zhifanglv >", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvGreaterThanOrEqualTo(String value) {
            addCriterion("zhifanglv >=", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvLessThan(String value) {
            addCriterion("zhifanglv <", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvLessThanOrEqualTo(String value) {
            addCriterion("zhifanglv <=", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvLike(String value) {
            addCriterion("zhifanglv like", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvNotLike(String value) {
            addCriterion("zhifanglv not like", value, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvIn(List<String> values) {
            addCriterion("zhifanglv in", values, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvNotIn(List<String> values) {
            addCriterion("zhifanglv not in", values, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvBetween(String value1, String value2) {
            addCriterion("zhifanglv between", value1, value2, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andZhifanglvNotBetween(String value1, String value2) {
            addCriterion("zhifanglv not between", value1, value2, "zhifanglv");
            return (Criteria) this;
        }

        public Criteria andXinlvIsNull() {
            addCriterion("xinlv is null");
            return (Criteria) this;
        }

        public Criteria andXinlvIsNotNull() {
            addCriterion("xinlv is not null");
            return (Criteria) this;
        }

        public Criteria andXinlvEqualTo(String value) {
            addCriterion("xinlv =", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvNotEqualTo(String value) {
            addCriterion("xinlv <>", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvGreaterThan(String value) {
            addCriterion("xinlv >", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvGreaterThanOrEqualTo(String value) {
            addCriterion("xinlv >=", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvLessThan(String value) {
            addCriterion("xinlv <", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvLessThanOrEqualTo(String value) {
            addCriterion("xinlv <=", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvLike(String value) {
            addCriterion("xinlv like", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvNotLike(String value) {
            addCriterion("xinlv not like", value, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvIn(List<String> values) {
            addCriterion("xinlv in", values, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvNotIn(List<String> values) {
            addCriterion("xinlv not in", values, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvBetween(String value1, String value2) {
            addCriterion("xinlv between", value1, value2, "xinlv");
            return (Criteria) this;
        }

        public Criteria andXinlvNotBetween(String value1, String value2) {
            addCriterion("xinlv not between", value1, value2, "xinlv");
            return (Criteria) this;
        }

        public Criteria andTiwenIsNull() {
            addCriterion("tiwen is null");
            return (Criteria) this;
        }

        public Criteria andTiwenIsNotNull() {
            addCriterion("tiwen is not null");
            return (Criteria) this;
        }

        public Criteria andTiwenEqualTo(String value) {
            addCriterion("tiwen =", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenNotEqualTo(String value) {
            addCriterion("tiwen <>", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenGreaterThan(String value) {
            addCriterion("tiwen >", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenGreaterThanOrEqualTo(String value) {
            addCriterion("tiwen >=", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenLessThan(String value) {
            addCriterion("tiwen <", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenLessThanOrEqualTo(String value) {
            addCriterion("tiwen <=", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenLike(String value) {
            addCriterion("tiwen like", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenNotLike(String value) {
            addCriterion("tiwen not like", value, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenIn(List<String> values) {
            addCriterion("tiwen in", values, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenNotIn(List<String> values) {
            addCriterion("tiwen not in", values, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenBetween(String value1, String value2) {
            addCriterion("tiwen between", value1, value2, "tiwen");
            return (Criteria) this;
        }

        public Criteria andTiwenNotBetween(String value1, String value2) {
            addCriterion("tiwen not between", value1, value2, "tiwen");
            return (Criteria) this;
        }

        public Criteria andXuezhiIsNull() {
            addCriterion("xuezhi is null");
            return (Criteria) this;
        }

        public Criteria andXuezhiIsNotNull() {
            addCriterion("xuezhi is not null");
            return (Criteria) this;
        }

        public Criteria andXuezhiEqualTo(String value) {
            addCriterion("xuezhi =", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotEqualTo(String value) {
            addCriterion("xuezhi <>", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiGreaterThan(String value) {
            addCriterion("xuezhi >", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiGreaterThanOrEqualTo(String value) {
            addCriterion("xuezhi >=", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLessThan(String value) {
            addCriterion("xuezhi <", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLessThanOrEqualTo(String value) {
            addCriterion("xuezhi <=", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiLike(String value) {
            addCriterion("xuezhi like", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotLike(String value) {
            addCriterion("xuezhi not like", value, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiIn(List<String> values) {
            addCriterion("xuezhi in", values, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotIn(List<String> values) {
            addCriterion("xuezhi not in", values, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiBetween(String value1, String value2) {
            addCriterion("xuezhi between", value1, value2, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andXuezhiNotBetween(String value1, String value2) {
            addCriterion("xuezhi not between", value1, value2, "xuezhi");
            return (Criteria) this;
        }

        public Criteria andITimeIsNull() {
            addCriterion("I_time is null");
            return (Criteria) this;
        }

        public Criteria andITimeIsNotNull() {
            addCriterion("I_time is not null");
            return (Criteria) this;
        }

        public Criteria andITimeEqualTo(Date value) {
            addCriterion("I_time =", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotEqualTo(Date value) {
            addCriterion("I_time <>", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThan(Date value) {
            addCriterion("I_time >", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThanOrEqualTo(Date value) {
            addCriterion("I_time >=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThan(Date value) {
            addCriterion("I_time <", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThanOrEqualTo(Date value) {
            addCriterion("I_time <=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeIn(List<Date> values) {
            addCriterion("I_time in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotIn(List<Date> values) {
            addCriterion("I_time not in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeBetween(Date value1, Date value2) {
            addCriterion("I_time between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotBetween(Date value1, Date value2) {
            addCriterion("I_time not between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNull() {
            addCriterion("information_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("information_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(Integer value) {
            addCriterion("information_id =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(Integer value) {
            addCriterion("information_id <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(Integer value) {
            addCriterion("information_id >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_id >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(Integer value) {
            addCriterion("information_id <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("information_id <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<Integer> values) {
            addCriterion("information_id in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<Integer> values) {
            addCriterion("information_id not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("information_id between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("information_id not between", value1, value2, "informationId");
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