package repeticao;

import javax.swing.JOptionPane;

public class ExemplodeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um umero para gerar a Tabuada: "));
		for (int i = 1; i< 11; i++) {
			System.out.printf("RESULTADO DA TABUADA DE %d X %d, É IGUAL A: %d\n",num,i,(num*i));
		}
	}

}
