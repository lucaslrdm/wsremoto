package br.com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.finalproject.dao.ArtistaDAO;
import br.com.finalproject.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> gravar(@RequestBody Artista objeto){
		
		try {
			dao.save(objeto);

			return ResponseEntity.ok(objeto);
		}catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(403).build();
			
		}
	}
	
	
	
	//@PostMapping("/login")
	
	/*
	public ResponseEntity<Artista> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if(resposta==null)
			return ResponseEntity.status(404).build();
		
		return ResponseEntity.ok(resposta);
		
	}
	*/
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		
		if(lista.size() ==0) {
			System.out.println("lista vazia");
			return ResponseEntity.status(404).build();
			}
		
		return ResponseEntity.ok(lista);
	}
}
