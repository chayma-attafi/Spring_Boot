package tn.esprit.spring.com.example.projectspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;

import java.time.LocalDate;
import java.io.Serializable;
import java.util.Set;
@Builder //constructeur persenaliser
@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @Column(name = "idReservation")
    String idReservation;

    @Column(name = "anneeUniversitaire")
    LocalDate anneeUniversitaire;

    @Column(name = "estValide")
     boolean estValide;

   // @JsonIgnore
   @Cascade(org.hibernate.annotations.CascadeType.ALL)
   @ToString.Exclude
    @ManyToMany
     Set<Etudiant> etudiant;

    /*@Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ToString.Exclude
    @ManyToOne
     Chambre chambre;*/

}
