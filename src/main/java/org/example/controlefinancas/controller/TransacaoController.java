package org.example.controlefinancas.controller;


import org.example.controlefinancas.model.Transacao;
import org.example.controlefinancas.service.TransacaoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TransacaoController {

    @Autowired
    private TransacaoServico transacaoServico;

    public Transacao criar(Transacao transacao){
        return transacaoServico.salvar(transacao);
    }
}
