package br.edu.fafic.example.restconsumospring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Microrregiao implements Serializable {

    @Id
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Mesorregiao mesorregiao;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mesorregiao getMesorregiao() {
        return mesorregiao;
    }

    public void setMesorregiao(Mesorregiao mesorregiao) {
        this.mesorregiao = mesorregiao;
    }

    @Override
    public String toString() {
        return "Microrregiao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", mesorregiao=" + mesorregiao +
                '}';
    }
}
