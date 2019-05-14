package br.com.acordocerto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.acordocerto.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	
}