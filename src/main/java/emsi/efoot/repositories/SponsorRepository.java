package emsi.efoot.repositories;

import emsi.efoot.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
    List<Sponsor> findByProprietaireId(int idProprietaire);
}
