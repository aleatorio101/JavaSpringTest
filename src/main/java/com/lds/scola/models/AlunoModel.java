package com.lds.scola.models;

import com.lds.scola.enums.Estudante;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_AUNO")
public class AlunoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String matricula;
    private String endereco;
    private Estudante situacao;

    public AlunoModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estudante getSituacao() {
        return situacao;
    }

    public void setSituacao(Estudante situacao) {
        this.situacao = situacao;
    }
}
