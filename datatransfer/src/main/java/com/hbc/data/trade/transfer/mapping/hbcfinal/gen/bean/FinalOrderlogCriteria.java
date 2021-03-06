package com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean;

import com.hbc.data.trade.transfer.util.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinalOrderlogCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public FinalOrderlogCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
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

        public Criteria andOrderlogidIsNull() {
            addCriterion("orderLogId is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogidIsNotNull() {
            addCriterion("orderLogId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogidEqualTo(String value) {
            addCriterion("orderLogId =", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidNotEqualTo(String value) {
            addCriterion("orderLogId <>", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidGreaterThan(String value) {
            addCriterion("orderLogId >", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidGreaterThanOrEqualTo(String value) {
            addCriterion("orderLogId >=", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidLessThan(String value) {
            addCriterion("orderLogId <", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidLessThanOrEqualTo(String value) {
            addCriterion("orderLogId <=", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidLike(String value) {
            addCriterion("orderLogId like", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidNotLike(String value) {
            addCriterion("orderLogId not like", value, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidIn(List<String> values) {
            addCriterion("orderLogId in", values, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidNotIn(List<String> values) {
            addCriterion("orderLogId not in", values, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidBetween(String value1, String value2) {
            addCriterion("orderLogId between", value1, value2, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderlogidNotBetween(String value1, String value2) {
            addCriterion("orderLogId not between", value1, value2, "orderlogid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andGuideidIsNull() {
            addCriterion("guideId is null");
            return (Criteria) this;
        }

        public Criteria andGuideidIsNotNull() {
            addCriterion("guideId is not null");
            return (Criteria) this;
        }

        public Criteria andGuideidEqualTo(Integer value) {
            addCriterion("guideId =", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotEqualTo(Integer value) {
            addCriterion("guideId <>", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidGreaterThan(Integer value) {
            addCriterion("guideId >", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guideId >=", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidLessThan(Integer value) {
            addCriterion("guideId <", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidLessThanOrEqualTo(Integer value) {
            addCriterion("guideId <=", value, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidIn(List<Integer> values) {
            addCriterion("guideId in", values, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotIn(List<Integer> values) {
            addCriterion("guideId not in", values, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidBetween(Integer value1, Integer value2) {
            addCriterion("guideId between", value1, value2, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuideidNotBetween(Integer value1, Integer value2) {
            addCriterion("guideId not between", value1, value2, "guideid");
            return (Criteria) this;
        }

        public Criteria andGuidenameIsNull() {
            addCriterion("guideName is null");
            return (Criteria) this;
        }

        public Criteria andGuidenameIsNotNull() {
            addCriterion("guideName is not null");
            return (Criteria) this;
        }

        public Criteria andGuidenameEqualTo(String value) {
            addCriterion("guideName =", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameNotEqualTo(String value) {
            addCriterion("guideName <>", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameGreaterThan(String value) {
            addCriterion("guideName >", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameGreaterThanOrEqualTo(String value) {
            addCriterion("guideName >=", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameLessThan(String value) {
            addCriterion("guideName <", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameLessThanOrEqualTo(String value) {
            addCriterion("guideName <=", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameLike(String value) {
            addCriterion("guideName like", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameNotLike(String value) {
            addCriterion("guideName not like", value, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameIn(List<String> values) {
            addCriterion("guideName in", values, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameNotIn(List<String> values) {
            addCriterion("guideName not in", values, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameBetween(String value1, String value2) {
            addCriterion("guideName between", value1, value2, "guidename");
            return (Criteria) this;
        }

        public Criteria andGuidenameNotBetween(String value1, String value2) {
            addCriterion("guideName not between", value1, value2, "guidename");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSystypeIsNull() {
            addCriterion("sysType is null");
            return (Criteria) this;
        }

        public Criteria andSystypeIsNotNull() {
            addCriterion("sysType is not null");
            return (Criteria) this;
        }

        public Criteria andSystypeEqualTo(Integer value) {
            addCriterion("sysType =", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotEqualTo(Integer value) {
            addCriterion("sysType <>", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeGreaterThan(Integer value) {
            addCriterion("sysType >", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysType >=", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeLessThan(Integer value) {
            addCriterion("sysType <", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeLessThanOrEqualTo(Integer value) {
            addCriterion("sysType <=", value, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeIn(List<Integer> values) {
            addCriterion("sysType in", values, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotIn(List<Integer> values) {
            addCriterion("sysType not in", values, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeBetween(Integer value1, Integer value2) {
            addCriterion("sysType between", value1, value2, "systype");
            return (Criteria) this;
        }

        public Criteria andSystypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sysType not between", value1, value2, "systype");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andOpuseridIsNull() {
            addCriterion("opUserId is null");
            return (Criteria) this;
        }

        public Criteria andOpuseridIsNotNull() {
            addCriterion("opUserId is not null");
            return (Criteria) this;
        }

        public Criteria andOpuseridEqualTo(String value) {
            addCriterion("opUserId =", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridNotEqualTo(String value) {
            addCriterion("opUserId <>", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridGreaterThan(String value) {
            addCriterion("opUserId >", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridGreaterThanOrEqualTo(String value) {
            addCriterion("opUserId >=", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridLessThan(String value) {
            addCriterion("opUserId <", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridLessThanOrEqualTo(String value) {
            addCriterion("opUserId <=", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridLike(String value) {
            addCriterion("opUserId like", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridNotLike(String value) {
            addCriterion("opUserId not like", value, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridIn(List<String> values) {
            addCriterion("opUserId in", values, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridNotIn(List<String> values) {
            addCriterion("opUserId not in", values, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridBetween(String value1, String value2) {
            addCriterion("opUserId between", value1, value2, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpuseridNotBetween(String value1, String value2) {
            addCriterion("opUserId not between", value1, value2, "opuserid");
            return (Criteria) this;
        }

        public Criteria andOpusernameIsNull() {
            addCriterion("opUserName is null");
            return (Criteria) this;
        }

        public Criteria andOpusernameIsNotNull() {
            addCriterion("opUserName is not null");
            return (Criteria) this;
        }

        public Criteria andOpusernameEqualTo(String value) {
            addCriterion("opUserName =", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotEqualTo(String value) {
            addCriterion("opUserName <>", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThan(String value) {
            addCriterion("opUserName >", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThanOrEqualTo(String value) {
            addCriterion("opUserName >=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThan(String value) {
            addCriterion("opUserName <", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThanOrEqualTo(String value) {
            addCriterion("opUserName <=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLike(String value) {
            addCriterion("opUserName like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotLike(String value) {
            addCriterion("opUserName not like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameIn(List<String> values) {
            addCriterion("opUserName in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotIn(List<String> values) {
            addCriterion("opUserName not in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameBetween(String value1, String value2) {
            addCriterion("opUserName between", value1, value2, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotBetween(String value1, String value2) {
            addCriterion("opUserName not between", value1, value2, "opusername");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderlog`
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table `orderlog`
     *
     * @mbggenerated
     */
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