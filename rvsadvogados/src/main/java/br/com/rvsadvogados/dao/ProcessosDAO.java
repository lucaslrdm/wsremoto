package br.com.rvsadvogados.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rvsadvogados.model.Processos;

public interface ProcessosDAO extends CrudRepository<Processos, Integer>{
	
	public List<Processos> findByClienteIdcliente(int id);
	public List<Processos> findByAdvogadoIdadvogado(int id);
	public List<Processos> findByIdprocesso(int id);
	public List<Processos> findByDataabertura(Date dataabertura);
	public List<Processos> findByClienteNomecliente(String nomecliente);
	public List<Processos> findByClienteIdclienteAndDataabertura(int id, Date dataabertura);
	public List<Processos> findByClienteIdclienteAndClienteNomecliente(int id, String nomecliente);
	public List<Processos> findByClienteNomeclienteAndDataabertura(String nomecliente, Date dataabertura);
	public List<Processos> findByClienteIdclienteAndIdprocessoAndDataabertura(int idcliente, int idprocesso,Date dataabertura);
	
	

}
