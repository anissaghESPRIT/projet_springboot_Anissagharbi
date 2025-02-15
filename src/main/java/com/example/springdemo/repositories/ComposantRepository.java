package com.example.springdemo.repositories;

import com.example.springdemo.entities.Composant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComposantRepository extends JpaRepository<Composant, Long> {
}
