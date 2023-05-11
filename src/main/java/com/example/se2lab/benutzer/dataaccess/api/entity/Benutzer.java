package com.example.se2lab.benutzer.dataaccess.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

@Entity
public class Benutzer {
    @NotNull
    private boolean isAdmin;
    @NotNull
    @Column(unique = true)
    private String name;
    @NotNull
    private String passwort;

    @GeneratedValue
    @Id
    private Long id;

    public Benutzer(){

    }
    public Benutzer(String name, String passwort,boolean isAdmin){
        this.name=name;
        this.passwort=passwort;
        this.isAdmin=isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

