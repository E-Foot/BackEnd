package emsi.efoot.services;

import emsi.efoot.entities.Admin;
import emsi.efoot.repositories.AdminRepository;
import emsi.efoot.repositories.UtilisateurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
    private AdminRepository adminRepository;

    public  AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    @Override
    public void ajouter(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void modifier(Admin admin, Long id) {

    }

    @Override
    public void supprimer(Long id) {
        adminRepository.deleteById(Math.toIntExact(id));

    }

    @Override
    public Admin getAdmin(Long id) {
        return adminRepository.findById(id);
    }

    @Override
    public List<Admin> liste() {
        return adminRepository.findAll();
    }
}
