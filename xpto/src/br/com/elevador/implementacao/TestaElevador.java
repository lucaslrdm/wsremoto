package br.com.elevador.implementacao;

import javax.swing.JOptionPane;

import br.com.elevador.modelo.Elevador;

public class TestaElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.setCapacidadePessoas(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de pessoas do elevador: ")));
		elevador.setAndarMaximo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Andar Maximo")));
		elevador.setAndarMinimo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Andar minimo")));
		elevador.setNome(JOptionPane.showInputDialog("Digite o nome do Elevador: "));
		
		elevador.entrar(4);
		elevador.sair(500);
		elevador.entrar(4);
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.descer();
		System.out.println(elevador.retornarTudo());


		
	}

}
