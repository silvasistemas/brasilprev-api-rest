package com.system.jobs.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.jobs.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	List<Cliente> findByNome(String nome);
	List<Cliente> findByNomeContaining(String nome);
	Cliente findByEmail(String email);
	Cliente findByCpf(String cpf);
	
}
