package tn.esprit.spring.com.example.projectspring.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.com.example.projectspring.Entity.Etudiant;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.EtudiantService;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.EtudiantInterface;

import java.util.List;

public class EtudiantController {
    EtudiantInterface etudiantInterface;


    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant() {
        return etudiantInterface.retrieveAllEtudiant();
    }

    @PostMapping("/addEtudiant")
    public List<Etudiant> addEtudiant(@RequestBody List<Etudiant> etudiants) {
        return etudiantInterface.addEtudiant(etudiants);
    }

    public Etudiant updateEtudiant(Etudiant b) {
        return etudiantInterface.updateEtudiant(b);
    }

    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantInterface.retrieveEtudiant(idEtudiant);
    }

    public void removeEtudiant(Integer idEtudiant) {
        etudiantInterface.removeEtudiant(idEtudiant);
    }
}
