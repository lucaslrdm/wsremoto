package br.com.televisao.implementacao;

import javax.swing.JOptionPane;

import br.com.televisao.modelo.Televisao;

public class TestaTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.preencherMarca(JOptionPane.showInputDialog("Digite uma Marca de TV: "));
		tv.preencherValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de Compra")));
		tv.definirValorVenda(tv.getValorCompra());
		tv.ligar();
		tv.mudarCanal(499);
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.retornarStatus());
		System.out.println(tv.retornaResumo());
		tv.desligar();
		System.out.println(tv.retornarStatus());

		
	}

}