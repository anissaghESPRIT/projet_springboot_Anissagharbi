package com.example.springdemo.repositories;

import com.example.springdemo.entities.ChaineRestauration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
}
