package br.com.turma11corp.ecommerce.model;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Produto {
	
	private int id;
	private String nome;
	private String detalhes;
	private double preco;
	private int qtdeEstoque;
	public Produto(int id, String nome, String detalhes, double preco, int qtdeEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}
	public Produto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	


}
