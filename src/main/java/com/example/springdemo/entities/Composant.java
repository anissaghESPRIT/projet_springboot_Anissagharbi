package com.example.springdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity

public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdComposant;
    private String NomComposant;
    private Float Prix;
}
