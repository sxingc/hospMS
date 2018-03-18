package com.hospMS.pojo;

public class Authority {
    private Integer authorityId;

    private String authorityName;

    private String authorityNotes;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityNotes() {
        return authorityNotes;
    }

    public void setAuthorityNotes(String authorityNotes) {
        this.authorityNotes = authorityNotes == null ? null : authorityNotes.trim();
    }
}