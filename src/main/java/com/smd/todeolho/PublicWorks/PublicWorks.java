package com.smd.todeolho.PublicWorks;

import jakarta.persistence.*;
import java.time.LocalDate;
import org.postgresql.geometric.PGpoint;

@Entity
@Table(name = "public_works")
public class PublicWorks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String city;
    private String state;

    private Long creator;
    private Long category;

    private Integer budget;
    private PGpoint position;

    private LocalDate start_date;
    private LocalDate deadline;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public PGpoint getPosition() {
        return position;
    }

    public void setPosition(PGpoint position) {
        this.position = position;
    }

    public LocalDate getStartDate() {
        return start_date;
    }

    public void setStartDate(LocalDate startDate) {
        this.start_date = startDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}