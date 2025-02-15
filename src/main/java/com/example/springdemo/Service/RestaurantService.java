package com.example.springdemo.Service;

import com.example.springdemo.entities.Restaurant;

import java.util.List;

public class RestaurantService implements IRestaurantService {
    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return null;
    }

    @Override
    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        return null;
    }

    @Override
    public void deleteRestaurant(Long id) {

    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        return null;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return List.of();
    }
}
