package org.example.controlefinancas.service;

import org.example.controlefinancas.model.Meta;
import org.example.controlefinancas.repository.MetaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class MetaServico {

    @Autowired
    private MetaRepositorio metaRepositorio;

    public Meta salvar(Meta meta){
        return metaRepositorio.save(meta);
    }
}
