package tn.esprit.spring.com.example.projectspring.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.com.example.projectspring.Entity.Chambre;
import tn.esprit.spring.com.example.projectspring.Entity.TypeChambre;

import java.util.List;

@Repository

public interface ChambreResposotory extends JpaRepository<Chambre,Integer> {
    List<Chambre> findAllByNumeroChambreIn(List<Integer> num);
    List<Chambre> findByTypeCAndBlocIdBloc(TypeChambre c, Integer idBloc);

    @Query("SELECT chambre FROM Chambre chambre , Bloc bloc where chambre.bloc.idBloc =:idbloc and chambre.typeC =:typeC")
    List<Chambre> JPQL(@Param("typeC") TypeChambre typeC,@Param("idbloc") Integer idbloc);
}
