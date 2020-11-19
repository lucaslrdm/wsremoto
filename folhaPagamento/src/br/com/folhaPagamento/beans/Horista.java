package br.com.folhaPagamento.beans;
import br.com.folhaPagamento.execao.MinhaExecao;

public class Horista extends Funcionario{
	private float valorHora;
	private float numeroHoras;
	public Horista(String nome, int numeroRegistro, float valorHora, float numeroHoras) {
		super(nome, numeroRegistro);
		
		try {
			if(valorHora>0)
				this.valorHora = valorHora;
			else throw new RuntimeException();
			if(numeroHoras>0)
				this.numeroHoras = numeroHoras;
			else throw new RuntimeException();

		}
		catch (Exception e) {
			System.out.println(MinhaExecao.tratar(e));
		}
	}
	public Horista() {
		super();
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public float getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(float numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	public void setAll( float valorHora, float numeroHoras) {
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	
	public String getAll() {
		return
				super.getAll()+
				"______________Horista___________"+"\n"+
				"Valor Hora____________________:"+valorHora+"\n"+
				"Numero Horas__________________:"+numeroHoras+"\n"


				;
	}
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return valorHora*numeroHoras;
	}

}
