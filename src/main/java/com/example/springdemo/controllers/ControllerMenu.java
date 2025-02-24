package com.example.springdemo.controllers;

import com.example.springdemo.Service.IMenuService;
import com.example.springdemo.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerMenu {
    @Autowired
    IMenuService menuService;
}
