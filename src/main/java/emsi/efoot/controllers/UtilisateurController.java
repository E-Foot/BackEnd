package emsi.efoot.controllers;

import emsi.efoot.entities.LoginRequest;
import emsi.efoot.entities.Utilisateur;
import emsi.efoot.repositories.UtilisateurRepository;
import emsi.efoot.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("utilisateur")
public class UtilisateurController {

    @Autowired
    UtilisateurService utilisateurService;

    @Autowired
    UtilisateurRepository utilisateurRepository ;

    @PostMapping
    public void ajouter(@RequestBody Utilisateur utilisateur) {
        utilisateurService.ajouter(utilisateur);
    }

    @GetMapping
    public List<Utilisateur> liste() {
        return utilisateurService.liste();
    }
    @PostMapping("/login")
    public Utilisateur getUserByUserPass(@RequestBody LoginRequest login) {
        Utilisateur user = null;
        try {
            user = utilisateurService.getUserByUserPass(login.getUsername(),login.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
        if(user!=null){
return user;
        }else{
            System.out.println("nuuull akhooya");
            return user;
        }

    }
    @GetMapping("/{id}")
    public Utilisateur getById(@PathVariable Long id) {
        return utilisateurService.getUtilisateur(id);
    }

    /*@GetMapping("/find/{username}")
    public Utilisateur getBure(@PathVariable String username) {
        return utilisateurRepository.findByUserName(username);
    }*/

    @GetMapping("/delete/{id}")
    public void supprimer(@PathVariable Long id) {
        utilisateurService.supprimer(id);

    }

    @PutMapping("/{id}")
    public void modifier(@PathVariable(value = "id", required = false) final Long id, @RequestBody Utilisateur utilisateur ) {
        utilisateurService.modifier(utilisateur,id);
    }

}
