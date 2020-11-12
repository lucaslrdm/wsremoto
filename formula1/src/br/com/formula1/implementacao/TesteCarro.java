package br.com.formula1.implementacao;
import javax.swing.JOptionPane;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro objeto = new Carro();
		System.out.println("Objeto: " + objeto);
		objeto.setEscuderia(JOptionPane.showInputDialog("Digite o nome de uma marca")); 
		System.out.println("Objeto: " + objeto.getEscuderia());
		objeto.desligar();


	}

}
