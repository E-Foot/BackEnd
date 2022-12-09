package emsi.efoot.services;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Joueur;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface JoueurService {
    void ajouter(Joueur joueur );

    void modifier(Joueur joueur,Long id);

    void supprimer(Long id);
    Joueur getJoueur(Long id);

    List<Joueur> liste();
}
