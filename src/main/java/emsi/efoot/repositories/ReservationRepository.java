package emsi.efoot.repositories;

import emsi.efoot.entities.Reservation;
import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    @Query("select r from Reservation r where r.anonceIschecked=false  ")
    List<Reservation> getAnnonces();
}
