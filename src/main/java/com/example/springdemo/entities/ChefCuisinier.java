package com.example.springdemo.entities;

import com.example.springdemo.enums.TypeChef;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChefCuisinier;
    private String Nom;
    private String Prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
// ChefCuisinier → Menu (* → *)
@ManyToMany
@JoinTable(
        name = "chef_menu",
        joinColumns = @JoinColumn(name = "idChefCuisinier"),
        inverseJoinColumns = @JoinColumn(name = "id_Menu")
)
private List<Menu> menus;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
