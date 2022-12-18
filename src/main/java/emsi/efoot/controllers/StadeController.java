package emsi.efoot.controllers;

import emsi.efoot.entities.Stade;
import emsi.efoot.services.StadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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

}
