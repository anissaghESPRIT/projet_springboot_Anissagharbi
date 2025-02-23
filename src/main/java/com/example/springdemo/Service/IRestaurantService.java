package com.example.springdemo.Service;

import com.example.springdemo.entities.Restaurant;
import com.example.springdemo.repositories.RestaurantRepository;

import java.util.List;

public interface IRestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant updateRestaurant(Long id, Restaurant restaurant);
    void deleteRestaurant(Long id);
    Restaurant getRestaurantById(Long id);
    List<Restaurant> getAllRestaurants();
}
