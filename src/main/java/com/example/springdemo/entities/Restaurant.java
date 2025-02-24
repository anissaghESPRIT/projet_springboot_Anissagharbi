package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;
    //chainerestauration1-->*restaurant
    @ManyToOne
    @JoinColumn(name = "id_chaine_restauration")
    private ChaineRestauration chaineRestauration;
    // Restaurant → Menu (1 → *)
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Set<Menu> menus;
}

