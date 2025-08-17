package com.alura.forumhub.service;

import org.springframework.stereotype.Service;  // IMPORTANTE: importar @Service

import java.util.HashSet;
import java.util.Set;

@Service
public class usuarioService {
    private Set<String> usuarios = new HashSet<>();

    public void cadastrar(String nome) {
        usuarios.add(nome.toLowerCase());
    }

    public boolean existe(String nome) {
        return usuarios.contains(nome.toLowerCase());
    }

    public Set<String> listarUsuarios() {
        return usuarios;
    }
}
