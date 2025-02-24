package com.example.springdemo.controllers;

import com.example.springdemo.Service.IDetailComposantService;
import com.example.springdemo.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerChaineRestauration {
    @Autowired
    IDetailComposantService detailComposantService;
}
