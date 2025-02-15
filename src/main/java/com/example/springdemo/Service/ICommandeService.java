package com.example.springdemo.Service;

import com.example.springdemo.entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande createCommande(Commande commande);
    Commande updateCommande(Long id, Commande commande);
    void deleteCommande(Long id);
    Commande getCommandeById(Long id);
    List<Commande> getAllCommandes();

}
