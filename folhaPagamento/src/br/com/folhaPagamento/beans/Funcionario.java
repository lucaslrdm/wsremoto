package br.com.folhaPagamento.beans;

public abstract class Funcionario {
	private String nome;
	private int numeroRegistro;
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public Funcionario() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public void setAll(String nome, int numeroRegistro) {
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getAll() {
		return
				"______________FUNCIONARIO___________"+"\n"+
				"Nome_________________:"+nome+"\n"+
				"numero de Registro___:"+numeroRegistro+"\n"
				
				;
	}
	
	public abstract float calculaSalario();

}
