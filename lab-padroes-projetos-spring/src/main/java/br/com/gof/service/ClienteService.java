package br.com.gof.service;

import br.com.gof.model.Cliente;


public interface ClienteService {
	
	//CRUD
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId (Long id);
	
	void inserir (Cliente cliente);
	
	void atualizar (Long id, Cliente cliente);
	
	void deletar (Long id);
	
}
