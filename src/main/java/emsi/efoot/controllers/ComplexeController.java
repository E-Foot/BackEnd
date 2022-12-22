package emsi.efoot.controllers;

import emsi.efoot.entities.Complexe;

import emsi.efoot.entities.Stade;
import emsi.efoot.services.ComplexeService;
import emsi.efoot.services.ComplexeServiceImpl;
import emsi.efoot.services.StadeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ComplexeController {
    @Autowired
    private ComplexeService complexeService;

    @GetMapping("/complexes")
    public List<Complexe> listComplexes() {
        return complexeService.listComplexe();
    }

    // Save operation
    @PostMapping("/complexes")
    public Complexe saveComplexes(@Valid @RequestBody Complexe complexe) {

        return complexeService.saveComplexe(complexe);
    }


    // Read operation


    // Delete operation
    @DeleteMapping("/complexes/{id}")
    public String deleteComplexeById(@PathVariable("id") int complexeId) {
        complexeService.deleteComplexeById(complexeId);
        return "Deleted Successfully";
    }
    @GetMapping("/..................../{complexeId}")
    public Complexe findComplexeById(@PathVariable int complexeId){
        return complexeService.findComplexeById(complexeId);
    }



}
