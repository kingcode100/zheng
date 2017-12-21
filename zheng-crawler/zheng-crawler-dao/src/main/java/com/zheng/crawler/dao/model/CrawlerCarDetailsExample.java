package com.zheng.crawler.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlerCarDetailsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public CrawlerCarDetailsExample() {
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

        public Criteria andCarDetailsIdIsNull() {
            addCriterion("car_details_id is null");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdIsNotNull() {
            addCriterion("car_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdEqualTo(Integer value) {
            addCriterion("car_details_id =", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdNotEqualTo(Integer value) {
            addCriterion("car_details_id <>", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdGreaterThan(Integer value) {
            addCriterion("car_details_id >", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_details_id >=", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdLessThan(Integer value) {
            addCriterion("car_details_id <", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_details_id <=", value, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdIn(List<Integer> values) {
            addCriterion("car_details_id in", values, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdNotIn(List<Integer> values) {
            addCriterion("car_details_id not in", values, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("car_details_id between", value1, value2, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_details_id not between", value1, value2, "carDetailsId");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameIsNull() {
            addCriterion("car_details_name is null");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameIsNotNull() {
            addCriterion("car_details_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameEqualTo(String value) {
            addCriterion("car_details_name =", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameNotEqualTo(String value) {
            addCriterion("car_details_name <>", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameGreaterThan(String value) {
            addCriterion("car_details_name >", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_details_name >=", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameLessThan(String value) {
            addCriterion("car_details_name <", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("car_details_name <=", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameLike(String value) {
            addCriterion("car_details_name like", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameNotLike(String value) {
            addCriterion("car_details_name not like", value, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameIn(List<String> values) {
            addCriterion("car_details_name in", values, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameNotIn(List<String> values) {
            addCriterion("car_details_name not in", values, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameBetween(String value1, String value2) {
            addCriterion("car_details_name between", value1, value2, "carDetailsName");
            return (Criteria) this;
        }

        public Criteria andCarDetailsNameNotBetween(String value1, String value2) {
            addCriterion("car_details_name not between", value1, value2, "carDetailsName");
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

        public Criteria andManufactorIsNull() {
            addCriterion("manufactor is null");
            return (Criteria) this;
        }

        public Criteria andManufactorIsNotNull() {
            addCriterion("manufactor is not null");
            return (Criteria) this;
        }

        public Criteria andManufactorEqualTo(String value) {
            addCriterion("manufactor =", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorNotEqualTo(String value) {
            addCriterion("manufactor <>", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorGreaterThan(String value) {
            addCriterion("manufactor >", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorGreaterThanOrEqualTo(String value) {
            addCriterion("manufactor >=", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorLessThan(String value) {
            addCriterion("manufactor <", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorLessThanOrEqualTo(String value) {
            addCriterion("manufactor <=", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorLike(String value) {
            addCriterion("manufactor like", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorNotLike(String value) {
            addCriterion("manufactor not like", value, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorIn(List<String> values) {
            addCriterion("manufactor in", values, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorNotIn(List<String> values) {
            addCriterion("manufactor not in", values, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorBetween(String value1, String value2) {
            addCriterion("manufactor between", value1, value2, "manufactor");
            return (Criteria) this;
        }

        public Criteria andManufactorNotBetween(String value1, String value2) {
            addCriterion("manufactor not between", value1, value2, "manufactor");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNull() {
            addCriterion("model_year is null");
            return (Criteria) this;
        }

        public Criteria andModelYearIsNotNull() {
            addCriterion("model_year is not null");
            return (Criteria) this;
        }

        public Criteria andModelYearEqualTo(String value) {
            addCriterion("model_year =", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotEqualTo(String value) {
            addCriterion("model_year <>", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThan(String value) {
            addCriterion("model_year >", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearGreaterThanOrEqualTo(String value) {
            addCriterion("model_year >=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThan(String value) {
            addCriterion("model_year <", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLessThanOrEqualTo(String value) {
            addCriterion("model_year <=", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearLike(String value) {
            addCriterion("model_year like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotLike(String value) {
            addCriterion("model_year not like", value, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearIn(List<String> values) {
            addCriterion("model_year in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotIn(List<String> values) {
            addCriterion("model_year not in", values, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearBetween(String value1, String value2) {
            addCriterion("model_year between", value1, value2, "modelYear");
            return (Criteria) this;
        }

        public Criteria andModelYearNotBetween(String value1, String value2) {
            addCriterion("model_year not between", value1, value2, "modelYear");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNull() {
            addCriterion("displacement is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNotNull() {
            addCriterion("displacement is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementEqualTo(String value) {
            addCriterion("displacement =", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotEqualTo(String value) {
            addCriterion("displacement <>", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThan(String value) {
            addCriterion("displacement >", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("displacement >=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThan(String value) {
            addCriterion("displacement <", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThanOrEqualTo(String value) {
            addCriterion("displacement <=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLike(String value) {
            addCriterion("displacement like", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotLike(String value) {
            addCriterion("displacement not like", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementIn(List<String> values) {
            addCriterion("displacement in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotIn(List<String> values) {
            addCriterion("displacement not in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementBetween(String value1, String value2) {
            addCriterion("displacement between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotBetween(String value1, String value2) {
            addCriterion("displacement not between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andTransmissionIsNull() {
            addCriterion("transmission is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionIsNotNull() {
            addCriterion("transmission is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionEqualTo(String value) {
            addCriterion("transmission =", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotEqualTo(String value) {
            addCriterion("transmission <>", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionGreaterThan(String value) {
            addCriterion("transmission >", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionGreaterThanOrEqualTo(String value) {
            addCriterion("transmission >=", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLessThan(String value) {
            addCriterion("transmission <", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLessThanOrEqualTo(String value) {
            addCriterion("transmission <=", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionLike(String value) {
            addCriterion("transmission like", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotLike(String value) {
            addCriterion("transmission not like", value, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionIn(List<String> values) {
            addCriterion("transmission in", values, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotIn(List<String> values) {
            addCriterion("transmission not in", values, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionBetween(String value1, String value2) {
            addCriterion("transmission between", value1, value2, "transmission");
            return (Criteria) this;
        }

        public Criteria andTransmissionNotBetween(String value1, String value2) {
            addCriterion("transmission not between", value1, value2, "transmission");
            return (Criteria) this;
        }

        public Criteria andGearIsNull() {
            addCriterion("gear is null");
            return (Criteria) this;
        }

        public Criteria andGearIsNotNull() {
            addCriterion("gear is not null");
            return (Criteria) this;
        }

        public Criteria andGearEqualTo(String value) {
            addCriterion("gear =", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotEqualTo(String value) {
            addCriterion("gear <>", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThan(String value) {
            addCriterion("gear >", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearGreaterThanOrEqualTo(String value) {
            addCriterion("gear >=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThan(String value) {
            addCriterion("gear <", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLessThanOrEqualTo(String value) {
            addCriterion("gear <=", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearLike(String value) {
            addCriterion("gear like", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotLike(String value) {
            addCriterion("gear not like", value, "gear");
            return (Criteria) this;
        }

        public Criteria andGearIn(List<String> values) {
            addCriterion("gear in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotIn(List<String> values) {
            addCriterion("gear not in", values, "gear");
            return (Criteria) this;
        }

        public Criteria andGearBetween(String value1, String value2) {
            addCriterion("gear between", value1, value2, "gear");
            return (Criteria) this;
        }

        public Criteria andGearNotBetween(String value1, String value2) {
            addCriterion("gear not between", value1, value2, "gear");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelIsNull() {
            addCriterion("transmission_model is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelIsNotNull() {
            addCriterion("transmission_model is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelEqualTo(String value) {
            addCriterion("transmission_model =", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelNotEqualTo(String value) {
            addCriterion("transmission_model <>", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelGreaterThan(String value) {
            addCriterion("transmission_model >", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelGreaterThanOrEqualTo(String value) {
            addCriterion("transmission_model >=", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelLessThan(String value) {
            addCriterion("transmission_model <", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelLessThanOrEqualTo(String value) {
            addCriterion("transmission_model <=", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelLike(String value) {
            addCriterion("transmission_model like", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelNotLike(String value) {
            addCriterion("transmission_model not like", value, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelIn(List<String> values) {
            addCriterion("transmission_model in", values, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelNotIn(List<String> values) {
            addCriterion("transmission_model not in", values, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelBetween(String value1, String value2) {
            addCriterion("transmission_model between", value1, value2, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andTransmissionModelNotBetween(String value1, String value2) {
            addCriterion("transmission_model not between", value1, value2, "transmissionModel");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(String value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(String value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(String value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(String value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(String value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLike(String value) {
            addCriterion("capacity like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotLike(String value) {
            addCriterion("capacity not like", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<String> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<String> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(String value1, String value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(String value1, String value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andJointIsNull() {
            addCriterion("joint is null");
            return (Criteria) this;
        }

        public Criteria andJointIsNotNull() {
            addCriterion("joint is not null");
            return (Criteria) this;
        }

        public Criteria andJointEqualTo(String value) {
            addCriterion("joint =", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotEqualTo(String value) {
            addCriterion("joint <>", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointGreaterThan(String value) {
            addCriterion("joint >", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointGreaterThanOrEqualTo(String value) {
            addCriterion("joint >=", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLessThan(String value) {
            addCriterion("joint <", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLessThanOrEqualTo(String value) {
            addCriterion("joint <=", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointLike(String value) {
            addCriterion("joint like", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotLike(String value) {
            addCriterion("joint not like", value, "joint");
            return (Criteria) this;
        }

        public Criteria andJointIn(List<String> values) {
            addCriterion("joint in", values, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotIn(List<String> values) {
            addCriterion("joint not in", values, "joint");
            return (Criteria) this;
        }

        public Criteria andJointBetween(String value1, String value2) {
            addCriterion("joint between", value1, value2, "joint");
            return (Criteria) this;
        }

        public Criteria andJointNotBetween(String value1, String value2) {
            addCriterion("joint not between", value1, value2, "joint");
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