package com.hospMS.pojo;

import java.util.ArrayList;
import java.util.List;

public class PathologyAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathologyAnalysisExample() {
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

        public Criteria andPathologyAnalysisIdIsNull() {
            addCriterion("pathology_analysis_id is null");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdIsNotNull() {
            addCriterion("pathology_analysis_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdEqualTo(Integer value) {
            addCriterion("pathology_analysis_id =", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdNotEqualTo(Integer value) {
            addCriterion("pathology_analysis_id <>", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdGreaterThan(Integer value) {
            addCriterion("pathology_analysis_id >", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathology_analysis_id >=", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdLessThan(Integer value) {
            addCriterion("pathology_analysis_id <", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdLessThanOrEqualTo(Integer value) {
            addCriterion("pathology_analysis_id <=", value, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdIn(List<Integer> values) {
            addCriterion("pathology_analysis_id in", values, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdNotIn(List<Integer> values) {
            addCriterion("pathology_analysis_id not in", values, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdBetween(Integer value1, Integer value2) {
            addCriterion("pathology_analysis_id between", value1, value2, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andPathologyAnalysisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pathology_analysis_id not between", value1, value2, "pathologyAnalysisId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdIsNull() {
            addCriterion("diag_list_id is null");
            return (Criteria) this;
        }

        public Criteria andDiagListIdIsNotNull() {
            addCriterion("diag_list_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiagListIdEqualTo(Integer value) {
            addCriterion("diag_list_id =", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdNotEqualTo(Integer value) {
            addCriterion("diag_list_id <>", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdGreaterThan(Integer value) {
            addCriterion("diag_list_id >", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diag_list_id >=", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdLessThan(Integer value) {
            addCriterion("diag_list_id <", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdLessThanOrEqualTo(Integer value) {
            addCriterion("diag_list_id <=", value, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdIn(List<Integer> values) {
            addCriterion("diag_list_id in", values, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdNotIn(List<Integer> values) {
            addCriterion("diag_list_id not in", values, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdBetween(Integer value1, Integer value2) {
            addCriterion("diag_list_id between", value1, value2, "diagListId");
            return (Criteria) this;
        }

        public Criteria andDiagListIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diag_list_id not between", value1, value2, "diagListId");
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