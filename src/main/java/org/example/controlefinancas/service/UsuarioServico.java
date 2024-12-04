package org.example.controlefinancas.service;

import org.example.controlefinancas.model.Usuario;
import org.example.controlefinancas.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    public Usuario salvar(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    public Usuario buscarPorEmail(String email){
        return usuarioRepositorio.findByEmail(email);
    }

}
