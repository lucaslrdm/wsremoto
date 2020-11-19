package br.com.folhaPagamento.beans;

import br.com.folhaPagamento.execao.MinhaExecao;


public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficoTerno;
	public Chefe(String nome, int numeroRegistro, float salarioBase, float adicionalFuncao, float beneficoTerno) {
		super(nome, numeroRegistro);
		try {

			if(salarioBase>0)
				this.salarioBase = salarioBase;
			else throw new RuntimeException();

			if(adicionalFuncao>0)
				this.adicionalFuncao = adicionalFuncao;
			else throw new RuntimeException();

			if(adicionalFuncao>0)
				this.beneficoTerno = beneficoTerno;
			else throw new RuntimeException();

		}
		
		catch(Exception e) {
			System.out.println(MinhaExecao.tratar(e));
		}
	}
	
	public Chefe() {
		super();
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficoTerno() {
		return beneficoTerno;
	}
	public void setBeneficoTerno(float beneficoTerno) {
		this.beneficoTerno = beneficoTerno;
	}
	
	public void setAll(float salarioBase, float adicionalFuncao, float beneficoTerno) {
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficoTerno = beneficoTerno;
	}
	
	public String getAll() {
		return
				super.getAll()+
				"______________CHEFE___________"+"\n"+
				"Salario Base______________:"+salarioBase+"\n"+
				"Adcional Funcao___________:"+adicionalFuncao+"\n"+
				"Benefico Terno____________:"+beneficoTerno+"\n"

				
				;
	}

	@Override
	public float calculaSalario() {
		
		return ((this.salarioBase+this.salarioBase)*this.adicionalFuncao)/100+beneficoTerno;
		
	}
	
	

}
