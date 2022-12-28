package emsi.efoot.services;

import emsi.efoot.entities.Sponsor;
import emsi.efoot.repositories.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SponsorServiceImpl implements SponsorService {

    @Autowired
    private SponsorRepository sponsorRepository;

    @Override
    public Sponsor saveSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {

        return (List<Sponsor>) sponsorRepository.findAll();
    }


    @Override
    public Sponsor updateSponsor(Sponsor sponsor, int sponsorId) {
        return null;
    }

    @Override
    public void deleteSponsorById(int sponsorId) {
        sponsorRepository.deleteById(sponsorId);
    }

    @Override
    public Optional<Sponsor> getSponsorById(int sponsorId) {
        return sponsorRepository.findById(sponsorId);
    }

    @Override
    public Sponsor getById(Long id) {

        return sponsorRepository.getById(Math.toIntExact(id));
    }

    @Override
    public List<Sponsor> findSponsorsByProprietaire(int idProprietaire) {
        return sponsorRepository.findByProprietaireId(idProprietaire);
    }
}
