package org.example.controlefinancas.repository;

import org.example.controlefinancas.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepositorio extends JpaRepository<Transacao, Long> { }
