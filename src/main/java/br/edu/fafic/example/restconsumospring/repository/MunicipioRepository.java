package br.edu.fafic.example.restconsumospring.repository;

import br.edu.fafic.example.restconsumospring.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Long>{

    @Query("select m.microrregiao.mesorregiao.UF.regiao from Municipio m where m.id = :idMunicipio")
    Regiao findRegiaoByIdMunicipio(Long idMunicipio);

    @Query("select m.microrregiao.mesorregiao.UF.regiao from Municipio m where m.microrregiao.mesorregiao.UF.regiao.id = :idRegiao")
    Regiao findByIdRegiao(Long idRegiao);

    @Query("select m.microrregiao.mesorregiao.UF from Municipio m where m.microrregiao.mesorregiao.UF.id = :idUf")
    Uf findByIdUf(Long idUf);

    @Query("select m.microrregiao.mesorregiao from Municipio m where m.microrregiao.mesorregiao.id = :idMeso")
    Mesorregiao findByIdMesorregiao(Long idMeso);

    @Query("select m.microrregiao from Municipio m where m.microrregiao.id = :idMicro")
    Microrregiao findByIdMicrorregiao(Long idMicro);
}