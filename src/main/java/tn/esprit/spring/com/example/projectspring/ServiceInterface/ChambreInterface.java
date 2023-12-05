package tn.esprit.spring.com.example.projectspring.ServiceInterface;

import org.springframework.data.repository.query.Param;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;
import tn.esprit.spring.com.example.projectspring.Entity.TypeChambre;

import java.util.List;

public interface ChambreInterface {
    List<Chambre> retrieveAllChambre();

    Chambre addChambre (Chambre b);

    Chambre updateChambre (Chambre b);

    Chambre retrieveChambre (Integer idChambre);

    void removeChambre (Integer idChambre);

    public List<Chambre> getChambresParBlocEtType (Integer idBloc, TypeChambre typeC) ;
    public List<Chambre> getChambresParBlocEtTypeJPQL (Integer idBloc, TypeChambre typeC) ;

}
