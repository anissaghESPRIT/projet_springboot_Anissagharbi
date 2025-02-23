package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;
    @ManyToMany(mappedBy = "composants")
    private Set<Menu> menus;
    // Menu → Composant (1 → *)
    @ManyToOne
    @JoinColumn(name = "idMenu")
    private Menu menu;
    @OneToOne(mappedBy = "composant")
    private DetailComposant detailComposant;


}
