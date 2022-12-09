package emsi.efoot.services;

import emsi.efoot.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {

        void ajouter(Utilisateur utilisateur);

        void modifier(Utilisateur utilisateur,Long id);

        void supprimer(Long id);
        Utilisateur getUtilisateur(Long id);

        List<Utilisateur> liste();
        Utilisateur getUserByUserPass(String username,String password);


}
