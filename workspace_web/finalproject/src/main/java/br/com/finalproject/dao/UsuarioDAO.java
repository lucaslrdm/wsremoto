package br.com.finalproject.dao;
/*
 * DAO - DATA ACCESS OBJECT
 * Classe que contem os metods que irao manipular os daddos
 * 
 * CRUD = 
 * CREAT
 * CONSULT
 * UPDATE
 * DELETE
 */

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	/*
	 * save() - gravar e alterar
	 * find() - consulta
	 * deleteAll() - apagar
	 * 
	 */
	
	public Usuario findByEmailAndSenha(String email, String senha);

}
