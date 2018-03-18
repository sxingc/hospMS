package com.hospMS.pojo;

import java.util.ArrayList;
import java.util.List;

public class PathologyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathologyExample() {
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

        public Criteria andPathologyNameIsNull() {
            addCriterion("pathology_name is null");
            return (Criteria) this;
        }

        public Criteria andPathologyNameIsNotNull() {
            addCriterion("pathology_name is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyNameEqualTo(String value) {
            addCriterion("pathology_name =", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameNotEqualTo(String value) {
            addCriterion("pathology_name <>", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameGreaterThan(String value) {
            addCriterion("pathology_name >", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameGreaterThanOrEqualTo(String value) {
            addCriterion("pathology_name >=", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameLessThan(String value) {
            addCriterion("pathology_name <", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameLessThanOrEqualTo(String value) {
            addCriterion("pathology_name <=", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameLike(String value) {
            addCriterion("pathology_name like", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameNotLike(String value) {
            addCriterion("pathology_name not like", value, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameIn(List<String> values) {
            addCriterion("pathology_name in", values, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameNotIn(List<String> values) {
            addCriterion("pathology_name not in", values, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameBetween(String value1, String value2) {
            addCriterion("pathology_name between", value1, value2, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andPathologyNameNotBetween(String value1, String value2) {
            addCriterion("pathology_name not between", value1, value2, "pathologyName");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNull() {
            addCriterion("disease_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("disease_id =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("disease_id <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("disease_id >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disease_id >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("disease_id <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("disease_id <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("disease_id in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("disease_id not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("disease_id between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disease_id not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderIsNull() {
            addCriterion("pathology_order is null");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderIsNotNull() {
            addCriterion("pathology_order is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderEqualTo(Integer value) {
            addCriterion("pathology_order =", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderNotEqualTo(Integer value) {
            addCriterion("pathology_order <>", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderGreaterThan(Integer value) {
            addCriterion("pathology_order >", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathology_order >=", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderLessThan(Integer value) {
            addCriterion("pathology_order <", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pathology_order <=", value, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderIn(List<Integer> values) {
            addCriterion("pathology_order in", values, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderNotIn(List<Integer> values) {
            addCriterion("pathology_order not in", values, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderBetween(Integer value1, Integer value2) {
            addCriterion("pathology_order between", value1, value2, "pathologyOrder");
            return (Criteria) this;
        }

        public Criteria andPathologyOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pathology_order not between", value1, value2, "pathologyOrder");
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