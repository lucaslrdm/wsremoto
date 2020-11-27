package br.com.rvsadvogados.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.rvsadvogados.model.Advogado;
import br.com.rvsadvogados.model.Cliente;
import br.com.rvsadvogados.model.Processos;

/*
 * DAO => Data Access Object
 * Classes que contém os métodos que irão manipular os dados
 * manipular os dados = CRUD
 * C => Create (inserir dado na tabela)
 * R => Read (consultar dado na tabela)
 * U => Update (alterar dado na tabela)
 * D => Delete (apagar dado na tabela)
 * Classe CrudRepository<1ºClasseBeans,2ºTipodeDadoPK>
 */

public interface AdvogadoDAO extends CrudRepository<Advogado,Integer>{
	
	public Advogado findByEmailAndSenha(String email, String senha);
	public Advogado findByLoginAndSenha(String loginadvogado, String senha);

	//public Advogado findByClienteIdcliente(int idcliente);
	public Advogado findByProcessosIdprocesso(int idprocesso);
	
	

}
