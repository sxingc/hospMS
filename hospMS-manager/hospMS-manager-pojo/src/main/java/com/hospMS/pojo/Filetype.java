package com.hospMS.pojo;

public class Filetype {
    private Integer filetypeId;

    private String filetypeName;

    public Integer getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Integer filetypeId) {
        this.filetypeId = filetypeId;
    }

    public String getFiletypeName() {
        return filetypeName;
    }

    public void setFiletypeName(String filetypeName) {
        this.filetypeName = filetypeName == null ? null : filetypeName.trim();
    }
}