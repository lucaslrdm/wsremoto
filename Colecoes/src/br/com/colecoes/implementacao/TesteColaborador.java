package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Colaborador;
import br.com.colecoes.util.Puts;

public class TesteColaborador {

	public static void main(String[] args) {
		 String nome = Puts.s("Digite o nome: ");
		 String cpf = Puts.s("Digite o CPF: ");
		 List<String> lista = new ArrayList<String>();
 
		 do {
			 lista.add(Puts.s("Digite seus Telefones: "));
			 
			 
		 }while(JOptionPane.showConfirmDialog(
					null, 
					"Ainda há Telefones?",
					"Pergunta",
					JOptionPane.YES_NO_OPTION)==0);
		 Colaborador colab = new Colaborador(nome,cpf,lista);
		 
		 
			JOptionPane.showMessageDialog(null, colab.getAll());
			
			if(JOptionPane.showConfirmDialog(
					null, 
					"Ainda há Telefones?",
					"Pergunta",
					JOptionPane.YES_NO_OPTION)==0)
				for(int i =0; i< lista.size();i++)
					System.out.println("Telefone "+i+lista.get(i)+"\n");
			
			

		 
		}
		 
		
	}



