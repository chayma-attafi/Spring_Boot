package tn.esprit.spring.com.example.projectspring.Entity;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idFoyer")
    Integer idFoyer;

    @Column(name ="NomFoyer")
     String NomFoyer;
    @Column(name ="capitaleFoyer")
     Integer capitaleFoyer;


    //@JsonIgnoreProperties("foyer") // Add this annotation to prevent serialization of the bloc field
    //@JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ToString.Exclude
    @OneToMany(mappedBy = "foyer")
     List<Bloc> bloc;
    //@JoinColumn(name = "F") en place de mapped by

    @JsonIgnore
    @Cascade(org.hibernate.annotations.CascadeType.ALL) //aulieu de JsonIgnore je vais lire les donner partir de json
    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
     Universite universite;


}
