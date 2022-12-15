package emsi.efoot.repositories;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ComplexeRepository extends JpaRepository<Complexe, Integer> {

    Complexe findComplexeByListStadesIn(List<Stade> stadeList);
}
