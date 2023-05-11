package com.example.se2lab.benutzer.logic.impl.usecase;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;
import com.example.se2lab.benutzer.dataaccess.api.repo.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BenutzerUseCaseImpl {
    @Autowired
    private BenutzerRepository benutzerRepository;

    public Benutzer createUser(String name, String passwort, boolean isAdmin) {
        Benutzer benutzer = new Benutzer(name,passwort,isAdmin);

        return benutzerRepository.save(benutzer);
    }

    public Benutzer findUserById(Long id) throws Exception {
        return benutzerRepository.findById(id).orElseThrow(() -> new Exception());
    }

    public void deleteUser(Long id) throws Exception {
        Benutzer benutzer = findUserById(id);
        benutzerRepository.delete(benutzer);
    }
}
