package emsi.efoot.services;

import emsi.efoot.entities.Utilisateur;
import emsi.efoot.repositories.UtilisateurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {
    private UtilisateurRepository utilisateurRepository;

    public  UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public void ajouter(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public void modifier(Utilisateur utilisateur, Long id) {
        Utilisateur utilisateur1 = utilisateurRepository.getById(Math.toIntExact(id));
        if (utilisateur1 != null){

            utilisateur1.setAge(utilisateur.getAge());
            utilisateur1.setEmail(utilisateur.getEmail());
            utilisateur1.setNom(utilisateur.getNom());
            utilisateur1.setAdresse(utilisateur.getAdresse());
            utilisateur1.setPassword(utilisateur.getPassword());
            utilisateur1.setQuartier(utilisateur.getQuartier());
            utilisateur1.setTelephone(utilisateur.getTelephone());
            utilisateur1.setUsername(utilisateur.getUsername());
            utilisateur1.setVille(utilisateur.getVille());

        }
    }

    @Override
    public void supprimer(Long id) {
        utilisateurRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        return utilisateurRepository.findById(id);
    }

    @Override
    public List<Utilisateur> liste() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getUserByUserPass(String username, String password) {
        return utilisateurRepository.getUtilisateurByUsername(username,password);
    }
}
