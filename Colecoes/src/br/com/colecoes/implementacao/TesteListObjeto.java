package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.util.Puts;

public class TesteListObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(
				new Cargo(Puts.s("Cargo: "), 
						Puts.s("Nivel: "), 
						Puts.f("Salario: ")));
		Cargo cargo2 = new Cargo();
		cargo2.setNome(Puts.s("Nome do cargo:"));
		cargo2.setNivel(Puts.s("Nivel do cargo:"));
		cargo2.setSalario(Puts.f("Salario do cargo:"));
		
		lista.add(cargo2);
		int qtdeJr =0;
		float totalSal =0;
		
		for (int i =0; i < lista.size();i++) {
			System.out.println(lista.get(i).getAll());
			//JOptionPane.showMessageDialog(null, lista.get(0).getAll()+"\n"+lista.get(1).getAll());
			if (lista.get(i).getNivel().equals("JR")) 
				qtdeJr++;
			totalSal = totalSal+lista.get(i).getSalario();
			

		}
		
		JOptionPane.showMessageDialog(null, "Total de Cargos JR Inseridos: "+ qtdeJr+"\n"+
				"Media entre os salarios inseridos: "+ (totalSal/lista.size())
				);


		
	}

}
