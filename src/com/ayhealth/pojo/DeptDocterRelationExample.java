package com.ayhealth.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeptDocterRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptDocterRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andHosCodeIsNull() {
            addCriterion("hos_code is null");
            return (Criteria) this;
        }

        public Criteria andHosCodeIsNotNull() {
            addCriterion("hos_code is not null");
            return (Criteria) this;
        }

        public Criteria andHosCodeEqualTo(String value) {
            addCriterion("hos_code =", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeNotEqualTo(String value) {
            addCriterion("hos_code <>", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeGreaterThan(String value) {
            addCriterion("hos_code >", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hos_code >=", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeLessThan(String value) {
            addCriterion("hos_code <", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeLessThanOrEqualTo(String value) {
            addCriterion("hos_code <=", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeLike(String value) {
            addCriterion("hos_code like", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeNotLike(String value) {
            addCriterion("hos_code not like", value, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeIn(List<String> values) {
            addCriterion("hos_code in", values, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeNotIn(List<String> values) {
            addCriterion("hos_code not in", values, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeBetween(String value1, String value2) {
            addCriterion("hos_code between", value1, value2, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosCodeNotBetween(String value1, String value2) {
            addCriterion("hos_code not between", value1, value2, "hosCode");
            return (Criteria) this;
        }

        public Criteria andHosNameIsNull() {
            addCriterion("hos_name is null");
            return (Criteria) this;
        }

        public Criteria andHosNameIsNotNull() {
            addCriterion("hos_name is not null");
            return (Criteria) this;
        }

        public Criteria andHosNameEqualTo(String value) {
            addCriterion("hos_name =", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotEqualTo(String value) {
            addCriterion("hos_name <>", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameGreaterThan(String value) {
            addCriterion("hos_name >", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameGreaterThanOrEqualTo(String value) {
            addCriterion("hos_name >=", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLessThan(String value) {
            addCriterion("hos_name <", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLessThanOrEqualTo(String value) {
            addCriterion("hos_name <=", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameLike(String value) {
            addCriterion("hos_name like", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotLike(String value) {
            addCriterion("hos_name not like", value, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameIn(List<String> values) {
            addCriterion("hos_name in", values, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotIn(List<String> values) {
            addCriterion("hos_name not in", values, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameBetween(String value1, String value2) {
            addCriterion("hos_name between", value1, value2, "hosName");
            return (Criteria) this;
        }

        public Criteria andHosNameNotBetween(String value1, String value2) {
            addCriterion("hos_name not between", value1, value2, "hosName");
            return (Criteria) this;
        }

        public Criteria andDocCodeIsNull() {
            addCriterion("doc_code is null");
            return (Criteria) this;
        }

        public Criteria andDocCodeIsNotNull() {
            addCriterion("doc_code is not null");
            return (Criteria) this;
        }

        public Criteria andDocCodeEqualTo(String value) {
            addCriterion("doc_code =", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeNotEqualTo(String value) {
            addCriterion("doc_code <>", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeGreaterThan(String value) {
            addCriterion("doc_code >", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeGreaterThanOrEqualTo(String value) {
            addCriterion("doc_code >=", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeLessThan(String value) {
            addCriterion("doc_code <", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeLessThanOrEqualTo(String value) {
            addCriterion("doc_code <=", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeLike(String value) {
            addCriterion("doc_code like", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeNotLike(String value) {
            addCriterion("doc_code not like", value, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeIn(List<String> values) {
            addCriterion("doc_code in", values, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeNotIn(List<String> values) {
            addCriterion("doc_code not in", values, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeBetween(String value1, String value2) {
            addCriterion("doc_code between", value1, value2, "docCode");
            return (Criteria) this;
        }

        public Criteria andDocCodeNotBetween(String value1, String value2) {
            addCriterion("doc_code not between", value1, value2, "docCode");
            return (Criteria) this;
        }

        public Criteria andCheckMd5IsNull() {
            addCriterion("check_md5 is null");
            return (Criteria) this;
        }

        public Criteria andCheckMd5IsNotNull() {
            addCriterion("check_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMd5EqualTo(String value) {
            addCriterion("check_md5 =", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5NotEqualTo(String value) {
            addCriterion("check_md5 <>", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5GreaterThan(String value) {
            addCriterion("check_md5 >", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5GreaterThanOrEqualTo(String value) {
            addCriterion("check_md5 >=", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5LessThan(String value) {
            addCriterion("check_md5 <", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5LessThanOrEqualTo(String value) {
            addCriterion("check_md5 <=", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5Like(String value) {
            addCriterion("check_md5 like", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5NotLike(String value) {
            addCriterion("check_md5 not like", value, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5In(List<String> values) {
            addCriterion("check_md5 in", values, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5NotIn(List<String> values) {
            addCriterion("check_md5 not in", values, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5Between(String value1, String value2) {
            addCriterion("check_md5 between", value1, value2, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andCheckMd5NotBetween(String value1, String value2) {
            addCriterion("check_md5 not between", value1, value2, "checkMd5");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNull() {
            addCriterion("work_state is null");
            return (Criteria) this;
        }

        public Criteria andWorkStateIsNotNull() {
            addCriterion("work_state is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStateEqualTo(Integer value) {
            addCriterion("work_state =", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotEqualTo(Integer value) {
            addCriterion("work_state <>", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThan(Integer value) {
            addCriterion("work_state >", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_state >=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThan(Integer value) {
            addCriterion("work_state <", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateLessThanOrEqualTo(Integer value) {
            addCriterion("work_state <=", value, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateIn(List<Integer> values) {
            addCriterion("work_state in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotIn(List<Integer> values) {
            addCriterion("work_state not in", values, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateBetween(Integer value1, Integer value2) {
            addCriterion("work_state between", value1, value2, "workState");
            return (Criteria) this;
        }

        public Criteria andWorkStateNotBetween(Integer value1, Integer value2) {
            addCriterion("work_state not between", value1, value2, "workState");
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