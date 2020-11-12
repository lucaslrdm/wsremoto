package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementaProfessor3 {

	public static void main(String[] args) {

		Endereco e = new Endereco("castelo de hogwarts", 
				"666", 
				true, 
				"escócia", 
				"escócia", 
				"escócia", 
				"escócia");
		Professor p = new Professor(666, 
				"Alvo Percival Wulfrico Brian Dumbledore", 
				"Ordem de Merlin, Primeira Classe", 
				"66666666", 
				e);

	
		System.out.println(p.getAll());

	}

}
