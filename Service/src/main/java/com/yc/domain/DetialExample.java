package com.yc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetialExample() {
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

        public Criteria andDContentIsNull() {
            addCriterion("d_content is null");
            return (Criteria) this;
        }

        public Criteria andDContentIsNotNull() {
            addCriterion("d_content is not null");
            return (Criteria) this;
        }

        public Criteria andDContentEqualTo(String value) {
            addCriterion("d_content =", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotEqualTo(String value) {
            addCriterion("d_content <>", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThan(String value) {
            addCriterion("d_content >", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThanOrEqualTo(String value) {
            addCriterion("d_content >=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThan(String value) {
            addCriterion("d_content <", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThanOrEqualTo(String value) {
            addCriterion("d_content <=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLike(String value) {
            addCriterion("d_content like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotLike(String value) {
            addCriterion("d_content not like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentIn(List<String> values) {
            addCriterion("d_content in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotIn(List<String> values) {
            addCriterion("d_content not in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentBetween(String value1, String value2) {
            addCriterion("d_content between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotBetween(String value1, String value2) {
            addCriterion("d_content not between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIsNull() {
            addCriterion("d_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIsNotNull() {
            addCriterion("d_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeEqualTo(Date value) {
            addCriterion("d_createtime =", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotEqualTo(Date value) {
            addCriterion("d_createtime <>", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeGreaterThan(Date value) {
            addCriterion("d_createtime >", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_createtime >=", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeLessThan(Date value) {
            addCriterion("d_createtime <", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("d_createtime <=", value, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeIn(List<Date> values) {
            addCriterion("d_createtime in", values, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotIn(List<Date> values) {
            addCriterion("d_createtime not in", values, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeBetween(Date value1, Date value2) {
            addCriterion("d_createtime between", value1, value2, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andDCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("d_createtime not between", value1, value2, "dCreatetime");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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