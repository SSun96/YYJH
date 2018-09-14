package com.yyjh.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
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

        public Criteria andAnsIdIsNull() {
            addCriterion("ans_id is null");
            return (Criteria) this;
        }

        public Criteria andAnsIdIsNotNull() {
            addCriterion("ans_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnsIdEqualTo(Integer value) {
            addCriterion("ans_id =", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotEqualTo(Integer value) {
            addCriterion("ans_id <>", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdGreaterThan(Integer value) {
            addCriterion("ans_id >", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ans_id >=", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdLessThan(Integer value) {
            addCriterion("ans_id <", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ans_id <=", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdIn(List<Integer> values) {
            addCriterion("ans_id in", values, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotIn(List<Integer> values) {
            addCriterion("ans_id not in", values, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdBetween(Integer value1, Integer value2) {
            addCriterion("ans_id between", value1, value2, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ans_id not between", value1, value2, "ansId");
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

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andASendtimeIsNull() {
            addCriterion("a_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andASendtimeIsNotNull() {
            addCriterion("a_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andASendtimeEqualTo(Date value) {
            addCriterion("a_sendtime =", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeNotEqualTo(Date value) {
            addCriterion("a_sendtime <>", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeGreaterThan(Date value) {
            addCriterion("a_sendtime >", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_sendtime >=", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeLessThan(Date value) {
            addCriterion("a_sendtime <", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeLessThanOrEqualTo(Date value) {
            addCriterion("a_sendtime <=", value, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeIn(List<Date> values) {
            addCriterion("a_sendtime in", values, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeNotIn(List<Date> values) {
            addCriterion("a_sendtime not in", values, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeBetween(Date value1, Date value2) {
            addCriterion("a_sendtime between", value1, value2, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andASendtimeNotBetween(Date value1, Date value2) {
            addCriterion("a_sendtime not between", value1, value2, "aSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeIsNull() {
            addCriterion("q_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andQSendtimeIsNotNull() {
            addCriterion("q_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andQSendtimeEqualTo(Date value) {
            addCriterion("q_sendtime =", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeNotEqualTo(Date value) {
            addCriterion("q_sendtime <>", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeGreaterThan(Date value) {
            addCriterion("q_sendtime >", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_sendtime >=", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeLessThan(Date value) {
            addCriterion("q_sendtime <", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("q_sendtime <=", value, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeIn(List<Date> values) {
            addCriterion("q_sendtime in", values, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeNotIn(List<Date> values) {
            addCriterion("q_sendtime not in", values, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeBetween(Date value1, Date value2) {
            addCriterion("q_sendtime between", value1, value2, "qSendtime");
            return (Criteria) this;
        }

        public Criteria andQSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("q_sendtime not between", value1, value2, "qSendtime");
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