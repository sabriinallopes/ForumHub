package com.alura.forumhub.controle;

import com.alura.forumhub.model.usuario;
import com.alura.forumhub.service.usuarioService;

import org.springframework.web.bind.annotation.*; // Importa @RestController, @PostMapping, etc.

import java.util.Set;

@RestController  // marca como controller REST
@RequestMapping("/usuarios")  // caminho base da API
public class controleUsuario {

    private final usuarioService usuarioService;

    public controleUsuario(usuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public String cadastrar(@RequestBody usuario usuario) {
        usuarioService.cadastrar(usuario.getNome());
        return "Usuário cadastrado: " + usuario.getNome();
    }

    @GetMapping
    public Set<String> listar() {
        return usuarioService.listarUsuarios();
    }
}
