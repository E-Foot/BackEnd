package emsi.efoot.repositories;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Joueur;
import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {
    Joueur findById(Long id);
}
