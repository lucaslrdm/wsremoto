package desisao;

import javax.swing.JOptionPane;

public class DesisaoEncadeada {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Degite el nome: ").toLowerCase();
		byte alpha = Byte.parseByte(JOptionPane.showInputDialog("É alfabetizado: (0 ou 1)"));
		if(alpha ==1) {

			int idat = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1: "));

			if (idat > 70 || idat == 16 || idat ==17 ) {
				System.out.println("pode ou nao votar");
			}

			if (idat < 70 && idat > 18 ) {
				System.out.println("se fuu");
			}

			if (idat < 16 ) {
				System.out.println("vai dormir");
			}
		}
		else {
			System.out.println("animais nao votam");
		}
	}

}
