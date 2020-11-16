package br.com.execoes.implementacao;

import br.com.execoes.tratamento.MinhaExecao;

public class TesteExecoes {

	public static void main(String[] args) {

		try {
			int numero = Integer.parseInt("666"); 
			System.out.println(numero);
			String nome = "";
			System.out.println("qtde de letras + "+nome.length());
			
			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1] = 6.12;
			vetor[2] = 15.8;
			
			
		
		}
		
		catch (NullPointerException e) {
			System.out.println(MinhaExecao.tratar(e));
		}
		catch (NumberFormatException e) {

			System.out.println(MinhaExecao.tratar(e));

		}catch(Exception e) {
			System.out.println(MinhaExecao.tratar(e));
			e.printStackTrace();
		}
		finally {
			System.out.println("EU QUERO SABER QUEM É Q TRANSA");

		}



	}

}
