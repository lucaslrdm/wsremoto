package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementaProfessor {

	public static void main(String[] args) {

		Professor p = new Professor();
		Endereco e = new Endereco();
		p.setId(1);
		p.setNome("PASCOALLI");
		p.setTitulacao("DOUTOR");
		p.setFone("1234-4567");
		p.setEndereco(e);
		e.setLogradouro("AVENIDA PAULISTA");
		e.setNumero("3500");
		e.setBairro("CENTRO");
		e.setCidade("SAO PAULO");
		e.setUf("SP");
		e.setCep("12345-000");
		e.setComplemento(false);
		System.out.println("Nome: " + p.getNome());
		System.out.println("Endereco: " + p.getEndereco());

	}

}
