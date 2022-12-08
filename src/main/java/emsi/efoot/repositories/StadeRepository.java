package emsi.efoot.repositories;

import emsi.efoot.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StadeRepository extends JpaRepository<Stade, Integer> {
}
