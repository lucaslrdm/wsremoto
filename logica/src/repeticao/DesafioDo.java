package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("jogador 1 - Digite um numero: "));
		int chute = 0;
		int contador = 0;

		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("jogador 2 - tente adivinhar o numero digitado: "));
			if(chute < num) 
				System.out.println("Voc� errou! o numero escolhido � maior");

			if(chute > num) 
				System.out.println("Voc� errou! o numero escolhido � menor");

			if(contador >= 10)
				System.out.printf("a diferen�a entre o numero escolhido e o ultimo digitado(%d) � de %d\n ",chute,(num-chute));

			contador++;
		}while(chute != num);
		System.out.printf("Voc� acertou! apos %d tentativas",contador);

	}

}
