package com.myfirst.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Course {
    private Integer reqCourseId;

    private Integer requestId;

    private Integer displayOrder;

    private String courseName;

    private String trainPlace;

    private String lecture;

    private Date beginDate;

    private Date endDate;

    private BigDecimal periodSum;

    private BigDecimal costActual;

    private Date applyEndDate;

    private Integer signTimes;

    private Integer evaluateTemplate;

    private Date evaluateStartDate;

    private Date evaluateEndDate;

    private Date distributeEndDate;

    private Date dealEndDate;

    private String condition;

    private String disstatus;

    private Integer status;

    private Requests requests;

    public Requests getRequests() {
        return requests;
    }

    public void setRequests(Requests requests) {
        this.requests = requests;
    }

    public Integer getReqCourseId() {
        return reqCourseId;
    }

    public void setReqCourseId(Integer reqCourseId) {
        this.reqCourseId = reqCourseId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainPlace() {
        return trainPlace;
    }

    public void setTrainPlace(String trainPlace) {
        this.trainPlace = trainPlace;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPeriodSum() {
        return periodSum;
    }

    public void setPeriodSum(BigDecimal periodSum) {
        this.periodSum = periodSum;
    }

    public BigDecimal getCostActual() {
        return costActual;
    }

    public void setCostActual(BigDecimal costActual) {
        this.costActual = costActual;
    }

    public Date getApplyEndDate() {
        return applyEndDate;
    }

    public void setApplyEndDate(Date applyEndDate) {
        this.applyEndDate = applyEndDate;
    }

    public Integer getSignTimes() {
        return signTimes;
    }

    public void setSignTimes(Integer signTimes) {
        this.signTimes = signTimes;
    }

    public Integer getEvaluateTemplate() {
        return evaluateTemplate;
    }

    public void setEvaluateTemplate(Integer evaluateTemplate) {
        this.evaluateTemplate = evaluateTemplate;
    }

    public Date getEvaluateStartDate() {
        return evaluateStartDate;
    }

    public void setEvaluateStartDate(Date evaluateStartDate) {
        this.evaluateStartDate = evaluateStartDate;
    }

    public Date getEvaluateEndDate() {
        return evaluateEndDate;
    }

    public void setEvaluateEndDate(Date evaluateEndDate) {
        this.evaluateEndDate = evaluateEndDate;
    }

    public Date getDistributeEndDate() {
        return distributeEndDate;
    }

    public void setDistributeEndDate(Date distributeEndDate) {
        this.distributeEndDate = distributeEndDate;
    }

    public Date getDealEndDate() {
        return dealEndDate;
    }

    public void setDealEndDate(Date dealEndDate) {
        this.dealEndDate = dealEndDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDisstatus() {
        return disstatus;
    }

    public void setDisstatus(String disstatus) {
        this.disstatus = disstatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}