package desisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Degite o nome: do produto ").toLowerCase();
		int qtdprodt = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde do produto: "));
		
		if (qtdprodt > 60) {
			System.out.println("Estoque lotado");
		}else if(qtdprodt > 40 && qtdprodt < 61) {
			System.out.println("Estoque cheio");
		}else if(qtdprodt > 19 && qtdprodt < 41) {
			System.out.println("Estoque normal");
		}else {
			System.out.println("Estoque baixo");
		}
	}

}
