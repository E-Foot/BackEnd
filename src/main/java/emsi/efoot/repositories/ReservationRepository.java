package emsi.efoot.repositories;

import emsi.efoot.entities.Proprietaire;
import emsi.efoot.entities.Reservation;
import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("select r from Reservation r where r.anonceIschecked=false  ")
    List<Reservation> getAnnonces();

    @Query("SELECT r FROM Reservation r JOIN r.stade s JOIN s.complexe c JOIN c.proprietaire p WHERE p.id = :proprietaireId")
    List<Reservation> findByProprietaireId(@Param("proprietaireId") int proprietaireId);

}
