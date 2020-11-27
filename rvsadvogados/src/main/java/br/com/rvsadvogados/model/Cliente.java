package br.com.rvsadvogados.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_CLIENTE")
public class Cliente {
	
	@Column(name="idcliente")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcliente;
	
	@Column(name="nomecliente",length=50)
	private String nomecliente;
	
	@Column(name="emailcliente",length=80)
	private String emailcliente;
	
	@Column(name="celularcliente", length=15)
	private String celularcliente;

	@Column(name="foto",length=100)
	private String foto;
	
	@OneToMany(mappedBy="cliente", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("cliente")
	private List<Processos> processos;
	
	@ManyToOne
	@JsonIgnoreProperties("cliente")
	private Advogado advogado;
	
	
	public Cliente() {
		super();
	}


	



	public Cliente(int idcliente, String nomecliente, String emailcliente, String celularcliente, String foto,
			List<Processos> processos, Advogado advogado) {
		super();
		this.idcliente = idcliente;
		this.nomecliente = nomecliente;
		this.emailcliente = emailcliente;
		this.celularcliente = celularcliente;
		this.foto = foto;
		this.processos = processos;
		this.advogado = advogado;
	}






	public int getIdCliente() {
		return idcliente;
	}

	public void setIdCliente(int idCliente) {
		this.idcliente = idCliente;
	}

	public String getNomeCliente() {
		return nomecliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomecliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailcliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailcliente = emailCliente;
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



	public String getCelularcliente() {
		return celularcliente;
	}



	public void setCelularcliente(String celularcliente) {
		this.celularcliente = celularcliente;
	}



	public Advogado getAdvogado() {
		return advogado;
	}




	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}
	
	
	
	

	

}
