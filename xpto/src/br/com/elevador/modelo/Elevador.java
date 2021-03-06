package br.com.elevador.modelo;

public class Elevador {
	private int andarAtual = 0;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas = 0;
	private String nome;
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getAndarMaximo() {
		return andarMaximo;
	}
	public void setAndarMaximo(int andarMaximo) {
		this.andarMaximo = andarMaximo;
	}
	public int getAndarMinimo() {
		return andarMinimo;
	}
	public void setAndarMinimo(int andarMinimo) {
		this.andarMinimo = andarMinimo;
	}
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public void entrar(int pQtde) {
		if(this.qtdePessoas+pQtde<=this.capacidadePessoas)
			this.qtdePessoas +=pQtde;		
	}
	
	
	public void sair(int pQtde) {
		if ((pQtde-this.qtdePessoas)<0)
			this.qtdePessoas-=pQtde;
	}
	
	public void subir() {
		if(andarAtual<andarMaximo)
			andarAtual++;
	}
	
	public void descer() {
		if(andarAtual>andarMinimo)
			andarAtual--;
		
	}
	public String retornarTudo() {
		return "ANDAR ATUAL____________:"+andarAtual+"\n"+
			   "ANDAR MAXIMO___________:"+andarMaximo+"\n"+
			   "ANDAR MINIMO___________:"+andarMinimo+"\n"+
			   "CAPACIDADDE DE PESSOAS_:"+capacidadePessoas+"\n"+
			   "QTDE DE PESSOAS________:"+qtdePessoas+"\n"+
			   "NOME___________________:"+nome+"\n";
		
	}
}
