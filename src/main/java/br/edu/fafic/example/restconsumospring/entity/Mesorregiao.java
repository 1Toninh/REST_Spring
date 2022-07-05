package br.edu.fafic.example.restconsumospring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Mesorregiao implements Serializable {

    @Id
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Uf UF;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Uf getUF() {
        return UF;
    }

    public void setUF(Uf UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Mesorregiao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", uf=" + UF +
                '}';
    }
}
