package tn.esprit.spring.com.example.projectspring.ServiceInterface;

import tn.esprit.spring.com.example.projectspring.Entity.Reservation;

import java.util.List;
import java.util.Date;
public interface ReservationInterface {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation r);

    Reservation updateReservation(Reservation r);

    Reservation retrieveReservation (String idReservation);

    void removeReservation (String idReservation);
    public Reservation ajouterReservation (Integer idChambre, Integer cinEtudiant);
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite( Date anneeUniversite, String nomUniversite) ;

}
