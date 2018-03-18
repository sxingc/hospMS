package com.hospMS.pojo;

import java.util.ArrayList;
import java.util.List;

public class SymptomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SymptomExample() {
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

        public Criteria andSymptomIdIsNull() {
            addCriterion("symptom_id is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIdIsNotNull() {
            addCriterion("symptom_id is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomIdEqualTo(Integer value) {
            addCriterion("symptom_id =", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdNotEqualTo(Integer value) {
            addCriterion("symptom_id <>", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdGreaterThan(Integer value) {
            addCriterion("symptom_id >", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("symptom_id >=", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdLessThan(Integer value) {
            addCriterion("symptom_id <", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdLessThanOrEqualTo(Integer value) {
            addCriterion("symptom_id <=", value, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdIn(List<Integer> values) {
            addCriterion("symptom_id in", values, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdNotIn(List<Integer> values) {
            addCriterion("symptom_id not in", values, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdBetween(Integer value1, Integer value2) {
            addCriterion("symptom_id between", value1, value2, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("symptom_id not between", value1, value2, "symptomId");
            return (Criteria) this;
        }

        public Criteria andSymptomNameIsNull() {
            addCriterion("symptom_name is null");
            return (Criteria) this;
        }

        public Criteria andSymptomNameIsNotNull() {
            addCriterion("symptom_name is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomNameEqualTo(String value) {
            addCriterion("symptom_name =", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameNotEqualTo(String value) {
            addCriterion("symptom_name <>", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameGreaterThan(String value) {
            addCriterion("symptom_name >", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameGreaterThanOrEqualTo(String value) {
            addCriterion("symptom_name >=", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameLessThan(String value) {
            addCriterion("symptom_name <", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameLessThanOrEqualTo(String value) {
            addCriterion("symptom_name <=", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameLike(String value) {
            addCriterion("symptom_name like", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameNotLike(String value) {
            addCriterion("symptom_name not like", value, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameIn(List<String> values) {
            addCriterion("symptom_name in", values, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameNotIn(List<String> values) {
            addCriterion("symptom_name not in", values, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameBetween(String value1, String value2) {
            addCriterion("symptom_name between", value1, value2, "symptomName");
            return (Criteria) this;
        }

        public Criteria andSymptomNameNotBetween(String value1, String value2) {
            addCriterion("symptom_name not between", value1, value2, "symptomName");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIsNull() {
            addCriterion("pathology_id is null");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIsNotNull() {
            addCriterion("pathology_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyIdEqualTo(Integer value) {
            addCriterion("pathology_id =", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotEqualTo(Integer value) {
            addCriterion("pathology_id <>", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdGreaterThan(Integer value) {
            addCriterion("pathology_id >", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathology_id >=", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdLessThan(Integer value) {
            addCriterion("pathology_id <", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdLessThanOrEqualTo(Integer value) {
            addCriterion("pathology_id <=", value, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdIn(List<Integer> values) {
            addCriterion("pathology_id in", values, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotIn(List<Integer> values) {
            addCriterion("pathology_id not in", values, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdBetween(Integer value1, Integer value2) {
            addCriterion("pathology_id between", value1, value2, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andPathologyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pathology_id not between", value1, value2, "pathologyId");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderIsNull() {
            addCriterion("symptom_order is null");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderIsNotNull() {
            addCriterion("symptom_order is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderEqualTo(Integer value) {
            addCriterion("symptom_order =", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderNotEqualTo(Integer value) {
            addCriterion("symptom_order <>", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderGreaterThan(Integer value) {
            addCriterion("symptom_order >", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("symptom_order >=", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderLessThan(Integer value) {
            addCriterion("symptom_order <", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderLessThanOrEqualTo(Integer value) {
            addCriterion("symptom_order <=", value, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderIn(List<Integer> values) {
            addCriterion("symptom_order in", values, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderNotIn(List<Integer> values) {
            addCriterion("symptom_order not in", values, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderBetween(Integer value1, Integer value2) {
            addCriterion("symptom_order between", value1, value2, "symptomOrder");
            return (Criteria) this;
        }

        public Criteria andSymptomOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("symptom_order not between", value1, value2, "symptomOrder");
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