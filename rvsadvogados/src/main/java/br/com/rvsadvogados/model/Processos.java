package br.com.rvsadvogados.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_PROCESSOS")
public class Processos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idprocesso")
	private int idprocesso;

	
	@Column(name="dataabertura")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dataabertura;
	

	
	@ManyToOne
	@JsonIgnoreProperties("processos")
	private Cliente cliente;
	
	@ManyToOne
	@JsonIgnoreProperties("processos")
	private Advogado advogado;
	
	

	public Processos() {
		super();
	}







	public Processos(int idprocesso, Date dataAbertura, Cliente cliente, Advogado advogado) {
		super();
		this.idprocesso = idprocesso;
		this.dataabertura = dataAbertura;
		this.cliente = cliente;
		this.advogado = advogado;
	}







	public int getIdprocesso() {
		return idprocesso;
	}



	public void setIdprocesso(int idprocesso) {
		this.idprocesso = idprocesso;
	}



	public Date getDataAbertura() {
		return dataabertura;
	}



	public void setDataAbertura(Date dataAbertura) {
		this.dataabertura = dataAbertura;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	public Advogado getAdvogado() {
		return advogado;
	}



	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	

}
