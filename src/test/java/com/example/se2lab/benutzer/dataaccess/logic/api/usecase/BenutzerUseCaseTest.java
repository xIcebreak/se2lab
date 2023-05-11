package com.example.se2lab.benutzer.dataaccess.logic.api.usecase;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;
import com.example.se2lab.benutzer.dataaccess.api.repo.BenutzerRepository;
import com.example.se2lab.benutzer.logic.api.usecase.BenutzerUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BenutzerUseCaseTest {
    @Autowired
    private BenutzerUseCase benutzerUseCase;

    @Autowired
    private BenutzerRepository benutzerRepository;

    private Benutzer benutzer;

    @BeforeEach

    public void setUp() {
        benutzer = new Benutzer("Jonas", "Passwort", false);
        benutzerRepository.save(benutzer);
    }

    @AfterEach
    public void tearDown(){
        benutzerRepository.deleteAll();
    }

    @Test
    public void createUserTest(){

    }

    @Test
    public void findUserByIdTest(){
        Benutzer benutzerTest = benutzerUseCase.findUserById(benutzer.getId());
        List<Benutzer> userList = new ArrayList<>();
        userList.add(benutzerTest);
        assertThat(userList).hasSize(1);
        assertThat(userList.contains(benutzer)).isTrue();
    }

    public void deleteUserTest(){
        List<Benutzer> userList = new ArrayList<>();
        userList.add(benutzer);

    }
}
