package com.hospMS.pojo;

public class Pdf {
    private Integer pdfId;

    private String pdfName;

    private Integer filetypeId;

    private Integer diagListId;

    private String pdfPath;

    private String pdfContent;

    public Integer getPdfId() {
        return pdfId;
    }

    public void setPdfId(Integer pdfId) {
        this.pdfId = pdfId;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName == null ? null : pdfName.trim();
    }

    public Integer getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Integer filetypeId) {
        this.filetypeId = filetypeId;
    }

    public Integer getDiagListId() {
        return diagListId;
    }

    public void setDiagListId(Integer diagListId) {
        this.diagListId = diagListId;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath == null ? null : pdfPath.trim();
    }

    public String getPdfContent() {
        return pdfContent;
    }

    public void setPdfContent(String pdfContent) {
        this.pdfContent = pdfContent == null ? null : pdfContent.trim();
    }
}