package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cd;
import br.com.ecommerce.beans.Livro;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;



public class ImplementarProduto {

	public static void main(String[] args) {
		Produto objeto = null;
		char opcao = Magica.s("Digite <L> ou <C>").charAt(0);
		
		if (opcao=='L')
			objeto = new Livro(
					Magica.s("descricao: "),
					Magica.f("Digite valor de venda: "),
					Magica.f("digite valor de compra"),
					Magica.i("Dfigite o Codigo"),
					Magica.i("Digite a qtde: "),
					Magica.s("Digite o artista: "),
					Magica.s("o autor"),
					Magica.s("digite a Editora")
					);
					
		else
			objeto = new Cd(
					Magica.s("descricao: "),
					Magica.f("Digite valor de venda: "),
					Magica.f("digite valor de compra"),
					Magica.i("Dfigite o Codigo"),
					Magica.i("Digite a qtde: "),
					Magica.s("Digite o nome do artista"),
					Magica.i("Digite o total de faixas"),
					Magica.b("É lançamento")
					);
		
		JOptionPane.showMessageDialog(null, objeto.getAll()+"\nIMPOSTO ROUBADO: "+ objeto.retornarImposto());
		
		while(JOptionPane.showConfirmDialog(
				
				null, 
				"Deseja Continuar",
				"Pergunta",
				JOptionPane.YES_NO_OPTION)==0);
			
	}

}
