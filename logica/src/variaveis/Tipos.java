package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Estringue (alphanumeric)
		String nome = "escavusca";
		int idat= 66;
		double altur= 1.63;
		double pes= 65;
		System.out.println("Vai virar o ano  todo " + nome);
		System.out.println("por "+ idat+" anos");
		System.out.println("altura do monstro? "+ altur);
		System.out.println("monstro? "+ pes);
		System.out.printf("IMC = indice monstro cadente? %.2f", (pes/(altur*altur)));
		System.out.printf("\n %s ,IMC = indice monstro cadente? %.2f", nome, (pes/(altur*altur)));

		

	}

}
