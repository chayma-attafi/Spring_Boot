package tn.esprit.spring.com.example.projectspring.Controler;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.BlocService;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.FoyerServiceImpl;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("foyer")
public class FoyerController {
    FoyerServiceImpl foyerService;

    @GetMapping("/retrieveFoyers")
    public List<Foyer> retrieveFoyer() {

        return foyerService.retrieveAllFoyers();
    }

    @PutMapping("/updateFoyer/{idFoyer}")
    public Foyer updateFoyer( @RequestBody Foyer foyer) {

        return foyerService.updateFoyer(foyer);
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {

        return foyerService.addFoyer(foyer);
    }

    @GetMapping("/retrieveFoyer/{idF}")
    public Foyer retrieveBloc(@PathVariable("idF") Integer idFoyer) {

        return foyerService.retrieveFoyer(idFoyer);
    }
    @DeleteMapping("/deleteFoyer/{idF}")
    public void removeBloc(@PathVariable("idF") Integer idFoyer) {

        foyerService.removeFoyer(idFoyer);
    }
}
