package com.example.springdemo.Service;

import com.example.springdemo.entities.ChefCuisinier;
import com.example.springdemo.repositories.ChefCuisinierRepository;
import java.util.List;

public class ChefCuisisnierService implements IChefCuisinierService {


    @Override
    public List<ChefCuisinier> retrieveAllChefCuisiniers() {
        return List.of();
    }

    @Override
    public ChefCuisinier createChefCuisinier(ChefCuisinier chefCuisinier) {
        return null;
    }

    @Override
    public ChefCuisinier updateChefCuisinierById(Long id, ChefCuisinier chefCuisinier) {
        return null;
    }

    @Override
    public void deleteChefCuisinierById(Long id) {

    }

    @Override
    public ChefCuisinier getChefCuisinierById(Long id) {
        return null;
    }

    @Override
    public List<ChefCuisinier> addChefCuisinier(List<ChefCuisinier> ChefCuisiniers) {
        return List.of();
    }
}

