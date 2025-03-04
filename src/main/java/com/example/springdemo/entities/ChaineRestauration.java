package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;
    //chainerestauration1-->*restaurant
    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;
}
