package emsi.efoot.repositories;

import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    Utilisateur findById(Long id);

    void deleteById(int id);
    @Query("select r from Utilisateur r where r.username=?1 and r.password=?2 ")
    Utilisateur getUtilisateurByUsername(String username,String password);
}

