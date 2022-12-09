package emsi.efoot.repositories;

import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Complexe extends JpaRepository<Utilisateur, Integer> {
}
