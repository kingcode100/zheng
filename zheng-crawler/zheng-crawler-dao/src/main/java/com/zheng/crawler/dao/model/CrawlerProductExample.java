package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlerProductExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CrawlerProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNull() {
            addCriterion("product_introduction is null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNotNull() {
            addCriterion("product_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionEqualTo(String value) {
            addCriterion("product_introduction =", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotEqualTo(String value) {
            addCriterion("product_introduction <>", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThan(String value) {
            addCriterion("product_introduction >", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("product_introduction >=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThan(String value) {
            addCriterion("product_introduction <", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThanOrEqualTo(String value) {
            addCriterion("product_introduction <=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLike(String value) {
            addCriterion("product_introduction like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotLike(String value) {
            addCriterion("product_introduction not like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIn(List<String> values) {
            addCriterion("product_introduction in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotIn(List<String> values) {
            addCriterion("product_introduction not in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionBetween(String value1, String value2) {
            addCriterion("product_introduction between", value1, value2, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotBetween(String value1, String value2) {
            addCriterion("product_introduction not between", value1, value2, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIsNull() {
            addCriterion("product_features is null");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIsNotNull() {
            addCriterion("product_features is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesEqualTo(String value) {
            addCriterion("product_features =", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotEqualTo(String value) {
            addCriterion("product_features <>", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesGreaterThan(String value) {
            addCriterion("product_features >", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("product_features >=", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLessThan(String value) {
            addCriterion("product_features <", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLessThanOrEqualTo(String value) {
            addCriterion("product_features <=", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLike(String value) {
            addCriterion("product_features like", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotLike(String value) {
            addCriterion("product_features not like", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIn(List<String> values) {
            addCriterion("product_features in", values, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotIn(List<String> values) {
            addCriterion("product_features not in", values, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesBetween(String value1, String value2) {
            addCriterion("product_features between", value1, value2, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotBetween(String value1, String value2) {
            addCriterion("product_features not between", value1, value2, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterIsNull() {
            addCriterion("technical_parameter is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterIsNotNull() {
            addCriterion("technical_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterEqualTo(String value) {
            addCriterion("technical_parameter =", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterNotEqualTo(String value) {
            addCriterion("technical_parameter <>", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterGreaterThan(String value) {
            addCriterion("technical_parameter >", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterGreaterThanOrEqualTo(String value) {
            addCriterion("technical_parameter >=", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterLessThan(String value) {
            addCriterion("technical_parameter <", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterLessThanOrEqualTo(String value) {
            addCriterion("technical_parameter <=", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterLike(String value) {
            addCriterion("technical_parameter like", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterNotLike(String value) {
            addCriterion("technical_parameter not like", value, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterIn(List<String> values) {
            addCriterion("technical_parameter in", values, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterNotIn(List<String> values) {
            addCriterion("technical_parameter not in", values, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterBetween(String value1, String value2) {
            addCriterion("technical_parameter between", value1, value2, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andTechnicalParameterNotBetween(String value1, String value2) {
            addCriterion("technical_parameter not between", value1, value2, "technicalParameter");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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