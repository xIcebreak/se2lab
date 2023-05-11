package com.example.se2lab.inventar.dataaccess.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

@Entity
public class Kategorie {
    @NotNull
    private Long id;

    @NotNull
    private boolean adminzugriff;

    @NotNull
    @Column(unique = true)
    private String name;

    public boolean isAdminzugriff() {
        return adminzugriff;
    }

    public void setAdminzugriff(boolean adminzugriff) {
        this.adminzugriff = adminzugriff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
