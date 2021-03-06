package br.com.formula1.modelo;

public class Carro {
	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia.toUpperCase();
	}

	//gets e sets
	public String getEscuderia() {
		return escuderia;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public float getValorPromocao() {
		return valor * (float) 0.9;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setNumero(short numero) {
		if(numero >0)
			this.numero = numero;
	}

	public short getNumero() {
		return numero;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}


	public String ligar() {
		status=true;
		return "to ligado";
	}
	public String desligar() {
		status=false;
		velocidadeAtual = 0;
		return "ligadonom";
	}
	public void PreencherBasico(short numero, String escuderia, float valor) {

		this.numero = numero;
		this.escuderia = escuderia.toUpperCase();
		this.valor = valor;

	}

	public void exibirTudo() {
		String status = "desligado";
		if (this.status ==true)
			status = "ligado";

		System.out.println("NUMERO DO CARRO_______: "+ numero);
		System.out.println("ESCUDEIRA DO CARRO:___: "+ escuderia);
		System.out.println("VALOR DO CARRO________:" + valor);
		System.out.println("STATUS DO CARRO_______:" + status);
		System.out.println("COR DO CARRO__________:" + cor);

	}

	public void acelerar(float veloc ){
		if(status!=false && veloc>0)
			velocidadeAtual = velocidadeAtual+veloc;
	}

	public void desacelerar(float veloc ){
		if(status==true && velocidadeAtual > veloc)
			velocidadeAtual = velocidadeAtual-veloc;
	}

	public void brecar() {
		velocidadeAtual = 0;
	}
	public float ExibirVelocidadeAtual() {
		return velocidadeAtual;
	}

	public boolean ExibirStatus() {
		return status;
	}
}

