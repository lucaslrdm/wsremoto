package br.com.unixyz.beans;

public class Aluno {
	private int rm;
	private String nome;
	private String email;

	public  Aluno(){

	}

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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

	public void setAll(int rm,String nome,String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;

	}

	public String getAll() {
		return "RM "+ rm + "\n"+
				"NOME: "+ nome+ "\n"+
				"EMAIL: " + email ;
	}

}
