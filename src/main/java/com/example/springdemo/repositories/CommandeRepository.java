package com.example.springdemo.repositories;

import com.example.springdemo.entities.Client;
import com.example.springdemo.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    // 1.1 Liste des commandes d'un client
    List<Commande> findByClient_IdClient(Long idClient);

    // 1.2 Liste des commandes d'un client dont la date de commande est entre deux dates
    List<Commande> findByClientAndDateCommandeBetween(Client client, LocalDate startDate, LocalDate endDate);


    // 1.3 Liste des commandes dont la date commande est entre deux dates ordonné par prix croissant
    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAsc(LocalDate dateDebut, LocalDate dateFin);
}

