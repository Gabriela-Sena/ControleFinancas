package org.example.controlefinancas.repository;

import org.example.controlefinancas.model.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepositorio extends JpaRepository<Meta, Long> { }
