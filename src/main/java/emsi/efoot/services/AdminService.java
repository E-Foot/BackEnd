package emsi.efoot.services;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Utilisateur;

import java.util.List;

public interface AdminService {
    void ajouter(Admin admin );

    void modifier(Admin admin,Long id);

    void supprimer(Long id);
    Admin getAdmin(Long id);

    List<Admin> liste();
}
