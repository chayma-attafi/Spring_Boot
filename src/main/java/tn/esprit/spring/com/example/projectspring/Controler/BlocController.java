package tn.esprit.spring.com.example.projectspring.Controler;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.BlocService;
import tn.esprit.spring.com.example.projectspring.Entity.Bloc;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("Bloc")
public class BlocController {
    BlocService iBlocService;

    @GetMapping("/retrieveBlocs")
    public List<Bloc> retrieveBlocs() {

        return iBlocService.retrieveAllBlocs();
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {

        return iBlocService.updateBloc(bloc);
    }
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {

        return iBlocService.addBloc(bloc);
    }
    @GetMapping("/retrieveBloc/{idB}")
    public Bloc retrieveBloc(@PathVariable("idB") Integer idBloc) {
        return iBlocService.retrieveBloc(idBloc);
    }
    @DeleteMapping("/deleteBloc/{idB}")
    public void removeBloc(@PathVariable("idB") Integer idBloc) {
        iBlocService.removeBloc(idBloc);
    }

    @GetMapping("/ListDesFoyerDansBloc/{idF}")
    public List<Bloc> ListFoyerDansBloc(@PathVariable("idF") Integer idBloc) {

        return iBlocService.findByFoyerIdFoyer(idBloc);
    }
}
