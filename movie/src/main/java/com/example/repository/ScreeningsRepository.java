package com.example.repository;

import com.example.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningsRepository extends JpaRepository<Screening, Long> {

}