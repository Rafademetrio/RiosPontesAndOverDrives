package com.rafademetrio.riospontesandoverdrives.models;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private BigInteger id;

    private String nome;
    private String senha;


    public Usuario(){

    }

    public Usuario(BigInteger id, String nome, String senha ) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }




}
