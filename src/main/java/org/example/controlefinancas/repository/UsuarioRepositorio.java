package org.example.controlefinancas.repository;

import org.example.controlefinancas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//BUSCAR USUARIO POR EMAIL
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
