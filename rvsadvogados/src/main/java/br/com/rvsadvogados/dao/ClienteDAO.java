package br.com.rvsadvogados.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rvsadvogados.model.Advogado;
import br.com.rvsadvogados.model.Cliente;
import br.com.rvsadvogados.model.Processos;

public interface ClienteDAO extends CrudRepository<Cliente, Integer>{
	
	public List<Cliente> findByIdcliente(int id);
	public List<Cliente> findByNomecliente(String nomecliente);
	public List<Cliente> findByProcessosIdprocesso(int idprocesso);
	public List<Cliente> findByAdvogadoIdadvogado(int idadvogado);

	

	

}
