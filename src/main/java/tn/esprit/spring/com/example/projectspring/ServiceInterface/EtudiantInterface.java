package tn.esprit.spring.com.example.projectspring.ServiceInterface;

import tn.esprit.spring.com.example.projectspring.Entity.Etudiant;

import java.util.List;

public interface EtudiantInterface {
    List<Etudiant> retrieveAllEtudiant();

    List<Etudiant> addEtudiant (List<Etudiant> b);

    Etudiant updateEtudiant (Etudiant b);

    Etudiant retrieveEtudiant (Integer idEtudiant);

    void removeEtudiant (Integer idEtudiant);
}
