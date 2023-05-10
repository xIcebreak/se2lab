package com.example.se2lab.inventar.logic.api.usecase;

import com.example.se2lab.inventar.dataaccess.api.entity.InventarObjekt;

import java.util.List;

public interface InventarObjektUseCase {

    List<InventarObjekt> findAllInventarObjekte();

    void addInventarObjekt();

    void deleteInventarObjekt();

    int sizeOfInventar();

    void editInventarObject();

}
