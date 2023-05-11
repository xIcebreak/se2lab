package com.example.se2lab.inventarobjekt.logic.api.usecase;

import com.example.se2lab.inventarobjekt.dataaccess.api.entity.InventarObjekt;

import java.util.List;

public interface InventarObjektUseCase {

    List<InventarObjekt> findAllInventarObjekte();

    void addInventarObjekt();

    void deleteInventarObjekt();

    int sizeOfInventar();

    void editInventarObject();

}
