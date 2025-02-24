package com.example.springdemo.Service;

import com.example.springdemo.entities.Commande;
import com.example.springdemo.repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
  @Autowired
  CommandeRepository commandeRepository;
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
