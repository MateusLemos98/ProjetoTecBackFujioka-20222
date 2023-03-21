package br.com.fujideia.iesp.tecback.web;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class FilmeController {

    @Autowired
    private FilmeService service;

    public ResponseEntity<Filme> salvar(Filme filme){
        filme = service.salvar(filme);
        return ResponseEntity.ok(filme);
    }
}
