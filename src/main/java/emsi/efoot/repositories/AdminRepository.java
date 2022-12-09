package emsi.efoot.repositories;

import emsi.efoot.entities.Admin;
import emsi.efoot.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findById(Long id);
}

