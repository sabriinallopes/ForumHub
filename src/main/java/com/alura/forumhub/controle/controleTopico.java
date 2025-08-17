package com.alura.forumhub.controle;

import com.alura.forumhub.model.topico;
import com.alura.forumhub.service.topicoService;
import com.alura.forumhub.service.usuarioService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class controleTopico {

    private final topicoService topicoService;
    private final usuarioService usuarioService;

    public controleTopico(topicoService topicoService, usuarioService usuarioService) {
        this.topicoService = topicoService;
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<String> criar(@RequestBody topico topico) {
        if (!usuarioService.existe(topico.getAutor())) {
            return ResponseEntity.badRequest().body("Usuário não cadastrado.");
        }
        topicoService.adicionar(topico);
        return ResponseEntity.ok("Tópico criado com sucesso!");
    }

    @GetMapping
    public List<topico> listar() {
        return topicoService.listar();
    }
}
