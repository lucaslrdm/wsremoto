package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Conta implements PadraoConta{
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Conta() {
		super();
	}

	public short getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
	}

	public short getAgencia() {
		return agencia;
	}

	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public float verificarSaldo(float limite) {
		if (this instanceof Poupanca)
			return this.saldo;
		else if (this instanceof Corrente)
			return this.saldo+limite;
		else return 0;
	}

	@Override
	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public String getAll() {
		return 
		       "______CONTA____"+
			   "numero:________:"+numero+"\n"+
			   "digito_________:"+digito+"\n"+
			   "agencia________:"+agencia+"\n"+
			   "saldo__________:"+saldo+"\n"+
			   cliente.getAll();
			 
	
}
	
}
