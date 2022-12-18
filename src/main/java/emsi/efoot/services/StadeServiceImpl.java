package emsi.efoot.services;

import emsi.efoot.entities.Stade;
import emsi.efoot.repositories.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadeServiceImpl implements StadeService {

    @Autowired
    private StadeRepository stadeRepository;

    @Override
    public Stade saveStade(Stade stade) {
        return stadeRepository.save(stade);
    }

    @Override
    public List<Stade> listStades() {

        return (List<Stade>) stadeRepository.findAll();
    }

    @Override
    public Stade updateStade(Stade stade, int stadeId) {
        return null;
    }

    @Override
    public void deleteStadeById(int stadeId) {
        stadeRepository.deleteById(stadeId);
    }
}
