package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Solicitar nome e duas notas de um aluno, calcular a m�dia
		 */
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		double nota1= Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1: "));
		double nota2= Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2: "));
		double media = (nota1+nota2)/2;
		
		System.out.printf("para o Aluno %s ,a m�dia obtida foi %.2f. faltaram %.2f pontos para 10 ", nome, media,(10-media));
	

	}

}
