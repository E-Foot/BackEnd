package emsi.efoot.services;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Evenement;

import emsi.efoot.repositories.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceImpl implements EvenementService {
    @Autowired
    private EvenementRepository evenementRepository;

    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public List<Evenement> listEvenements() {

        return (List<Evenement>) evenementRepository.findAll();
    }


    @Override
    public Evenement updateEvenement(Evenement evenement, int evenementId) {
        return null;
    }

    @Override
    public void deleteEvenementById(int evenementId) {
        evenementRepository.deleteById(evenementId);
    }

    @Override
    public Optional<Evenement> getEvenementById(int evenementId) {
        return evenementRepository.findById(evenementId);
    }

    @Override
    public Evenement getById(Long id) {

        return evenementRepository.getById(Math.toIntExact(id));
    }

    @Override
    public List<Evenement> getEvenementsByComplexe(int id) {
            return evenementRepository.findEvenementsByComplexe(id);
    }
}
