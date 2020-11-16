package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<Integer, String> lista = new HashMap<Integer, String>();
		lista.put(5505, "DBA");
		lista.put(5506, "DBA");
		lista.put(5507, "ANALISTA");
		lista.put(5508, "ESTAGIARIO");
		lista.put(5509, "FULLSTACK");
		lista.put(5510, "DBA");
		lista.put(5505, "DBA");
		
		System.out.println(lista);
		System.out.println("Chaves CHAVES CHAVEEES: "+ lista.keySet());
		System.out.println("Valores "+ lista.values());
		
		
		
		

	}

}
