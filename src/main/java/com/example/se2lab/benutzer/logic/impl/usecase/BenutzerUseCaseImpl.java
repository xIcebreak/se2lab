package com.example.se2lab.benutzer.logic.impl.usecase;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;
import com.example.se2lab.benutzer.dataaccess.api.repo.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BenutzerUseCaseImpl {
    @Autowired
    private BenutzerRepository benutzerRepository;


    @Override
    public Benutzer createUser(String name, String passwort, boolean isAdmin) {
        Benutzer benutzer = new Benutzer(name,passwort,isAdmin);

        return benutzerRepository.save(benutzer);
    }

    @Override
    public Benutzer findUserById(Long id) throws Exception {
        return benutzerRepository.findById(id).orElseThrow(() -> new Exception;
    }

    @Override
    public void deleteUser(Long id) {
        Benutzer benutzer = findUserById(id);
        benutzerRepository.delete(benutzer);
    }
}
