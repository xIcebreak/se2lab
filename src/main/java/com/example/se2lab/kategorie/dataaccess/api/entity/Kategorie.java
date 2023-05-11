package com.example.se2lab.kategorie.dataaccess.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

@Entity
public class Kategorie {

    @NotNull
    private boolean adminzugriff;

    @Id
    private String kategoriename;

    public boolean isAdminzugriff() {
        return adminzugriff;
    }

    public void setAdminzugriff(boolean adminzugriff) {
        this.adminzugriff = adminzugriff;
    }

    public String getKategoriename() {
        return kategoriename;
    }

    public void setKategoriename(String kategoriename) {
        this.kategoriename = kategoriename;
    }
}
