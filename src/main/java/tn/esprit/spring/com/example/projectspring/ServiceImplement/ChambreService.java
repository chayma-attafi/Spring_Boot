package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;
import tn.esprit.spring.com.example.projectspring.Repostry.BlocReposototr;
import tn.esprit.spring.com.example.projectspring.Repostry.ChambreResposotory;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.ChambreInterface;
import tn.esprit.spring.com.example.projectspring.Entity.TypeChambre;
import java.util.List;

@AllArgsConstructor
@Service
public class ChambreService implements ChambreInterface {
    ChambreResposotory chambreResposotory;
    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreResposotory.findAll();
    }

    @Override
    public Chambre addChambre(Chambre b) {
        return chambreResposotory.save(b);
    }

    @Override
    public Chambre updateChambre(Chambre b) {
        return chambreResposotory.save(b);
    }

    @Override
    public Chambre retrieveChambre(Integer idChambre) {
        return chambreResposotory.findById(idChambre).orElse(null);
    }

    @Override
    public void removeChambre(Integer idChambre) {
        chambreResposotory.deleteById(idChambre);
    }

    BlocReposototr blocReposototr;
    public Bloc affecterChambresABloc(List<Integer> numChambre, Integer idBloc) {
        List<Chambre> chambreList = chambreResposotory.findAllByNumeroChambreIn(numChambre);
        Bloc b = blocReposototr.findById(idBloc).orElse(null);
        for(Chambre chambre:chambreList)
        {
            chambre.setBloc(b);
            chambreResposotory.save(chambre);
        }

        return b;
    }

        @Override
        public List<Chambre> getChambresParBlocEtType (Integer idBloc, TypeChambre typeC) {
        return     chambreResposotory.findByTypeCAndBlocIdBloc(typeC,idBloc);

        }

        @Override
        public List<Chambre> getChambresParBlocEtTypeJPQL (Integer idBloc, TypeChambre typeC){
                return chambreResposotory.JPQL(typeC,idBloc);
        }
}
