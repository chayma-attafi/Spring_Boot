package tn.esprit.spring.com.example.projectspring.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.com.example.projectspring.Entity.Universite;

@Repository
public interface UniversityReposotory extends JpaRepository<Universite,Integer> {
    Universite findByNomUniversiteLike(String nom);
}
