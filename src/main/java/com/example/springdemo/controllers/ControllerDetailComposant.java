package com.example.springdemo.controllers;

import com.example.springdemo.Service.DetailComposantService;
import com.example.springdemo.Service.IDetailComposantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class ControllerDetailComposant {
    @Autowired
    IDetailComposantService detailComposantService;
}
