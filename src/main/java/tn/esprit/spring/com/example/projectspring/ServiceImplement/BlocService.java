package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Repostry.BlocReposototr;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.BlocInterface;
import java.util.List;

@AllArgsConstructor
@Service
public class BlocService implements BlocInterface {
    BlocReposototr blocReposototr;
    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocReposototr.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocReposototr.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocReposototr.save(b);
    }

    @Override
    public Bloc retrieveBloc(Integer idBloc) {

        return blocReposototr.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(Integer idBloc) {
        blocReposototr.deleteById(idBloc);

    }

    @Override
    public List<Bloc> findByFoyerIdFoyer(Integer idE) {
        return blocReposototr.findByFoyerIdFoyer(idE);
    }
}
