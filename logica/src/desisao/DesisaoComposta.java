package desisao;

import javax.swing.JOptionPane;

public class DesisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Degite el nome: ").toLowerCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2: "));
		float media = (nota1+nota2)/2;
		
		if (media >= 6) {
			System.out.println("nao fez mais q a obrigacao");
		}else if (media < 4) {
			System.out.println("nunca vi mais burro q vc "+nome);
		}else{
			System.out.println("� burro, mas ainda tem chace");
		}
		
	}

}
