package emsi.efoot.repositories;

import emsi.efoot.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
}
