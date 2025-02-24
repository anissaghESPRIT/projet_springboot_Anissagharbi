package com.example.springdemo.controllers;

import com.example.springdemo.Service.ChefCuisisnierService;
import com.example.springdemo.Service.IChefCuisinierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerChefCuisinier {
    @Autowired
    IChefCuisinierService chefCuisinierService;
}

