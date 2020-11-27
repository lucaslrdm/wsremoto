package br.com.rvsadvogados.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_ADVOGADO")
public class Advogado {
	
	@Column(name="idadvogado")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idadvogado;
	
	@Column(name="nomeadvogado",length=50)
	private String nomeadvogado;
	
	@Column(name="loginadvogado",length=10)
	private String loginadvogado;
	
	@Column(name="emailadvogado",length=80)
	private String emailadvogado;
	
	@Column(name="senhaadvogado",length=20)
	private String senhaadvogado;
	
	
	@Column(name="foto",length=100)
	private String foto;
	
	@OneToMany(mappedBy="advogado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("advogado")
	private List<Processos> processos;
	
	@OneToMany(mappedBy="advogado", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("advogado")
	private List<Cliente> clientes;
	
	

	public Advogado() {
		super();
	}



	public Advogado(int idadvogado, String nomeadvogado, String loginadvogado, String emailadvogado,
			String senhaadvogado, String foto, List<Processos> processos, List<Cliente> clientes) {
		super();
		this.idadvogado = idadvogado;
		this.nomeadvogado = nomeadvogado;
		this.loginadvogado = loginadvogado;
		this.emailadvogado = emailadvogado;
		this.senhaadvogado = senhaadvogado;
		this.foto = foto;
		this.processos = processos;
		this.clientes = clientes;
	}



	public int getIdAdvogado() {
		return idadvogado;
	}

	public void setIdAdvogado(int idAdvogado) {
		this.idadvogado = idAdvogado;
	}

	public String getNomeAdvogado() {
		return nomeadvogado;
	}

	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeadvogado = nomeAdvogado;
	}

	public String getLoginAdvogado() {
		return loginadvogado;
	}

	public void setLoginAdvogado(String loginAdvogado) {
		this.loginadvogado = loginAdvogado;
	}

	public String getEmailAdvogado() {
		return emailadvogado;
	}

	public void setEmailAdvogado(String emailAdvogado) {
		this.emailadvogado = emailAdvogado;
	}

	public String getSenhaAdvogado() {
		return senhaadvogado;
	}

	public void setSenhaAdvogado(String senhaAdvogado) {
		this.senhaadvogado = senhaAdvogado;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	
	public List<Processos> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processos> processos) {
		this.processos = processos;
	}



	public List<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	
	

}
