package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoPrudoto;

public class Cd extends Produto implements PadraoPrudoto {
	private String artista;
	private int totalFaixas;
	private boolean lancamento;
	
	
	public Cd() {
		super();
	}
	public Cd(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lancamento) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = lancamento;
	}
	
	public String getAll() {
		return
				super.getAll()+
				"artista______________:"+artista+"\n"+
				"totalFaixas__________:"+totalFaixas+"\n"+
				"lancamento___________:"+lancamento+"\n";
	}
	
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lancamento) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = lancamento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	@Override
	public float retornarImposto() {
		return getValorVenda() * (float) 0.07; 
	}
	@Override
	public float ObterValorPromocao(float param) {
		return getValorVenda() - getValorVenda() * (param/90);
	}
	
	
}
