package com.example.springdemo.repositories;

import com.example.springdemo.entities.ChefCuisinier;
import org.springframework.data.repository.CrudRepository;

public interface ChefCuisinierRepository extends CrudRepository<ChefCuisinier,Integer> {
}
