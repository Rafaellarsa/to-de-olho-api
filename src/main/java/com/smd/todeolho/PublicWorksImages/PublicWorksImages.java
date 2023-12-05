package com.smd.todeolho.PublicWorksImages;

import jakarta.persistence.*;

@Entity
@Table(name = "public_works_images")
public class PublicWorksImages {
    private Long public_works_id;
    private Long image_id;

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
    }
}