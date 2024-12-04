package org.example.controlefinancas.service;

import org.example.controlefinancas.model.Transacao;
import org.example.controlefinancas.repository.TransacaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoServico {

    @Autowired
    private TransacaoRepositorio transacaoRepositorio;

    public Transacao salvar(Transacao transacao){
        return transacaoRepositorio.save(transacao);
    }

}
