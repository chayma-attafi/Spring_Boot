package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import tn.esprit.spring.com.example.projectspring.Entity.Universite;
import tn.esprit.spring.com.example.projectspring.Repostry.BlocReposototr;
import tn.esprit.spring.com.example.projectspring.Repostry.FoyerReposotry;
import tn.esprit.spring.com.example.projectspring.Repostry.UniversityReposotory;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.UniversiterInterface;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteService implements UniversiterInterface {

    UniversityReposotory universityReposotory;
    @Override
    public List<Universite> retrieveAllUniversity() {
        return universityReposotory.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universityReposotory.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universityReposotory.save(u);
    }

    @Override
    public Universite retrieveUniversity(Integer idUni) {
        return universityReposotory.findById(idUni).orElse(null);
    }

    @Override
    public void removeUniversity(Integer idUni) {
        universityReposotory.deleteById(idUni);
    }



    FoyerReposotry foyerReposotry;
    @Override
    public Universite affecterFoyer(Integer idFoyer, String nomUniversity){
        Foyer f= foyerReposotry.findById(idFoyer).orElse(null);
        Universite u=universityReposotory.findByNomUniversiteLike(nomUniversity);
        u.setFoyer(f);
        return universityReposotory.save(u);
    }

    @Override
    public Universite desaffecterFoyerAUniversite (Integer idUniversite) {
        Universite u=universityReposotory.findById(idUniversite).orElse(null);
        u.setFoyer(null);
        return universityReposotory.save(u);
    }

    FoyerServiceImpl foyerService;
    BlocReposototr blocReposototr;

    @Transactional
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, Integer idUniversite) {

        Universite u=universityReposotory.findById(idUniversite).orElse(null);
        Foyer f= foyerService.addFoyer(foyer);
        //affectation bloc et foyer
        for(Bloc b:foyer.getBloc())
        {
            b.setFoyer(f);
            blocReposototr.save(b);
        }
        //affectation universiter et bloc
        u.setFoyer(f);
        universityReposotory.save(u);

        return f;
    }



}
