package com.alura.forumhub.model;

public class usuario {
    private String nome;

    public usuario() {}

    public usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}