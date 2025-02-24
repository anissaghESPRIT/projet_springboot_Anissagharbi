package com.example.springdemo.controllers;

import com.example.springdemo.Service.CommandeService;
import com.example.springdemo.Service.ICommandeService;
import com.example.springdemo.entities.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerCommande {
    @Autowired
    ICommandeService commandeService;
}

