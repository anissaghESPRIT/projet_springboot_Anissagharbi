package com.example.springdemo.Service;

import com.example.springdemo.entities.Composant;

import java.util.List;

public interface IDetailComposantService {
    Composant createComposant(Composant composant);
    Composant updateComposantById(Long id, Composant composant);
    void deleteComposantById(Long id);
    Composant getComposantById(Long id);
    List<Composant> getAllComposants();
}
