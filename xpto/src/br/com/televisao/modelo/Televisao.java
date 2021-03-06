package br.com.televisao.modelo;

public class Televisao {
	private String marca;
	private float valorVenda;
	private float valorCompra;

	private int volume;
	private int canal;
	private boolean status;
	public String getMarca() {
		return marca;
	}
	public void preencherMarca(String marca) {
		this.marca = marca.toUpperCase();
	}
	public void preencherValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void definirValorVenda(float valorCompra) {
		this.valorVenda = valorVenda + (valorCompra* (float) 0.2);
	}
	public int getVolume() {
		return volume;
	}
	public void aumentarVolume() {
		if(this.volume<=20 && this.status==true)
			this.volume++;
	}
	public void DiminuirVolume() {
		if(this.volume<=20 && this.volume >0 && this.status==true )
			this.volume--;
	}

	public int getCanal() {
		return canal;
	}
	public void mudarCanal(int canal) {
		if(canal >=0 && canal <=999)
			this.canal = canal;
	}
	public void ligar() {
		this.volume = 6;
		this.status = true;
	}

	public void desligar() {
		this.status = false;
		volume =0;
	}

	public String retornarStatus() {
		if (status ==true)
			return "Ligada";
		else return "Desligada";
	}

	public String retornaResumo() {
		String status="desligada";
		if (this.status==true)
			status="ligada";
		return "STATUS____________:"+status+"\n"+
			   "CANAL_____________:"+canal+"\n"+
			   "VOLUME____________:"+volume+"\n"+
			   "VALOR DE VENDA____:"+valorVenda+"\n"+
			   "VALOR DE COMPRA___:"+valorCompra+"\n";
	}
}
