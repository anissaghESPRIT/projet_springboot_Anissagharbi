package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCommande;
    private LocalDate DateCommande;
    private Integer PourcentageRemise;
    private Float TotalRemise;
    private Float TotalCommande;
    private Long Note;
    //Client → Commande (1 → *)
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    //Commande → Menu (1 → *)
    @OneToMany(mappedBy = "commande")
    private List<Menu> menus;

}

