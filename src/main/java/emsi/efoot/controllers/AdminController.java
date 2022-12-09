package emsi.efoot.controllers;


import emsi.efoot.entities.Admin;
import emsi.efoot.services.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminService;



    @PostMapping
    public void ajouter(@RequestBody Admin admin ) {
        adminService.ajouter(admin);
    }

    @GetMapping
    public List<Admin> liste() {
        return adminService.liste();
    }

    @GetMapping("/{id}")
    public Admin getById(@PathVariable Long id) {
        return adminService.getAdmin(id);
    }

    /*@GetMapping("/find/{username}")
    public Utilisateur getBure(@PathVariable String username) {
        return utilisateurRepository.findByUserName(username);
    }*/

    @GetMapping("/delete/{id}")
    public void supprimer(@PathVariable Long id) {
        adminService.supprimer(id);

    }

}
