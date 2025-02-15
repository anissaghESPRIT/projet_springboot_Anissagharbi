package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdChaineRestauration;
    private String Libelle;
    private LocalDate DateCreation;
    //chainerestauration1-->*restaurant
    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;
}
