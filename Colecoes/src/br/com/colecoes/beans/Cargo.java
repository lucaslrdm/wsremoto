package br.com.colecoes.beans;

public class Cargo {
	private String nome;
	private String nivel;
	private float salario;

	public Cargo(String nome, String nivel, float salario) {
		super();
		this.nome = nome.toUpperCase();
		this.nivel = nivel.toUpperCase();
		this.salario = salario;
	}
	public Cargo() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getAll(){
		return 
				"___DADOS DO CARGO___\n"+
				"NOME CARGO_________:"+nome+"\n"+
				"NIVEL CARGO________:"+nivel+"\n"+
				"SALARIO____________:"+salario+"\n";


	}


}

