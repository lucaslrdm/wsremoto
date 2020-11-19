package br.com.folhaPagamento.implementacao;


import br.com.folhaPagamento.beans.Funcionario;
import br.com.folhaPagamento.beans.Horista;
import br.com.folhaPagamento.util.Puts;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ImplementaFuncionario extends Puts{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Funcionario> lista_funcionario = new ArrayList<Funcionario>();
		
		lista_funcionario.add(new Horista("Lucas ",1005,(float)-134.5,40));
		
		

	}

}
