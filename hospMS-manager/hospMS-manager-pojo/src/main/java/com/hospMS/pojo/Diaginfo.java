package com.hospMS.pojo;

import java.util.Date;

public class Diaginfo {
    private Integer diaginfoId;

    private String patientName;

    private String patientSex;

    private Date date;

    private Integer hospitalId;

    private Integer departId;

    private Integer diseaseId;

    private Integer userId;

    private String riskAssessment;

    private String tvrasAssessment;

    public Integer getDiaginfoId() {
        return diaginfoId;
    }

    public void setDiaginfoId(Integer diaginfoId) {
        this.diaginfoId = diaginfoId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment == null ? null : riskAssessment.trim();
    }

    public String getTvrasAssessment() {
        return tvrasAssessment;
    }

    public void setTvrasAssessment(String tvrasAssessment) {
        this.tvrasAssessment = tvrasAssessment == null ? null : tvrasAssessment.trim();
    }
}