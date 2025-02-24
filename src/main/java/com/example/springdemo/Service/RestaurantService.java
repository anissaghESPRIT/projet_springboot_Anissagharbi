package com.example.springdemo.Service;

import com.example.springdemo.entities.Restaurant;
import com.example.springdemo.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService {
   @Autowired
   MenuRepository menuRepository;
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
