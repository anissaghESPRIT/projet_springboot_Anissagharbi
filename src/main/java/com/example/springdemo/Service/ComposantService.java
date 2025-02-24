package com.example.springdemo.Service;

import com.example.springdemo.entities.Composant;
import com.example.springdemo.repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
   @Autowired
   ComposantRepository composantRepository;
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
