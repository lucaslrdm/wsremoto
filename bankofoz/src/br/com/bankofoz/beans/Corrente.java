package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Corrente extends Conta implements PadraoConta {
	private float limite;
	private float taxa;
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public boolean sacar(float valor) {
		if((super.getSaldo()-valor) <(limite*-1)) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}
		else return false;
	}

	@Override
	public boolean depositar(float valor) {
		if(valor>0) {
			super.setSaldo(super.getSaldo()+valor);
			return true;
		}else
			return false;
	}
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo()-this.taxa);
	}
	
	public void aumentarLimtite(float porcent) {
		limite = limite + ((porcent*100)/limite);
		
	}
	
	public String getAll() {
		return 
		       "___CONTA CORRENTE___\n"+
			   "limite________:"+limite+"\n"+
			   "taxa__________:"+taxa+"\n"+
			   super.getAll();
	
}
}
