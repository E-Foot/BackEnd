package emsi.efoot.services;


import emsi.efoot.entities.Sponsor;

import java.util.List;
import java.util.Optional;

public interface SponsorService {

    // save operation
    Sponsor saveSponsor(Sponsor sponsor);

    // Read operation
    List<Sponsor> listSponsors();

    // Update operation
    Sponsor updateSponsor(Sponsor sponsor, int sponsorId);

    // Delete operation
    void deleteSponsorById(int sponsorId);

    Optional<Sponsor> getSponsorById(int sponsorId);

    Sponsor getById(Long id);

}
