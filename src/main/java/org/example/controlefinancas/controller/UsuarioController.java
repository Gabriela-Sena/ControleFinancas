package org.example.controlefinancas.controller;


import org.example.controlefinancas.model.Usuario;
import org.example.controlefinancas.service.UsuarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    private UsuarioServico usuarioServico;

    public Usuario criar(Usuario usuario){
        return usuarioServico.salvar(usuario);
    }

    public Usuario buscar(String email){
        return usuarioServico.buscarPorEmail(email);
    }

}
