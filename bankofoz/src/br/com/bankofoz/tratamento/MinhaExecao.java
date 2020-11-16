package br.com.bankofoz.tratamento;

import java.sql.SQLException;

public class MinhaExecao {
	public static String tratar(Exception e) {
		if  (e instanceof NullPointerException) {
			return "the objeto is nulo";
			
		}
		else if(e instanceof SQLException) {
			return "the banco of dados is com erro";
			
		}
		else if (e instanceof NumberFormatException) {
			return "the number of the beast is invalido";
			
		}else if(e instanceof ArrayIndexOutOfBoundsException) {
			return "Estourou no norte";
		}
		else {
			e.getStackTrace();
			return "\n vish";
			//throw new RuntimeException();

		}
	}

}
