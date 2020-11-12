package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = JOptionPane.showInputDialog("Digite  um email ").toLowerCase();
		int contador =0;
		
		while(email.contains("@")==false)
			email = JOptionPane.showInputDialog("Digite 1 com @, seu @ado: ").toLowerCase();
		
		String noma = JOptionPane.showInputDialog("Digite  um nome: ").toLowerCase();
		while(noma.length()>5 && noma.length() <11) {
			System.out.println("o nome precisa ter mais q 5, e menos de 10 caracteres");
			contador++;
			if (contador < 5)
				System.out.println("O PUTA QUE PARIU!!!"
						+ "SEU ANIMAL A PORRA DO NOME TEM Q TER MAIS DE 5 E MENOS DE 10 CARACTERES"
						+ " CAALHO!!! VAI TOMAR NO CU!! SEU ENERGUMIO BURRO DO CARALHO!!!"
						+ "IREI COMER SEU CU, ESSE SEU CU GULOSO ");
			
		}
			

	}

}
