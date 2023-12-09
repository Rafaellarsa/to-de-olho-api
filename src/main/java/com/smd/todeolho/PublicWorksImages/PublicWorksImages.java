package com.smd.todeolho.PublicWorksImages;

import jakarta.persistence.*;

@Entity
@Table(name = "public_works_images")
@IdClass(PublicWorksImagesId.class)
public class PublicWorksImages {
    @Id
    private Long public_works_id;
    @Id
    private Long image_id;
}