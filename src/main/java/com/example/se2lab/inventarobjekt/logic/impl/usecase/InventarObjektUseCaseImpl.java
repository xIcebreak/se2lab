package com.example.se2lab.inventarobjekt.logic.impl.usecase;

import com.example.se2lab.inventarobjekt.dataaccess.api.entity.InventarObjekt;
import com.example.se2lab.inventarobjekt.dataaccess.api.repo.InventarObjektRepository;
import com.example.se2lab.inventarobjekt.logic.api.usecase.InventarObjektUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventarObjektUseCaseImpl implements InventarObjektUseCase {

    @Autowired
    public InventarObjektRepository inventarObjektRepository;

    @Override
    public List<InventarObjekt> findAllInventarObjekte() {
        return new ArrayList<>(inventarObjektRepository.findAll());
    }

    @Override
    public void addInventarObjekt(InventarObjekt inventarObjekt) {
        inventarObjektRepository.save(inventarObjekt);
    }

    @Override
    public void deleteInventarObjekt(long id) {
        inventarObjektRepository.deleteById(id);
    }

    @Override
    public int sizeOfInventar() {
        return inventarObjektRepository.findAll().size();
    }

    @Override
    public void editInventarObjectName(long id, String name) {
        //InventarObjekt inventarObjekt = inventarObjektRepository.findById(id);
        //inventarObjekt.setName(name);
        //inventarObjektRepository.save(inventarObjekt);
    }

    @Override
    public void editInventarObjectAnzahl(long id, int anzahl) {
        //InventarObjekt inventarObjekt = inventarObjektRepository.findById(id);
        //inventarObjekt.setAnzahl(anzahl);
        //inventarObjektRepository.save(inventarObjekt);
    }

}
