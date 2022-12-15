package emsi.efoot.controllers;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Stade;
import emsi.efoot.services.ComplexeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComplexeController {

    @Autowired
    private ComplexeService complexeService;

    // Save operation
    @PostMapping("/complexes")
    public Complexe saveComplexes(@Valid @RequestBody Complexe complexe) {

        return complexeService.saveComplexe(complexe);
    }


    // Read operation
    @GetMapping("/complexes")
    public List<Complexe> listComplexes() {
        return complexeService.listComplexes();
    }

    // Delete operation
    @DeleteMapping("/complexes/{id}")
    public String deleteComplexeById(@PathVariable("id") int complexeId) {
        complexeService.deleteComplexeById(complexeId);
        return "Deleted Successfully";
    }


}
