package com.example.se2lab.inventarobjekt.logic.api.usecase;

import com.example.se2lab.inventarobjekt.dataaccess.api.entity.InventarObjekt;

import java.util.List;

public interface InventarObjektUseCase {

    List<InventarObjekt> findAllInventarObjekte();

    void addInventarObjekt(InventarObjekt inventarObjekt);

    void deleteInventarObjekt(long Id);

    int sizeOfInventar();

    void editInventarObjectName(long id, String name);

    void editInventarObjectAnzahl(long id, int anzahl);

}
