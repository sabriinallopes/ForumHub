package com.alura.forumhub.service;

import com.alura.forumhub.model.topico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class topicoService {
    private List<topico> topicos = new ArrayList<>();

    public void adicionar(topico topico) {
        topicos.add(topico);
    }

    public List<topico> listar() {
        return topicos;
    }
}
