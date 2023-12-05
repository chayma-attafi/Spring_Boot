package tn.esprit.spring.com.example.projectspring.Controler;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.com.example.projectspring.Entity.Foyer;
import tn.esprit.spring.com.example.projectspring.Entity.Universite;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.UniversiteService;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("University")
public class UniversityController {
    UniversiteService universiteService;

    @GetMapping("/retrieveUniversity")
    public List<Universite> retrieveUniversity() {

        return universiteService.retrieveAllUniversity();
    }

    @PutMapping("/updateUniversity")
    public Universite updateUniversity(@RequestBody Universite universite) {

        return universiteService.updateUniversity(universite);
    }

    @PostMapping("/addUniversity")
    public Universite addUniversity(@RequestBody Universite u) {

        return universiteService.addUniversity(u);
    }
    @GetMapping("/retrieveUniversity/{idB}")
    public Universite retrieveUniversity(@PathVariable("idB") Integer idBloc) {

        return universiteService.retrieveUniversity(idBloc);
    }

    @DeleteMapping("/deleteUniversity/{idB}")
    public void deleteUniversity(@PathVariable("idB") Integer idUniversity) {

        universiteService.removeUniversity(idUniversity);
    }

    @PostMapping("/affecterFoyer/{idF}/{nomUniversity}")
    public Universite affecterFoyer(@PathVariable("idF") Integer idF ,
                                    @PathVariable("nomUniversity") String nomUniversity)
    {

        return universiteService.affecterFoyer(idF,nomUniversity);
    }

    @PostMapping("/desaffecterFoyerAUniversite/{idF}")
    public Universite desaffecterFoyerAUniversite(@PathVariable("idF") Integer idF )
    {
        return universiteService.desaffecterFoyerAUniversite(idF);
    }

    @PostMapping("/ajouterFoyerEtAffecterAUniversite/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer , @PathVariable("idUniversite") Integer idUniversite) {
        return universiteService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
