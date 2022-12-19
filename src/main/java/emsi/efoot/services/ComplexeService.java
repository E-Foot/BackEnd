package emsi.efoot.services;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Stade;

import java.util.List;

public interface ComplexeService {

    // save operation
    Complexe saveComplexe(Complexe complexe);

    // Read operation
    List<Complexe> listComplexes();

    // Update operation
    Complexe updateComplexe(Complexe complexe, int complexeId);

    // Delete operation
    void deleteComplexeById(int complexeId);

    Complexe findComplexeByStades(List<Stade> stadeList);

    Complexe findComplexeById(int complexeId);
}
