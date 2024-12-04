package org.example.controlefinancas.controller;


import org.example.controlefinancas.model.Meta;
import org.example.controlefinancas.service.MetaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MetaController {

    @Autowired
    private MetaServico metaServico;

    public Meta criar (Meta meta){
        return metaServico.salvar(meta);
    }
}
