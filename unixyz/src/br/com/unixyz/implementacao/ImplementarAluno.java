package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		Aluno aluno =new Aluno();
		aluno.setAll(Integer.parseInt(JOptionPane.showInputDialog("DIGITE O RM: ")), 
				JOptionPane.showInputDialog("DIGITE O NOME: "), 
				JOptionPane.showInputDialog("DIGITE O EMAIL: "));
		
		System.out.println(aluno.getAll());
		
	

	}

}
