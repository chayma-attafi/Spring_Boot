package tn.esprit.spring.com.example.projectspring.ServiceInterface;

import tn.esprit.spring.com.example.projectspring.Entity.Bloc;

import java.util.List;

public interface BlocInterface {
    List<Bloc> retrieveAllBlocs();

    Bloc addBloc (Bloc b);

    Bloc updateBloc (Bloc b);

    Bloc retrieveBloc (Integer idBloc);

    void removeBloc (Integer idBloc);

    List<Bloc> findByFoyerIdFoyer(Integer idE);

}
