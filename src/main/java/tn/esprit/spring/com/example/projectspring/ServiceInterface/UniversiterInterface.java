package tn.esprit.spring.com.example.projectspring.ServiceInterface;

import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import tn.esprit.spring.com.example.projectspring.Entity.Universite;

import java.util.List;

public interface UniversiterInterface {
    List<Universite> retrieveAllUniversity();

    Universite addUniversity (Universite u);

    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (Integer idUni);

    void removeUniversity (Integer idUni);
    public Universite affecterFoyer(Integer idFoyer, String nomUniversity);

    public Universite desaffecterFoyerAUniversite (Integer idUniversite) ;
}
