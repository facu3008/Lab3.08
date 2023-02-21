package com.ironhack.Lab308.repository;

import com.ironhack.Lab308.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository <Exposition, Long> {
}
