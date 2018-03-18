package com.hospMS.pojo;

public class Symptom {
    private Integer symptomId;

    private String symptomName;

    private Integer pathologyId;

    private Integer symptomOrder;

    public Integer getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(Integer symptomId) {
        this.symptomId = symptomId;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName == null ? null : symptomName.trim();
    }

    public Integer getPathologyId() {
        return pathologyId;
    }

    public void setPathologyId(Integer pathologyId) {
        this.pathologyId = pathologyId;
    }

    public Integer getSymptomOrder() {
        return symptomOrder;
    }

    public void setSymptomOrder(Integer symptomOrder) {
        this.symptomOrder = symptomOrder;
    }
}