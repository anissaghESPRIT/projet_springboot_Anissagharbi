package com.example.springdemo.controllers;

import com.example.springdemo.Service.IRestaurantService;
import com.example.springdemo.Service.RestaurantService;
import com.example.springdemo.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerRestaurant {
    @Autowired
    IRestaurantService restaurantService;
}
