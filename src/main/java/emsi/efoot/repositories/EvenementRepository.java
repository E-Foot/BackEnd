package emsi.efoot.repositories;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
        @Query("SELECT e FROM Evenement e WHERE e.proprietaire.complexe = :complexe")
        List<Evenement> findEvenementsByComplexe(@Param("complexe") Complexe complexe);
}
