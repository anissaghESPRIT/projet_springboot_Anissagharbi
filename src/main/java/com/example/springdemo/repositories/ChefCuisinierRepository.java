package com.example.springdemo.repositories;

import com.example.springdemo.entities.ChefCuisinier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefCuisinierRepository extends CrudRepository<ChefCuisinier,Integer> {
}
