package com.example.se2lab.inventarobjekt.dataaccess.api.entity;

import com.example.se2lab.kategorie.dataaccess.api.entity.Kategorie;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
public class InventarObjekt {

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(unique = true)
    private String qrCode;

    @NotNull
    private int anzahl;

    private String standort;

    @NotNull
    private boolean adminzugriff;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "kategoriename")
    private Kategorie kategorie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public boolean isAdminzugriff() {
        return adminzugriff;
    }

    public void setAdminzugriff(boolean adminzugriff) {
        this.adminzugriff = adminzugriff;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
