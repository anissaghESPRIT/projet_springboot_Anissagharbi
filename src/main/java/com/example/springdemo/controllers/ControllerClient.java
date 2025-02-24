package com.example.springdemo.controllers;

import com.example.springdemo.Service.ClientService;
import com.example.springdemo.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerClient {
    @Autowired
    IClientService clientService;
}
