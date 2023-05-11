package com.example.se2lab.inventarobjekt.dataaccess.api.repo;

import com.example.se2lab.inventarobjekt.dataaccess.api.entity.InventarObjekt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarObjektRepository extends JpaRepository<InventarObjekt,Long> {
}
