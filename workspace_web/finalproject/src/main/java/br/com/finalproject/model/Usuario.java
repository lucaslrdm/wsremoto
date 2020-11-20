package br.com.finalproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
public class Usuario {
	
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length = 50)
	private String nome;
	
	@Column(name="email", length = 80)
	private String email;
	
	@Column(name="senha", length = 20)
	private String senha;
	
	@Column(name="foto", length = 120)
	private String foto;
	
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	
	public Usuario() {
		super();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setAll(int id, String nome, String email, String senha, String foto) {
	
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	
	/*
	public String getAll() {
		
		return "____USUÁRIO____\n"+
		       "ID:____________"+id+"\n"+
		       "nome:__________"+nome+"\n"+
		       "email:_________"+email+"\n"+
		       "senha:_________"+senha+"\n"+
		       "foto___________"+foto+"\n"
		;
	}*/
	
}
