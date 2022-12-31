package emsi.efoot.controllers;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Evenement;
import emsi.efoot.services.EvenementService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EvenementController {
    @Autowired
    private EvenementService evenementService;

    // Save operation
    @PostMapping("/evenements")

    public Evenement saveEvenements(@Valid @RequestBody Evenement evenement) {
        return evenementService.saveEvenement(evenement);
    }


    // Read operation
    @GetMapping("/evenements")

    public List<Evenement> listEvenements() {
        return evenementService.listEvenements();
    }

    // Delete operation
    @DeleteMapping("/evenements/{id}")
    public String deleteEvenementById(@PathVariable("id") int evenementId) {
        evenementService.deleteEvenementById(evenementId);
        return "Deleted Successfully";
    }

    @GetMapping("/evenement/{id}")
    public Optional<Evenement> getEvenementById(@PathVariable("id") int evenementId){
        return evenementService.getEvenementById(evenementId);
    }

    @GetMapping("/evenementsByComplexe")
    public List<Evenement> getEvenementsByComplexe(@RequestBody Complexe complexe) {
        return evenementService.getEvenementsByComplexe(complexe);
    }
}
