package tn.esprit.spring.com.example.projectspring.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.com.example.projectspring.Entity.Reservation;

@Repository
public interface ReservationReposotory extends JpaRepository<Reservation,String> {
}
