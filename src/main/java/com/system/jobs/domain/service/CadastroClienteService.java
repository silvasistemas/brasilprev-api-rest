package com.system.jobs.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.jobs.domain.exception.NegocioException;
import com.system.jobs.domain.model.Cliente;
import com.system.jobs.domain.repository.ClienteRepository;

@Service
public class CadastroClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		Cliente clienteExistente = clienteRepository.findByCpf(cliente.getCpf());
		
		if (clienteExistente != null && !clienteExistente.equals(cliente)) {
			throw new NegocioException("Já existe um cliente cadastrado com este cpf.");
		}
		
		return clienteRepository.save(cliente);
	}
	
	public void excluir(Long clienteId) {
		clienteRepository.deleteById(clienteId);
	}
	
}
