package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;
import br.com.ecommerce.beans.Produto;
import javax.swing.JOptionPane;
import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;



public class ImplementaVenda extends Magica {


	
	public static void main(String[] args) {
		Venda venda = new Venda(
				Float.parseFloat(s("Total - valor: ")),
				s("Data da venda: "),
				new Cliente(
						i(s("Digite o ID do cliente")),
						s("Nome Cliente "),
						s("CPF do cliente"),
						new Endereco(
								"castelo de hogwarts", 
								"666", 
								true, 
								"escócia", 
								"escócia", 
								"escócia", 
								"escócia"
								)
						),
				new Produto(
						s("descricao do produto: "),
						f(s("valor de venda")),
						f(s("valor de compra")),
						i(s("Id do produto: ")),
						i(s("qtde: "))
						)
				);
		System.out.println(venda.getAll());
		
	}

}
