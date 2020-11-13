package br.com.ecommerce.beans;

import br.com.ecommerce.util.PadraoPrudoto;

public class Livro extends Produto implements PadraoPrudoto{
	public String getIsbn() {
		return isbn;
	}

	private String isbn;
	private String autor;
	private String editora;
	
	public Livro(String descricao, float valorVenda, float valorCompra, int id, int qtde, String isbn, String autor,
			String editora) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getAll() {
		return
				super.getAll()+
				"isbn___________:"+isbn+"\n"+
				"autor__________:"+autor+"\n"+
				"editora________:"+editora+"\n";
	}

	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String isbn, String autor,
			String editora) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
	}



	public Livro() {
		super();
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public float retornarImposto() {
		// TODO Auto-generated method stub
		return getValorVenda() * (float) 0.5;
	}

	@Override
	public float ObterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return getValorVenda() - getValorVenda() * (param/90);
	}

}
