package br.com.colecoes.beans;

import java.util.List;

public class Colaborador {
	private String nome;
	private String cpf;
	private List<String> phone;
	public Colaborador(String nome, String cpf, List<String> phone) {
		super();
		this.nome = nome.toUpperCase();
		this.cpf = cpf;
		this.phone = phone;
	}
	public Colaborador() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	
	public void setAll(String nome, String cpf, List<String> phone) {
		this.nome = nome;
		this.cpf = cpf;
		this.phone = phone;
	}
	
	public String getAll(){
		return 
				"___DADOS COLABORADOR___\n"+
				"NOME_________:"+nome+"\n"+
				"CPF__________:"+cpf+"\n"+
				"FONE(S)______:"+phone+"\n";


	}

}
