package com.hospMS.pojo;

public class Image {
    private Integer imageId;

    private Integer filetypeId;

    private Integer diagListId;

    private String imageName;

    private String imagePath;

    private String imageContent;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getImageContent() {
        return imageContent;
    }

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent == null ? null : imageContent.trim();
    }
}