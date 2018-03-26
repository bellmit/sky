package com.sky.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrivilegeExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("RID like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("RID not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("Display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("Display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Boolean value) {
            addCriterion("Display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Boolean value) {
            addCriterion("Display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Boolean value) {
            addCriterion("Display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Boolean value) {
            addCriterion("Display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Boolean value) {
            addCriterion("Display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Boolean> values) {
            addCriterion("Display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Boolean> values) {
            addCriterion("Display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Boolean value1, Boolean value2) {
            addCriterion("Display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Display not between", value1, value2, "display");
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