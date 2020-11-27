package br.com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.finalproject.dao.UsuarioDAO;
import br.com.finalproject.model.Artista;
import br.com.finalproject.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if(resposta==null)
			return ResponseEntity.status(404).build();
		
		return ResponseEntity.ok(resposta);
		
	}
	
	@PostMapping("/cadastrousuario")
	public ResponseEntity<Usuario> gravar(@RequestBody Usuario objeto){
		
		try {
			dao.save(objeto);

			return ResponseEntity.ok(objeto);
		}catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(403).build();
			
		}
	}
	
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		
		if(lista.size() ==0) {
			System.out.println("lista vazia");
			return ResponseEntity.status(404).build();
			}
		
		return ResponseEntity.ok(lista);
	}
}
