package com.smd.todeolho.Image;

import jakarta.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Byte[] content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }
}