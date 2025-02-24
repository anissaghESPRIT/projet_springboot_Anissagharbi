package com.example.springdemo.controllers;

import com.example.springdemo.Service.ComposantService;
import com.example.springdemo.Service.IComposantService;
import com.example.springdemo.entities.Composant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerComposant {
    @Autowired
    IComposantService composantService;
}
