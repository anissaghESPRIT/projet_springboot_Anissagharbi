package com.example.springdemo.repositories;

import com.example.springdemo.entities.DetailComposant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailComposantRepository extends JpaRepository<DetailComposant, Long> {
}
