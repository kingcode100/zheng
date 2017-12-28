package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlerCarBrandExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CrawlerCarBrandExample() {
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

        public Criteria andCarBrandNameIsNull() {
            addCriterion("car_brand_name is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameIsNotNull() {
            addCriterion("car_brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameEqualTo(String value) {
            addCriterion("car_brand_name =", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameNotEqualTo(String value) {
            addCriterion("car_brand_name <>", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameGreaterThan(String value) {
            addCriterion("car_brand_name >", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand_name >=", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameLessThan(String value) {
            addCriterion("car_brand_name <", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameLessThanOrEqualTo(String value) {
            addCriterion("car_brand_name <=", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameLike(String value) {
            addCriterion("car_brand_name like", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameNotLike(String value) {
            addCriterion("car_brand_name not like", value, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameIn(List<String> values) {
            addCriterion("car_brand_name in", values, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameNotIn(List<String> values) {
            addCriterion("car_brand_name not in", values, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameBetween(String value1, String value2) {
            addCriterion("car_brand_name between", value1, value2, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandNameNotBetween(String value1, String value2) {
            addCriterion("car_brand_name not between", value1, value2, "carBrandName");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunIsNull() {
            addCriterion("car_brand_pingyun is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunIsNotNull() {
            addCriterion("car_brand_pingyun is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunEqualTo(String value) {
            addCriterion("car_brand_pingyun =", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunNotEqualTo(String value) {
            addCriterion("car_brand_pingyun <>", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunGreaterThan(String value) {
            addCriterion("car_brand_pingyun >", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand_pingyun >=", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunLessThan(String value) {
            addCriterion("car_brand_pingyun <", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunLessThanOrEqualTo(String value) {
            addCriterion("car_brand_pingyun <=", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunLike(String value) {
            addCriterion("car_brand_pingyun like", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunNotLike(String value) {
            addCriterion("car_brand_pingyun not like", value, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunIn(List<String> values) {
            addCriterion("car_brand_pingyun in", values, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunNotIn(List<String> values) {
            addCriterion("car_brand_pingyun not in", values, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunBetween(String value1, String value2) {
            addCriterion("car_brand_pingyun between", value1, value2, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andCarBrandPingyunNotBetween(String value1, String value2) {
            addCriterion("car_brand_pingyun not between", value1, value2, "carBrandPingyun");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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