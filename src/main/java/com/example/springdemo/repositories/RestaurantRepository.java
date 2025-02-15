package com.example.springdemo.repositories;

import com.example.springdemo.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
