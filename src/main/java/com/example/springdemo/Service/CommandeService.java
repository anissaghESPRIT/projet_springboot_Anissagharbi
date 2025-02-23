package com.example.springdemo.Service;

import com.example.springdemo.entities.Commande;

import java.util.List;

public class CommandeService implements ICommandeService {
    @Override
    public Commande createCommande(Commande commande) {
        return null;
    }

    @Override
    public Commande updateCommande(Long id, Commande commande) {
        return null;
    }

    @Override
    public void deleteCommande(Long id) {

    }

    @Override
    public Commande getCommandeById(Long id) {
        return null;

    }

    @Override
    public List<Commande> getAllCommandes() {
        return List.of();
    }

}
