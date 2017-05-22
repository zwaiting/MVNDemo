package com.myfirst.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Requests {
    private Integer requestId;

    private Integer trainOrg;

    private String trainType;

    private String isExam;

    private String certType;

    private String trainName;

    private String trainPurpose;

    private String trainExperience;

    private String trainUser;

    private Date startDate;

    private Date endDate;

    private BigDecimal periodSum;

    private Integer trainAgency;

    private String trainMethod;

    private String isNoPlan;

    private Integer trainPlanDetailId;

    private Integer status;

    private BigDecimal costEstimate;

    private BigDecimal costActual;

    private String procApplicationInstId;

    private String procFeedbackInstId;

    private String isOrgPer;

    private Integer applyPersonId;

    private Integer bussiGroupId;

    private Integer noticeMail;

    private List<Course> courseList;

    public List<Course> getCourses() {
        return courseList;
    }

    public void setCourses(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getTrainOrg() {
        return trainOrg;
    }

    public void setTrainOrg(Integer trainOrg) {
        this.trainOrg = trainOrg;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getIsExam() {
        return isExam;
    }

    public void setIsExam(String isExam) {
        this.isExam = isExam;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainPurpose() {
        return trainPurpose;
    }

    public void setTrainPurpose(String trainPurpose) {
        this.trainPurpose = trainPurpose;
    }

    public String getTrainExperience() {
        return trainExperience;
    }

    public void setTrainExperience(String trainExperience) {
        this.trainExperience = trainExperience;
    }

    public String getTrainUser() {
        return trainUser;
    }

    public void setTrainUser(String trainUser) {
        this.trainUser = trainUser;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Integer getTrainAgency() {
        return trainAgency;
    }

    public void setTrainAgency(Integer trainAgency) {
        this.trainAgency = trainAgency;
    }

    public String getTrainMethod() {
        return trainMethod;
    }

    public void setTrainMethod(String trainMethod) {
        this.trainMethod = trainMethod;
    }

    public String getIsNoPlan() {
        return isNoPlan;
    }

    public void setIsNoPlan(String isNoPlan) {
        this.isNoPlan = isNoPlan;
    }

    public Integer getTrainPlanDetailId() {
        return trainPlanDetailId;
    }

    public void setTrainPlanDetailId(Integer trainPlanDetailId) {
        this.trainPlanDetailId = trainPlanDetailId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getCostEstimate() {
        return costEstimate;
    }

    public void setCostEstimate(BigDecimal costEstimate) {
        this.costEstimate = costEstimate;
    }

    public BigDecimal getCostActual() {
        return costActual;
    }

    public void setCostActual(BigDecimal costActual) {
        this.costActual = costActual;
    }

    public String getProcApplicationInstId() {
        return procApplicationInstId;
    }

    public void setProcApplicationInstId(String procApplicationInstId) {
        this.procApplicationInstId = procApplicationInstId;
    }

    public String getProcFeedbackInstId() {
        return procFeedbackInstId;
    }

    public void setProcFeedbackInstId(String procFeedbackInstId) {
        this.procFeedbackInstId = procFeedbackInstId;
    }

    public String getIsOrgPer() {
        return isOrgPer;
    }

    public void setIsOrgPer(String isOrgPer) {
        this.isOrgPer = isOrgPer;
    }

    public Integer getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(Integer applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public Integer getBussiGroupId() {
        return bussiGroupId;
    }

    public void setBussiGroupId(Integer bussiGroupId) {
        this.bussiGroupId = bussiGroupId;
    }

    public Integer getNoticeMail() {
        return noticeMail;
    }

    public void setNoticeMail(Integer noticeMail) {
        this.noticeMail = noticeMail;
    }
}