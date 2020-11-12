package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "tEsTe@testeDOtestE.com.br";
		System.out.println("Origen-nal: "+email);
		System.out.println("Menuscula: "+ email.toLowerCase());
		System.out.println("Maior-uscula: "+ email.toUpperCase());
		System.out.println("qtde caracts: "+ email.length());
		System.out.println("@ado? "+ email.contains("@"));
		System.out.println("@ado msm?: "+ email.indexOf("@"));
		System.out.println("do 2 ao 4: "+ email.substring(1,5));
		
		//exibir a primeira metade da estringue
		System.out.println("metade, a primeira: "+ email.substring(0,(email.length()/2)));

		System.out.println("metade, a ultima: "+ email.substring((email.length()/2),email.length()));

		
		System.out.println("metade, a ultima: "+ email.substring((email.length()/2),email.length()));

		System.out.println("metade, usuaru: "+ email.substring(0,email.indexOf('@')));
		System.out.println("metade, servido: "+ email.substring((email.indexOf('@')+1),email.length()));
		System.out.println("Compara-ação case sensitive: "+ email.equals("teste@testedoteste.com.br"));
		System.out.println("Compara-ação sem case sensitive: "+ email.equalsIgnoreCase("teste@testedoteste.com.br"));

	}

}
