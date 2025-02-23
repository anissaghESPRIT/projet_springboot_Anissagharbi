package com.example.springdemo.entities;

import com.example.springdemo.enums.TypeMenu;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private Float prixTotal;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    // Restaurant → Menu (1 → *)
    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private Restaurant restaurant;

    // Menu → Composant (1 → *)
    @ManyToMany
    @JoinTable(
            name = "menu_composant",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "composant_id")
    )
    private Set<Composant> composants;

    // Commande → Menu (1 → *)
    @ManyToOne
    @JoinColumn(name = "idCommande")
    private Commande commande;

    // ChefCuisinier → Menu (* → *)
    @ManyToMany(mappedBy = "menus")
    private List<ChefCuisinier> chefs;
}
