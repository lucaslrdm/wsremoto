package br.com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.finalproject.dao.MusicaDAO;
import br.com.finalproject.model.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	
	
	@PostMapping("/relatorioportiuloartista")
	public ResponseEntity<List<Musica>> getMusicaTituloArtista(@RequestBody Musica objeto){
		
		List<Musica> lista = dao.findByTituloAndArtistaId(objeto.getTitulo(), objeto.getArtista().getId());
		if (lista.size()==0)
			return ResponseEntity.status(404).build();
		
		return ResponseEntity.ok(lista);
		
		//public List<Musica> findByTituloAndArtistaId(String titulo, int id);
	}
	
	
	
	
	@PostMapping("/relatorioportiulo")
	public ResponseEntity<List<Musica>> getMusicaTitulo(@RequestBody Musica objeto){
		
		List<Musica> lista = dao.findByTitulo(objeto.getTitulo());
		if (lista.size()==0)
			return ResponseEntity.status(404).build();
		
		return ResponseEntity.ok(lista);
	}
	
	
	@PostMapping("/relatorioporartista")
	public ResponseEntity<List<Musica>> getMusicaArtista(@RequestBody Musica objeto){
		
		List<Musica> lista = dao.findByArtistaId(objeto.getArtista().getId());
		if (lista.size()==0)
			return ResponseEntity.status(404).build();
		
		return ResponseEntity.ok(lista);
	}
	
	

	
	

	
	@GetMapping("/musica/{cod}")
	public ResponseEntity<Musica> getMusica(@PathVariable int cod){

		Musica resposta =  dao.findById(cod).orElse(null);

		if(resposta == null)
			return ResponseEntity.status(404).build();

		return ResponseEntity.ok(resposta);
	}
	

	
	
	@PostMapping("/musicapost")
	public ResponseEntity<Musica> getMusicaPost(@RequestBody Musica objeto){
		Musica resposta =  dao.findById(objeto.getId()).orElse(null);

		if(resposta == null)
			return ResponseEntity.status(404).build();

		return ResponseEntity.ok(resposta);
		
	}

	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> gravar(@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
		
	}
	
	

}
