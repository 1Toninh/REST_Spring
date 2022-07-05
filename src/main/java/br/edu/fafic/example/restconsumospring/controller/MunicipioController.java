package br.edu.fafic.example.restconsumospring.controller;

import br.edu.fafic.example.restconsumospring.entity.*;
import br.edu.fafic.example.restconsumospring.repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class MunicipioController {

    @Autowired
    private MunicipioRepository _municipioRepository;

    //GET
    @RequestMapping(value = "/municipio", method = RequestMethod.GET)
    public List<Municipio> Get(){
        return _municipioRepository.findAll();
    }

    //FindByID-Municipio
    @RequestMapping(value = "/municipio/{id}", method = RequestMethod.GET)
    public ResponseEntity<Municipio> findById(@PathVariable(value = "id") Long id){
        Optional<Municipio> municipioOptional = _municipioRepository.findById(id);
        if(municipioOptional.isPresent()){
            return new ResponseEntity<Municipio>(municipioOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //FindByID Regiao
        @RequestMapping(value = "/regiao/municipio/{id}", method = RequestMethod.GET)
    public ResponseEntity<Regiao> findRegiaoByIdMunicipio(@PathVariable(value = "id") Long id){
        Regiao regiao = _municipioRepository.findRegiaoByIdMunicipio(id);
        return ResponseEntity.ok().body(regiao);
    }

    //FindByID Regiao
    @RequestMapping(value = "/regiao/{id}", method = RequestMethod.GET)
    public ResponseEntity<Regiao> findRegiaoById(@PathVariable(value = "id") Long id){
        Regiao regiao = _municipioRepository.findByIdRegiao(id);
        return ResponseEntity.ok().body(regiao);
    }

    //FindByID Uf
    @RequestMapping(value = "/uf/{id}", method = RequestMethod.GET)
    public ResponseEntity<Uf> findUfById(@PathVariable(value = "id") Long id){
        Uf uf = _municipioRepository.findByIdUf(id);
        return ResponseEntity.ok().body(uf);
    }

    //FindByID Mesorregiao
    @RequestMapping(value = "/mesorregiao/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mesorregiao> findMesorregiaoById(@PathVariable(value = "id") Long id){
        Mesorregiao mesorregiao = _municipioRepository.findByIdMesorregiao(id);
        return ResponseEntity.ok().body(mesorregiao);
    }

    //FindByID Microrregiao
    @RequestMapping(value = "/microrregiao/{id}", method = RequestMethod.GET)
    public ResponseEntity<Microrregiao> findMicrorregiaoById(@PathVariable(value = "id") Long id){
        Microrregiao microrregiao = _municipioRepository.findByIdMicrorregiao(id);
        return ResponseEntity.ok().body(microrregiao);
    }

    //POST
    @RequestMapping(value = "/municipio", method = RequestMethod.POST)
    public Municipio Post(@RequestBody Municipio municipio){
        return _municipioRepository.save(municipio);
    }

    //PUT
    @RequestMapping(value = "/municipio/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Municipio> Put(@PathVariable(value = "id") long id, @RequestBody Municipio newMunicipio){
        Optional<Municipio> municipioOld = _municipioRepository.findById(id);
        if (municipioOld.isPresent()){
            Municipio municipio1 = municipioOld.get();
            municipio1.setNome(newMunicipio.getNome());
            _municipioRepository.save(municipio1);
            return new ResponseEntity<Municipio>(municipio1, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //DELETE
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id){
        Optional<Municipio> municipio = _municipioRepository.findById(id);
        if(municipio.isPresent()){
            _municipioRepository.delete(municipio.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
