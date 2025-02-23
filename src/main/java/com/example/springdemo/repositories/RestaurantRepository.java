package com.example.springdemo.repositories;

import com.example.springdemo.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // 1.5 Liste des restaurants ayant une capacité supérieure à 100 et dont la chaîne de restauration a été créée avant 2020
    @Query("SELECT r FROM Restaurant r WHERE r.nbPlacesMax > :capacite AND r.chaineRestauration.dateCreation < :dateCreation")
    List<Restaurant> findRestaurantsByCapacityAndChainCreationDate(@Param("capacite") Long capacite,
                                                                   @Param("dateCreation") LocalDate dateCreation);
}
