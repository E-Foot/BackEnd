package emsi.efoot.controllers;

import emsi.efoot.entities.Joueur;
import emsi.efoot.entities.Utilisateur;
import emsi.efoot.repositories.UtilisateurRepository;
import emsi.efoot.services.JoueurService;
import emsi.efoot.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("joueur")
public class JoueurController {
    @Autowired
    JoueurService joueurService;
    @PutMapping("/updateEtatSignal/{id}")
    public void updateSyndic(@PathVariable(value = "id") long id) {

     if(joueurService.getEtatSignalById(id)==true){
         joueurService.UpdateEtatSignal(true,id);
     }else    joueurService.UpdateEtatSignal(false,id);
    }


    @PostMapping
    public void ajouter(@RequestBody Joueur joueur) {
        joueurService.ajouter(joueur);
    }

    @GetMapping
    public List<Joueur> liste() {
        return joueurService.liste();
    }

    @GetMapping("/{id}")
    public Joueur getById(@PathVariable Long id) {
        return joueurService.getJoueur(id);
    }

    /*@GetMapping("/find/{username}")
    public Utilisateur getBure(@PathVariable String username) {
        return utilisateurRepository.findByUserName(username);
    }*/

    @GetMapping("/delete/{id}")
    public void supprimer(@PathVariable Long id) {
        joueurService.supprimer(id);

    }


}
