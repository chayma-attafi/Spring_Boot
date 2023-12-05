package tn.esprit.spring.com.example.projectspring.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.com.example.projectspring.Entity.Etudiant;

@Repository

public interface EtudiantReposotory extends JpaRepository<Etudiant,Integer> {
    Etudiant findByCin(Integer cin);
}
