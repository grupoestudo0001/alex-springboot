package br.com.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.financeiro.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {}
