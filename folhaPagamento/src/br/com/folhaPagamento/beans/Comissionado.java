package br.com.folhaPagamento.beans;

import br.com.folhaPagamento.execao.MinhaExecao;

public class Comissionado extends Funcionario{

	private float salarioBase;
	private float comissao;
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		try {
			if(salarioBase>0)
				this.salarioBase = salarioBase;
			else throw new RuntimeException();

			if(comissao>0)
				this.comissao = comissao;
			else throw new RuntimeException();
			
		}
		catch(Exception e){
			System.out.println(MinhaExecao.tratar(e));
		}
	}
	public Comissionado() {
		super();
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getFloatcomissao() {
		return comissao;
	}
	public void setFloatcomissao(float comissao) {
		this.comissao = comissao;
	}

	public void setAll(float salarioBase, float comissao) {
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public String getAll() {
		return
				super.getAll()+
				"______________COMISSIONADO___________"+"\n"+
				"Salario Base______________:"+salarioBase+"\n"+
				"Comissao__________________:"+comissao+"\n"


				;
	}
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return (salarioBase+salarioBase)*(comissao/100);
	}

}
