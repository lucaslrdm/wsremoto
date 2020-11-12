
package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estringue (alphanumeric)
		String nome = JOptionPane.showInputDialog("Digite um nome? ");
		int idat= Integer.parseInt(JOptionPane.showInputDialog("Degitidad: "));
		double altur= Double.parseDouble(JOptionPane.showInputDialog("Degitaltur: "));
		double pes= Double.parseDouble(JOptionPane.showInputDialog("DegitaPes: "));
		System.out.println("nome " + nome);
		System.out.println("idad "+ idat+" anos");
		System.out.println("altura : "+ altur);
		System.out.println("peso : "+ pes);
		System.out.printf("IMC =  %.2f", (pes/(altur*altur)));
		System.out.printf("\n %s ,IMC  %.2f", nome, (pes/(altur*altur)));
		
		

	}

}
