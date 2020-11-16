package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Analista");
		lista.add("SOMEONE3");
		lista.add("SOMEONE");

		lista.add("DBA");
		lista.add("DEVSENVOLVEDORX");
		lista.add("GAROTX DE PROGRAMAS");
		lista.add("DEBEAH");
		lista.add("DEBEAH");


		
		System.out.println(lista);
		System.out.println("number two: "+lista.get(1));
		int totalDba = 0;
		int CargosOitoMais = 0;

		for (int dacontagem = 0; dacontagem <lista.size();dacontagem++) {
			System.out.println("Elemento "+ dacontagem+ " : "+lista.get(dacontagem));
			if (lista.get(dacontagem).equals("DBA")) {
				totalDba ++;
			}
			if(lista.get(dacontagem).length()>8) {
				CargosOitoMais++;
			}

		}
		System.out.println("total de dbas: "+totalDba);
		System.out.println("qtde de cargos com mais de 8 letras: "+CargosOitoMais);
		Collections.sort(lista);
		
		
		
		System.out.println("LISTA ORDENADA:");
		for (int dacontagem = 0; dacontagem <lista.size();dacontagem++) 
			System.out.println("Elemento "+ dacontagem+ " : "+lista.get(dacontagem));

		
	}

}
