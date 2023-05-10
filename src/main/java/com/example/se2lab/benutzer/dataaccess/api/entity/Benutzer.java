package com.example.se2lab.benutzer.dataaccess.api.entity;

import com.example.se2lab.inventar.dataaccess.api.repo.InventarRepository;
import org.jetbrains.annotations.NotNull;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Benutzer {
    @Id
    @GeneratedValue

    private Long id;
    @NotNull
    private boolean isAdmin;
    @NotNull
    private String name;
    @NotNull
    private String passwort;

    @OneToOne

    private InventarRepository inventar;
    public Benutzer(){

    }
    public Benutzer(String name, String passwort,boolean isAdmin){
        this.name=name;
        this.passwort=passwort;
        this.isAdmin=isAdmin;
    }


    public boolean getIsAdmin(){
        return false;
    }

    public String getName() {
        return name;
    }

    public String getPasswort() {
        return passwort;
    }

}

