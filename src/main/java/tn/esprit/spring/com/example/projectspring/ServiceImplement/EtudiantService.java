package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import tn.esprit.spring.com.example.projectspring.Entity.Etudiant;
import tn.esprit.spring.com.example.projectspring.Repostry.EtudiantReposotory;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.EtudiantInterface;

import java.util.List;

public class EtudiantService implements EtudiantInterface {
    EtudiantReposotory etudiantReposotory;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantReposotory.findAll();
    }

    @Override
    public List<Etudiant> addEtudiant(List<Etudiant> etudiants) {
        return etudiantReposotory.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant b) {
        return etudiantReposotory.save(b);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantReposotory.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantReposotory.deleteById(idEtudiant);

    }
}
