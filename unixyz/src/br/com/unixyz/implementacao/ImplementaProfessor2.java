package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementaProfessor2 {

	public static void main(String[] args) {

		Professor p = new Professor();
		Endereco e = new Endereco();
		e.setAll("ENDERE�O DE TESTE", 
				"123", 
				false, 
				"tes", 
				"sao p", 
				"sp", 
				"dddddd");
		p.setAll(1, 
				"TESTE", 
				"TESTADO", 
				"66666666", 
				e);
		System.out.println(p.getAll());

	}

}
