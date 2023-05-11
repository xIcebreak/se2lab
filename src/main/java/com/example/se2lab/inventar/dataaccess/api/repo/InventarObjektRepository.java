package com.example.se2lab.inventar.dataaccess.api.repo;

import com.example.se2lab.inventar.dataaccess.api.entity.InventarObjekt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarObjektRepository extends JpaRepository<InventarObjekt,Long> {
}
