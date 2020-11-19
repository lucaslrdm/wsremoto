package br.com.turma11corp.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.turma11corp.ecommerce.model.Produto;
import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
public class EcommerceController {
	
	/*
	 * a anotação informa que o metodi sayhello ia responder na url
	 * 
	 * que é formada da seguinte maneira
	 * 
	 */
	@GetMapping("/boasVindas")
	public String boasVindas() {
		return "nada mais que um teste\n";
		
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "talvez seja outro teste";
	}
	
	@GetMapping("/produtos")
	public Produto exibirProduto() {
		Produto prod;
		prod = new Produto();
		prod.setId(1000);
		prod.setNome("Notebook");
		prod.setDetalhes("um produto, que custa algum valor");
		prod.setPreco(5000.0);
		prod.setQtdeEstoque(10);
		
		return prod;
		
		
		
	}
	
	@GetMapping("/produtos/todos")
	public ArrayList<Produto> getAllProdutos(){
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		Produto prod1;
		prod1 = new Produto();
		prod1.setId(1001);
		prod1.setNome("Notebook");
		prod1.setDetalhes("um produto, que custa algum valor");
		prod1.setPreco(5000.0);
		prod1.setQtdeEstoque(10);
		
		Produto prod2;
		prod2 = new Produto();
		prod2.setId(1002);
		prod2.setNome("Celular");
		prod2.setDetalhes("um celular usado");
		prod2.setPreco(130.0);
		prod2.setQtdeEstoque(98);
		
		Produto prod3;
		prod3 = new Produto();
		prod3.setId(1003);
		prod3.setNome("ps4");
		prod3.setDetalhes("sem valor ");
		prod3.setPreco(1900.0);
		prod3.setQtdeEstoque(10);
		
		Produto prod4;
		prod4 = new Produto();
		prod4.setId(1004);
		prod4.setNome("jogo assasins creed valhalla");
		prod4.setDetalhes("jogo caro");
		prod4.setPreco(300.0);
		prod4.setQtdeEstoque(2);
		
		Produto prod5;
		prod5 = new Produto();
		prod5.setId(1005);
		prod5.setNome("ps5 ");
		prod5.setDetalhes("caro");
		prod5.setPreco(5000.0);
		prod5.setQtdeEstoque(1);
		
		listaProdutos.add(prod1);
		listaProdutos.add(prod2);
		listaProdutos.add(prod3);
		listaProdutos.add(prod4);
		listaProdutos.add(prod5);
		
		return listaProdutos;
		
	}
	
	@PostMapping("/produtos/novo")
	public String adicionaNovoProduto(@RequestBody Produto novo) {
		
		System.out.println("____DEBUG____\n");
		
		System.out.println("produto recebido : "+ novo.getId()+"/"+
				novo.getNome()+"/"+
				novo.getDetalhes()+"/"+
				novo.getPreco()+"/"+
				novo.getQtdeEstoque()
		);
		
		System.out.println("____fim do DEBUG____");
		
		return "sucesso";
	}
	
	

}
