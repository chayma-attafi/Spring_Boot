package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import tn.esprit.spring.com.example.projectspring.Repostry.FoyerReposotry;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.FoyerInterface;

import java.util.List;

@AllArgsConstructor
@Service
public class FoyerServiceImpl implements FoyerInterface {

    FoyerReposotry foyerReposotry; //1 er injection avec instance
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerReposotry.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerReposotry.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerReposotry.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Integer idFoyer) {
        return foyerReposotry.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Integer idFoyer) {
        foyerReposotry.deleteById(idFoyer);

    }


}
