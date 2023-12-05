package tn.esprit.spring.com.example.projectspring.ServiceInterface;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import java.util.List;
public interface FoyerInterface {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (Integer idFoyer);

    void removeFoyer (Integer idFoyer);
}
