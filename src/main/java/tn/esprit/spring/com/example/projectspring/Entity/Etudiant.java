package tn.esprit.spring.com.example.projectspring.Entity;
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

import java.util.Date;
import java.util.Set;
@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    Integer idEtudiant;

    @Column(name = "prenomE")
     String prenomE;

    @Column(name = "nomE")
     String nomE;

    @Column(name = "cin")
     Integer cin;

    @Column(name = "ecole")
     String ecole;

    @Column(name = "datedeNaissance")
     Date datedeNaissance;

    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ToString.Exclude
    @ManyToMany(mappedBy = "etudiant")
     Set<Reservation> reservations;

}
