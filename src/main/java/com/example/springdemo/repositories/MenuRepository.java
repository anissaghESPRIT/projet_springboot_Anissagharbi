package com.example.springdemo.repositories;

import com.example.springdemo.entities.Menu;
import com.example.springdemo.enums.TypeComposant;
import com.example.springdemo.enums.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    // 1.4 Liste des menus selon le type menu avec le prix total des composants supérieur à un montant donné
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float montant);

    // 2.1 Liste des noms de menus par type de menu, ordonnée par prix total
    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal ASC")
    List<String> findMenuNamesByTypeMenuOrderedByPrixTotal(@Param("typeMenu") TypeMenu typeMenu);

    // 2.2 Liste des menus contenant un certain type de composant (exemple : viande blanche)
    @Query("SELECT DISTINCT m FROM Menu m JOIN m.composants c JOIN c.detailComposant d WHERE d.typeComposant = :typeComposant")
    List<Menu> findMenusByTypeComposant(@Param("typeComposant") TypeComposant typeComposant);
}
