package tn.esprit.spring.com.example.projectspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Universite")
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversity")
    Integer idUniversity;

    @Column(name = "nomUniversite")
     String nomUniversite;
    @Column(name = "adresse")
     String adresse;

    //@Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JsonIgnore
    @ToString.Exclude
    @OneToOne
     Foyer foyer;

}
