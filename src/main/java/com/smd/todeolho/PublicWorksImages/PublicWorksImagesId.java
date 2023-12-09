package com.smd.todeolho.PublicWorksImages;

import java.io.Serializable;

public class PublicWorksImagesId implements Serializable {
    private Long public_works_id;
    private Long image_id;

    public PublicWorksImagesId(Long publicWorksId, Long imageId) {
        this.public_works_id = publicWorksId;
        this.image_id = imageId;
    }

    public PublicWorksImagesId() {
    }

    public Long getPublicWorksId() {
        return public_works_id;
    }

    public void setPublicWorksId(Long publicWorksId) {
        this.public_works_id = publicWorksId;
    }

    public Long getImageId() {
        return image_id;
    }

    public void setImageId(Long imageId) {
        this.image_id = imageId;
    }}
