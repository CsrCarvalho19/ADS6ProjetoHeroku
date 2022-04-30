package com.alexandre.contatos.repository;

import com.alexandre.contatos.model.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {
}