package br.com.acordocerto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acordocerto.model.Cliente;
import br.com.acordocerto.model.Roles;
import br.com.acordocerto.repository.ClienteRepository;
import br.com.acordocerto.repository.RolesRepository;

@Service
public class ClienteService {
	
	@Autowired
	public ClienteRepository clienteRepository;
	
	@Autowired
	public RolesRepository rolesRepository;

	public void cadastraCliente(Cliente cliente){
		clienteRepository.save(cliente);
	}
	
	public Iterable<Cliente> returnClientes(){
		return clienteRepository.findAll();
	}
	
	public Iterable<Roles> returnRoles(){
		return rolesRepository.findAll();
	}
	
}
