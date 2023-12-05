package tn.esprit.spring.com.example.projectspring.Controler;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;
import tn.esprit.spring.com.example.projectspring.Entity.TypeChambre;
import tn.esprit.spring.com.example.projectspring.Entity.Universite;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.ChambreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("Chambre")
public class ChambreController {
    ChambreService chambreService;

    @GetMapping("/retrieveChambre")
    public List<Chambre> retrieveChambre() {

        return chambreService.retrieveAllChambre();
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {

        return chambreService.updateChambre(chambre);
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {

        return chambreService.addChambre(chambre);
    }
    @GetMapping("/retrieveChambre/{idC}")
    public Chambre retrieveChambre(@PathVariable("idC") Integer idChambre) {

        return chambreService.retrieveChambre(idChambre);
    }

    @DeleteMapping("/removeChambre/{idC}")
    public void removeChambre(@PathVariable("idC") Integer idChambre) {

        chambreService.removeChambre(idChambre);
    }

    @PostMapping("/affecterChambresABloc/{idBloc}")
    public Bloc affecterChambresABloc(@PathVariable("idBloc") Integer idBloc,@RequestBody List<Integer>  numChambre)
    {
        return chambreService.affecterChambresABloc(numChambre,idBloc);
    }


    @PostMapping("/getChambresParBlocEtType/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable("idBloc")Integer idBloc,@PathVariable("typeC") TypeChambre typeC) {
        return chambreService.getChambresParBlocEtType(idBloc, typeC);
    }


    @PostMapping("/getChambresParBlocEtTypeJPQL/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtTypeJPQL(Integer idBloc, TypeChambre typeC) {
        return chambreService.getChambresParBlocEtTypeJPQL(idBloc, typeC);
    }
}
