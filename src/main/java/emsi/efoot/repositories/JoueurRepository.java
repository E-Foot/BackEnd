package emsi.efoot.repositories;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Joueur;
import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface JoueurRepository extends JpaRepository<Joueur, Integer> {
    Joueur findById(Long id);
    @Modifying
    @Query("update Joueur u set u.etatSignal = ?1 where u.id=?2")
    void UpdateEtatSignal(Boolean etat, long id);
    @Query("select r.etatSignal from Joueur r where r.id=?1")
    Boolean getEtatSignalById( long id);
}
