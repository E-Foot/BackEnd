package emsi.efoot.repositories;

import emsi.efoot.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StadeRepository extends JpaRepository<Stade, Integer> {
    List<Stade> findByComplexeId(int idComplexe);
}
