package br.com.folhaPagamento.beans;
import br.com.folhaPagamento.execao.MinhaExecao;


public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		try {
			if(valorEmpreita>0)
				this.valorEmpreita = valorEmpreita;
			else throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(MinhaExecao.tratar(e));
		}


	}

	public Empreiteiro() {
		super();
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	public String getAll() {
		return
				super.getAll()+
				"______________EMREITEIRO___________"+"\n"+
				"valor Empreita____________________:"+valorEmpreita+"\n"
				;
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}
	
	


}
