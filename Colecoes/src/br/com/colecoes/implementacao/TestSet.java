package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set <String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");

		lista.add("SUPORTE");
		lista.add("DBA");
		lista.add("OPAS");
		lista.add("MEU");
		lista.add("MAIS UM");
		lista.add("DBA");
		lista.add("DBA");
		lista.add("DBA");
		lista.add("fullstack");


		System.out.println(lista);
		//System.out.println(lista.get(1));
		
		System.out.println("Existe DBA: "+lista.contains("DBA"));

	}

}
