package com.example.se2lab.benutzer.logic.api.usecase;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;

public interface BenutzerUseCase {
    Benutzer createUser(String name,String passwort,boolean isAdmin);
    Benutzer findUserById(Long id);
    void deleteUser(Long id);

}
