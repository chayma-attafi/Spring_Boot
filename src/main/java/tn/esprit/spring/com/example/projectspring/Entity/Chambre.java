package tn.esprit.spring.com.example.projectspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;


import java.io.Serializable;
import java.util.Set;
@EqualsAndHashCode
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Chambre")
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    Integer idChambre;

    @Column(name = "numeroChambre")
     Integer numeroChambre ;

    @Enumerated(EnumType.STRING)
    @Column(name = "typeC")
     TypeChambre typeC;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany
     Set<Reservation> reservations ;

    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    Bloc bloc;



}
