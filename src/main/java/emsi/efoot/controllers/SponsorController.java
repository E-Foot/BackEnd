package emsi.efoot.controllers;

import emsi.efoot.entities.Sponsor;
import emsi.efoot.services.SponsorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    // Save operation
    @PostMapping("/sponsors")

    public Sponsor saveSponsors(@Valid @RequestBody Sponsor sponsor) {
        return sponsorService.saveSponsor(sponsor);
    }


    // Read operation
    @GetMapping("/sponsors")

    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    // Delete operation
    @DeleteMapping("/sponsors/{id}")
    public String deleteSponsorById(@PathVariable("id") int sponsorId) {
        sponsorService.deleteSponsorById(sponsorId);
        return "Deleted Successfully";
    }

    @GetMapping("/sponsor/{id}")
    public Optional<Sponsor> getSponsorById(@PathVariable("id") int sponsorId){
        return sponsorService.getSponsorById(sponsorId);
    }

    @GetMapping("/sponsors/{idProprietaire}")
    public List<Sponsor> findSponsorsByProprietaire(@PathVariable int idProprietaire) {
        return sponsorService.findSponsorsByProprietaire(idProprietaire);
    }
}
