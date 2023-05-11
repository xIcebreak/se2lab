package com.example.se2lab.kategorie.dataaccess.api.repo;

import com.example.se2lab.kategorie.dataaccess.api.entity.Kategorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategorieRepository extends JpaRepository<Kategorie,Long> {
}
