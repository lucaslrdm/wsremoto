package br.com.unixyz.beans;

public class Endereco {
	private String logradouro;
	private String numero;
	private boolean complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	
	
	public Endereco(String logradouro, String numero, boolean complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradouro = logradouro.toUpperCase();
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	public Endereco() {
		super();
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public boolean isComplemento() {
		return complemento;
	}
	public void setComplemento(boolean complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setAll(String logradouro, String numero, boolean complemento, String bairro, String cidade, String uf,
			String cep){
		this.logradouro = logradouro.toUpperCase();
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		
	}
	public String getAll() {
		return "LOGRADOURO:_____:"+logradouro+"\n"+
			   "NUMERO__________:"+numero+"\n"+
			   "COMPLEMENTO_____:"+complemento+"\n"+
			   "BAIRRO__________:"+bairro+"\n"+
			   "CIDADE__________:"+cidade+"\n"+
			   "UF______________:"+uf+"\n"+
			   "CEP_____________:"+cep;
	}
}
