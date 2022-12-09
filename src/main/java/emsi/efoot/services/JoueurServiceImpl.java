package emsi.efoot.services;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Joueur;
import emsi.efoot.repositories.JoueurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class JoueurServiceImpl implements JoueurService{
    private JoueurRepository joueurRepository;

    public  JoueurServiceImpl(JoueurRepository joueurRepository) {
        this.joueurRepository = joueurRepository;
    }
    @Override
    public void ajouter(Joueur joueur) {
        joueurRepository.save(joueur);
    }

    @Override
    public void modifier(Joueur joueur, Long id) {

    }

    @Override
    public void supprimer(Long id) {
        joueurRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public Joueur getJoueur(Long id) {
        return joueurRepository.findById(id);
    }

    @Override
    public List<Joueur> liste() {
        return joueurRepository.findAll();
    }
}
