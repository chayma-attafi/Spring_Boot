package tn.esprit.spring.com.example.projectspring.Repostry;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerReposotry extends JpaRepository<Foyer,Integer> {



}
