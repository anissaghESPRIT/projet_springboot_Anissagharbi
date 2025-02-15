package com.example.springdemo.repositories;

import com.example.springdemo.entities.DetailComposant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long> {
}
