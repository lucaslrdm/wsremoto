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
	
	@Column(name="idcli")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcli;
	
	@Column(name="nomecli",length=50)
	private String nomecli;
	
	@Column(name="emailcli",length=80)
	private String emailcli;
	
	@Column(name="celcli", length=15)
	private String celcli;

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


	public Cliente(int idcli, String nomecli, String emailcli, String celcli, String foto, List<Processos> processos,
			Advogado advogado) {
		super();
		this.idcli = idcli;
		this.nomecli = nomecli;
		this.emailcli = emailcli;
		this.celcli = celcli;
		this.foto = foto;
		this.processos = processos;
		this.advogado = advogado;
	}


	public int getIdcli() {
		return idcli;
	}


	public void setIdcli(int idcli) {
		this.idcli = idcli;
	}


	public String getNomecli() {
		return nomecli;
	}


	public void setNomecli(String nomecli) {
		this.nomecli = nomecli;
	}


	public String getEmailcli() {
		return emailcli;
	}


	public void setEmailcli(String emailcli) {
		this.emailcli = emailcli;
	}


	public String getCelcli() {
		return celcli;
	}


	public void setCelcli(String celcli) {
		this.celcli = celcli;
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


	public Advogado getAdvogado() {
		return advogado;
	}


	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}


	

	
	
	
	

	

}
