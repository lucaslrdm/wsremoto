package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Endereco;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.interfaces.Magica;

public class ImplementarConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(
				Magica.i("Digite o Id Cliente; "),
				Magica.s("Digite o Nome do Cliente:"),
				Magica.s("Informe o CPF"),
				new Endereco(
						Magica.s("Informe Logradouro:"),
						Magica.s("Informe o numero:"),
						Magica.b("Possui Complemento?"),
						Magica.s("Informe o Bairro"),
						Magica.s("Informe o Cidade"),
						Magica.s("Informe o UF"),
						Magica.s("Informe o CEP")
						
						)
				);
		
		Conta conta =null;
		char opcao;
		do {
			opcao = Magica.s("Digite <P> ou <C>").charAt(0);
		}while(opcao!='P' && opcao!='C');
		
		
		if (opcao=='P')
			conta =new Poupanca(
					Magica.sh("Digite o numero da conta:"),
					Magica.by("Digite o Digito:"),
					Magica.sh("Digite a Agencia"),
					Magica.f("Informe o Saldo"),
					cliente,
					Magica.f("Informe o Rendimento: ")
					);
		
		else conta = new Corrente(
						Magica.sh("Digite o numero da conta:"),
						Magica.by("Digite o Digito:"),
						Magica.sh("Digite a Agencia"),
						Magica.f("Informe o Saldo"),
						cliente,
						Magica.f("Informe o Limite: "),
						Magica.f("Informe a Taxa: ")
						);
				
		JOptionPane.showMessageDialog(null, conta.getAll());


		conta.depositar(600);
		conta.sacar((float)800.50);
		
		
		
		JOptionPane.showMessageDialog(null, conta.getAll());

		
	}

}
