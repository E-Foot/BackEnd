package emsi.efoot.services;

import emsi.efoot.entities.Complexe;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface ComplexeService {



    Complexe saveComplexe(Complexe complexe);

    Complexe findComplexeById(int complexeId);

    List<Complexe> listComplexe();


    Complexe updateComplexe(Complexe complexe, int ComplexeId);


    void deleteComplexeById(int ComplexeId);

}
