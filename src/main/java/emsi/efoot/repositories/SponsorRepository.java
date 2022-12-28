package emsi.efoot.repositories;

import emsi.efoot.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
}
