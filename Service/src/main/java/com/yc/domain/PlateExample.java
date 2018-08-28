package com.yc.domain;

import java.util.ArrayList;
import java.util.List;

public class PlateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlateExample() {
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

        public Criteria andPTitleIsNull() {
            addCriterion("p_title is null");
            return (Criteria) this;
        }

        public Criteria andPTitleIsNotNull() {
            addCriterion("p_title is not null");
            return (Criteria) this;
        }

        public Criteria andPTitleEqualTo(String value) {
            addCriterion("p_title =", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotEqualTo(String value) {
            addCriterion("p_title <>", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThan(String value) {
            addCriterion("p_title >", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleGreaterThanOrEqualTo(String value) {
            addCriterion("p_title >=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThan(String value) {
            addCriterion("p_title <", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLessThanOrEqualTo(String value) {
            addCriterion("p_title <=", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleLike(String value) {
            addCriterion("p_title like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotLike(String value) {
            addCriterion("p_title not like", value, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleIn(List<String> values) {
            addCriterion("p_title in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotIn(List<String> values) {
            addCriterion("p_title not in", values, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleBetween(String value1, String value2) {
            addCriterion("p_title between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPTitleNotBetween(String value1, String value2) {
            addCriterion("p_title not between", value1, value2, "pTitle");
            return (Criteria) this;
        }

        public Criteria andPDescIsNull() {
            addCriterion("p_desc is null");
            return (Criteria) this;
        }

        public Criteria andPDescIsNotNull() {
            addCriterion("p_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPDescEqualTo(String value) {
            addCriterion("p_desc =", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotEqualTo(String value) {
            addCriterion("p_desc <>", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThan(String value) {
            addCriterion("p_desc >", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescGreaterThanOrEqualTo(String value) {
            addCriterion("p_desc >=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThan(String value) {
            addCriterion("p_desc <", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLessThanOrEqualTo(String value) {
            addCriterion("p_desc <=", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescLike(String value) {
            addCriterion("p_desc like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotLike(String value) {
            addCriterion("p_desc not like", value, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescIn(List<String> values) {
            addCriterion("p_desc in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotIn(List<String> values) {
            addCriterion("p_desc not in", values, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescBetween(String value1, String value2) {
            addCriterion("p_desc between", value1, value2, "pDesc");
            return (Criteria) this;
        }

        public Criteria andPDescNotBetween(String value1, String value2) {
            addCriterion("p_desc not between", value1, value2, "pDesc");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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