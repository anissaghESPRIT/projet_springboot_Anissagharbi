package com.example.springdemo.Service;

import com.example.springdemo.entities.Composant;

import java.util.List;

public interface IComposantService {
    Composant createComposant(Composant composant);
    Composant updateComposant(Long id, Composant composant);
    void deleteComposant(Long id);
    Composant getComposantById(Long id);
    List<Composant> getAllComposants();
}
