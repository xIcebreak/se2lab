package com.example.se2lab.benutzer.dataaccess.api.repo;

import com.example.se2lab.benutzer.dataaccess.api.entity.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenutzerRepository extends JpaRepository<Benutzer,Long> {
}
