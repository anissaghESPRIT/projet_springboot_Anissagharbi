package com.example.springdemo.Service;

import com.example.springdemo.entities.ChefCuisinier;
import com.example.springdemo.entities.Client;

import java.util.List;

public interface IChefCuisinierService {
    List<ChefCuisinier> retrieveAllChefCuisiniers();
    ChefCuisinier createChefCuisinier(ChefCuisinier chefCuisinier);
    ChefCuisinier updateChefCuisinierById(Long id, ChefCuisinier chefCuisinier);
    void deleteChefCuisinierById(Long id);
    ChefCuisinier getChefCuisinierById(Long id);
    List<ChefCuisinier> addChefCuisinier (List<ChefCuisinier> ChefCuisiniers);

}
