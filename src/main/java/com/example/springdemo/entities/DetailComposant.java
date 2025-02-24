package com.example.springdemo.entities;

import com.example.springdemo.enums.TypeComposant;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component

public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;
    private Float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @OneToOne
    @JoinColumn(name = "composant_id")
    private Composant composant;
}
