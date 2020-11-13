package br.com.bankofoz.beans;
import javax.swing.JOptionPane;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	
	public Cliente(int id, String nome, String cpf, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	public Cliente() {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setAll(int id, String nome, String cpf, Endereco endereco){
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		
	}
	public String getAll() {
		return 	   "\n____CLIENTE______\n"+
				   "ID:______:"+id+"\n"+
				   "NOME____+:"+nome+"\n"+
				   "CPF______:"+cpf+"\n"+
				   "ENDERECO_:"+ endereco.getAll();
				
	}
	

}
