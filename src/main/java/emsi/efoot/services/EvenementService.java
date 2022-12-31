package emsi.efoot.services;


import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Evenement;

import java.util.List;
import java.util.Optional;

public interface EvenementService {
    // save operation
    Evenement saveEvenement(Evenement evenement);

    // Read operation
    List<Evenement> listEvenements();

    // Update operation
    Evenement updateEvenement(Evenement evenement, int evenementId);

    // Delete operation
    void deleteEvenementById(int evenementId);

    Optional<Evenement> getEvenementById(int evenementId);

    Evenement getById(Long id);

    List<Evenement> getEvenementsByComplexe(Complexe complexe);
}
