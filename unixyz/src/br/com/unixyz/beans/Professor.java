package br.com.unixyz.beans;
import br.com.unixyz.beans.Endereco;

public class Professor {
	private int id;
	private String nome;
	private String titulacao;
	private String fone;
	private Endereco endereco;
	
	public Professor() {
		super();
	}
	
	
	
	public Professor(int id, String nome, String titulacao, String fone, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
		this.fone = fone;
		this.endereco = endereco;
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
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public void setAll(int id, String nome, String titulacao, String fone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.titulacao = titulacao;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getAll(){

		return "id____________:"+id+"\n"+
			   "nome__________:"+nome+"\n"+
			   "titulacao_____:"+titulacao+"\n"+
			   "fone__________:"+fone+"\n"+
			   "_______endereco______"+"\n"+endereco.getAll()+"\n";
			   
	}
}
