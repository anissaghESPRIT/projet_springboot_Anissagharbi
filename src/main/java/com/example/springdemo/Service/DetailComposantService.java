package com.example.springdemo.Service;

import com.example.springdemo.entities.Composant;
import com.example.springdemo.entities.DetailComposant;

import java.util.List;

public class DetailComposantService implements IDetailComposantService {
    @Override
    public Composant createComposant(Composant composant) {
        return null;
    }

    @Override
    public Composant updateComposantById(Long id, Composant composant) {
        return null;
    }

    @Override
    public void deleteComposantById(Long id) {

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
