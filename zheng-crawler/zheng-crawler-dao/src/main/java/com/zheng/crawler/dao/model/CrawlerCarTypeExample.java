package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlerCarTypeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CrawlerCarTypeExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andCarTypeIdIsNull() {
            addCriterion("car_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("car_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("car_type_id =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("car_type_id <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("car_type_id >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type_id >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("car_type_id <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_type_id <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("car_type_id in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("car_type_id not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNull() {
            addCriterion("car_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNotNull() {
            addCriterion("car_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameEqualTo(String value) {
            addCriterion("car_type_name =", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotEqualTo(String value) {
            addCriterion("car_type_name <>", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThan(String value) {
            addCriterion("car_type_name >", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_type_name >=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThan(String value) {
            addCriterion("car_type_name <", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThanOrEqualTo(String value) {
            addCriterion("car_type_name <=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLike(String value) {
            addCriterion("car_type_name like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotLike(String value) {
            addCriterion("car_type_name not like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIn(List<String> values) {
            addCriterion("car_type_name in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotIn(List<String> values) {
            addCriterion("car_type_name not in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameBetween(String value1, String value2) {
            addCriterion("car_type_name between", value1, value2, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotBetween(String value1, String value2) {
            addCriterion("car_type_name not between", value1, value2, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdIsNull() {
            addCriterion("car_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdIsNotNull() {
            addCriterion("car_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdEqualTo(Integer value) {
            addCriterion("car_brand_id =", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdNotEqualTo(Integer value) {
            addCriterion("car_brand_id <>", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdGreaterThan(Integer value) {
            addCriterion("car_brand_id >", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_brand_id >=", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdLessThan(Integer value) {
            addCriterion("car_brand_id <", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_brand_id <=", value, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdIn(List<Integer> values) {
            addCriterion("car_brand_id in", values, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdNotIn(List<Integer> values) {
            addCriterion("car_brand_id not in", values, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("car_brand_id between", value1, value2, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCarBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_brand_id not between", value1, value2, "carBrandId");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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