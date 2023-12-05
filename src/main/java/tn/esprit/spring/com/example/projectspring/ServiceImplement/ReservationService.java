package tn.esprit.spring.com.example.projectspring.ServiceImplement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;
import tn.esprit.spring.com.example.projectspring.Entity.Reservation;
import tn.esprit.spring.com.example.projectspring.Repostry.ChambreResposotory;
import tn.esprit.spring.com.example.projectspring.Repostry.EtudiantReposotory;
import tn.esprit.spring.com.example.projectspring.Repostry.ReservationReposotory;
import tn.esprit.spring.com.example.projectspring.ServiceInterface.ReservationInterface;
import tn.esprit.spring.com.example.projectspring.Entity.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@AllArgsConstructor
@Service
public class ReservationService implements ReservationInterface {
    ReservationReposotory reservationReposotory;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationReposotory.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationReposotory.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationReposotory.save(r);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationReposotory.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(String idReservation) {
        reservationReposotory.deleteById(idReservation);
    }

    EtudiantReposotory etudiantReposotory;
    ChambreResposotory chambreResposotory;

    @Override
    public Reservation ajouterReservation (Integer idChambre, Integer cinEtudiant) {
        Etudiant etudiant = etudiantReposotory.findByCin(cinEtudiant);
        Chambre chambre = chambreResposotory.findById(idChambre).orElse(null);
        String numReservation=chambre.getNumeroChambre()+"-"+chambre.getBloc().getNomBloc()+"-"+etudiant.getCin();
        Reservation reservation1 =
                Reservation.builder()
                        .idReservation(numReservation)
                        .etudiant(new HashSet<>())
                        .anneeUniversitaire(LocalDate.now())
                        .estValide(true)
                        .build();
        //Reservation  reservation1 = new Reservation();
        reservationReposotory.save(reservation1);
        //affectation
        reservation1.getEtudiant().add(etudiant);
        chambre.getReservations().add(reservation1);


        return reservation1;

    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) {
        return null;
    }

}
