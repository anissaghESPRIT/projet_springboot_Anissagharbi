package com.example.springdemo.repositories;

import com.example.springdemo.entities.Composant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComposantRepository extends JpaRepository<Composant, Long> {
}
