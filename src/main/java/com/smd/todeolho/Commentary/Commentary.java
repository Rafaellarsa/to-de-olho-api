package com.smd.todeolho.Commentary;

import java.time.OffsetDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "commentary")
public class Commentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private OffsetDateTime datetime;
    private String text;

    private Long creator;
    private Long public_works;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OffsetDateTime getDateTime() {
        return datetime;
    }

    public void setDateTime(OffsetDateTime datetime) {
        this.datetime = datetime;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getPublicWorks() {
        return public_works;
    }

    public void setPublicWorks(Long publicWorks) {
        this.public_works = publicWorks;
    }
}