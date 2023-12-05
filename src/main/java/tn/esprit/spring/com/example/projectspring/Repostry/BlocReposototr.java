package tn.esprit.spring.com.example.projectspring.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;

import java.util.List;

@Repository
public interface BlocReposototr extends JpaRepository<Bloc,Integer> {
    List<Bloc>findByFoyerIdFoyer(Integer idF);
}
