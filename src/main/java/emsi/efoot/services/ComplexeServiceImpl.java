package emsi.efoot.services;

import emsi.efoot.entities.Complexe;
import emsi.efoot.entities.Stade;
import emsi.efoot.repositories.ComplexeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplexeServiceImpl implements ComplexeService{
    @Autowired
    ComplexeRepository complexeRepository;

    @Override
    public Complexe saveComplexe(Complexe complexe) {
      return complexeRepository.save(complexe);
    }

    @Override
    public List<Complexe> listComplexe() {
        return (List<Complexe>) complexeRepository.findAll();
    }

    @Override
    public Complexe updateComplexe(Complexe complexe, int ComplexeId) {
        return null;
    }

    @Override
    public void deleteComplexeById(int ComplexeId) {

    }
    public Complexe findComplexeById(int complexeId) {
        return complexeRepository.findComplexeById(complexeId);
    }
}
