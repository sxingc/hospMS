package com.hospMS.pojo;

public class PathologyAnalysis {
    private Integer pathologyAnalysisId;

    private Integer diagListId;

    private Integer pathologyId;

    private Integer symptomId;

    public Integer getPathologyAnalysisId() {
        return pathologyAnalysisId;
    }

    public void setPathologyAnalysisId(Integer pathologyAnalysisId) {
        this.pathologyAnalysisId = pathologyAnalysisId;
    }

    public Integer getDiagListId() {
        return diagListId;
    }

    public void setDiagListId(Integer diagListId) {
        this.diagListId = diagListId;
    }

    public Integer getPathologyId() {
        return pathologyId;
    }

    public void setPathologyId(Integer pathologyId) {
        this.pathologyId = pathologyId;
    }

    public Integer getSymptomId() {
        return symptomId;
    }

    public void setSymptomId(Integer symptomId) {
        this.symptomId = symptomId;
    }
}