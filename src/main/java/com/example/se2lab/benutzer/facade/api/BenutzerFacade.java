package com.example.se2lab.benutzer.facade.api;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;

public interface BenutzerFacade {
    Benutzer createUser();
    Benutzer findUserById();
    void deleteUser();
}
