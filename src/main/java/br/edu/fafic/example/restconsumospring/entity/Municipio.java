package br.edu.fafic.example.restconsumospring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Municipio implements Serializable {

    @Id
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Microrregiao microrregiao;

    public Municipio() {
    }

    public Municipio(Long id, String nome, Microrregiao microrregiao) {
        this.id = id;
        this.nome = nome;
        this.microrregiao = microrregiao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Microrregiao getMicrorregiao() {
        return microrregiao;
    }

    public void setMicrorregiao(Microrregiao microrregiao) {
        this.microrregiao = microrregiao;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "Id=" + id +
                ", nome='" + nome + '\'' +
                ", microrregiao=" + microrregiao +
                '}';
    }
}
