package com.hospMS.pojo;

public class Pathology {
    private Integer pathologyId;

    private String pathologyName;

    private Integer diseaseId;

    private Integer pathologyOrder;

    public Integer getPathologyId() {
        return pathologyId;
    }

    public void setPathologyId(Integer pathologyId) {
        this.pathologyId = pathologyId;
    }

    public String getPathologyName() {
        return pathologyName;
    }

    public void setPathologyName(String pathologyName) {
        this.pathologyName = pathologyName == null ? null : pathologyName.trim();
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public Integer getPathologyOrder() {
        return pathologyOrder;
    }

    public void setPathologyOrder(Integer pathologyOrder) {
        this.pathologyOrder = pathologyOrder;
    }
}