package emsi.efoot.controllers;

import emsi.efoot.entities.Stade;
import emsi.efoot.entities.Complexe;
import emsi.efoot.services.StadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StadeController {

    @Autowired
    private StadeService stadeService;

    // Save operation
    @PostMapping("/stades")

    public Stade saveStades(@Valid @RequestBody Stade stade) {
        return stadeService.saveStade(stade);
    }


    // Read operation
    @GetMapping("/stades")

    public List<Stade> listStades() {
        return stadeService.listStades();
    }

    // Delete operation
    @DeleteMapping("/stades/{id}")

    public String deleteStadeById(@PathVariable("id") int stadeId) {
        stadeService.deleteStadeById(stadeId);
        return "Deleted Successfully";
    }

    @GetMapping("/stade/{id}")
    public Optional<Stade> getStadeById(@PathVariable("id") int stadeId){
        return stadeService.getStadeById(stadeId);
    }

}
