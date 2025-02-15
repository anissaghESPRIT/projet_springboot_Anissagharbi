package com.example.springdemo.Service;

import com.example.springdemo.entities.Composant;

import java.util.List;

public class ComposantService implements IComposantService {
    @Override
    public Composant createComposant(Composant composant) {
        return null;
    }

    @Override
    public Composant updateComposant(Long id, Composant composant) {
        return null;
    }

    @Override
    public void deleteComposant(Long id) {

    }

    @Override
    public Composant getComposantById(Long id) {
        return null;
    }

    @Override
    public List<Composant> getAllComposants() {
        return List.of();
    }
}
