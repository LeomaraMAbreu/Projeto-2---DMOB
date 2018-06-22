package com.example.leomara.projetomobile;

import java.io.Serializable;

public class Telefone {

    private Long id;
    private String nome;
    private String operadora;
    private long numero;

    @Override
    public String toString() {
        return nome.toString();
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

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long quantidade) {
        this.numero = quantidade;
    }

}
