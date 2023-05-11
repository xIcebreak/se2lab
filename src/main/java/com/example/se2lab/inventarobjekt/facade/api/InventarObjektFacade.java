package com.example.se2lab.inventarobjekt.facade.api;

import com.example.se2lab.inventarobjekt.dataaccess.api.entity.InventarObjekt;

import java.util.List;

public interface InventarObjektFacade {
    List<InventarObjekt> findAllInventarObjekte();

    void addInventarObjekt();

    void deleteInventarObjekt();

    int sizeOfInventar();

    void editInventarObject();



}
