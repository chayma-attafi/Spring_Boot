package tn.esprit.spring.com.example.projectspring.Entity;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    Integer idBloc;

    @Column(name = "NomBloc")
    private String NomBloc;

    @Column(name = "capitaleBloc")
     Integer capitaleBloc;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
     Foyer foyer;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "bloc")
     Set<Chambre> chambre;


}
