package com.agenda.dataBase;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
