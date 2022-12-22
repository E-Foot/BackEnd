package emsi.efoot.services;

import emsi.efoot.entities.Stade;

import java.util.List;
import java.util.Optional;

public interface StadeService {

    // save operation
    Stade saveStade(Stade stade);

    // Read operation
    List<Stade> listStades();

    // Update operation
    Stade updateStade(Stade stade, int stadeId);

    // Delete operation
    void deleteStadeById(int stadeId);

    Optional<Stade> getStadeById(int stadeId);

    Stade getById(Long id);

}
