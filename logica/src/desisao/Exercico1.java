package desisao;

import javax.swing.JOptionPane;

public class Exercico1 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2: "));
		int resultado =0;
		String operacao = JOptionPane.showInputDialog("Escolha entre: (* ~ / ~ + ~ ou - )");

		if(operacao.equals("*")) {
			resultado = num1 * num2;
			System.out.println("O resultado da opera��o de multiplica��o para os nu"
					+ "meros informados � :"+ resultado);
		}else
			if(operacao.equals("+")) {
				resultado = num1 + num2;
				System.out.println("O resultado da opera��o de adi��o para os nu"
						+ "meros informados � :"+ resultado);
			}else
				if(operacao.equals("-")) {
					resultado = num1 - num2;
					System.out.println("O resultado da opera��o de subtra��o para os nu"
							+ "meros informados � :"+ resultado);
				}else
					if(operacao.equals("/")) {
						if(num2 <=0 ){
							System.out.println("N�o � possivel dividir por zero");
						}else {
							resultado = num1 / num2;
							System.out.println("O resultado da opera��o de divis�o para os nu"
									+ "meros informados � :"+ resultado);
						}
					}

	}

}
