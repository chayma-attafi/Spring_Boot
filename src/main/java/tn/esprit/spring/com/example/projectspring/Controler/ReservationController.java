package tn.esprit.spring.com.example.projectspring.Controler;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.com.example.projectspring.Entity.Reservation;
import tn.esprit.spring.com.example.projectspring.ServiceImplement.ReservationService;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.ReservationInterface;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("Reservation")
public class ReservationController {

    ReservationService reservationService;

    @PostMapping("/ajouterReservation/{idChambre}/{cinEtudiant}")
    public Reservation ajouterReservation(@PathVariable("idChambre") Integer idChambre,@PathVariable("cinEtudiant") Integer cinEtudiant) {
        return reservationInterface.ajouterReservation(idChambre, cinEtudiant);
    }

    ReservationInterface reservationInterface;

    @GetMapping("/retrieveReservation")
    public List<Reservation> retrieveReservation() {

        return reservationService.retrieveAllReservation();
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {

        return reservationService.updateReservation(reservation);
    }

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation u) {

        return reservationService.addReservation(u);
    }
    @GetMapping("/retrieveReservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable("idReservation") String idReservation) {

        return reservationService.retrieveReservation(idReservation);
    }

    @DeleteMapping("/deleteReservation/{idB}")
    public void deleteReservation(@PathVariable("idB") String idReservation) {

        reservationService.removeReservation(idReservation);
    }



}
