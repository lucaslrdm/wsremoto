package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano (maior q 1900 - menor 2002: "));
		while(ano <=1900 || ano >=2002)
			 ano = Short.parseShort(JOptionPane.showInputDialog("VC SABE LER? Digite o ano (maior q 1900 - menor 2002: "));

		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite m�s do ano: "));
		while(mes <=0 || mes >=13)
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia do m�s: (UM ANO S� TEM 12 MESES)"));

		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o DIA DO MES: "));
		if(mes ==2) {
			while (dia <1 || dia >29)
				dia = Byte.parseByte(JOptionPane.showInputDialog("m�s dois tem apenas 28 dias"));
		}else if( mes ==4 || mes ==6 || mes ==9 || mes ==11 ) {
			while (dia <1 || dia >30)
				dia = Byte.parseByte(JOptionPane.showInputDialog("esse m�s tem apenas 30 dias"));

		}else {
			while (dia <1 || dia >31)
				dia = Byte.parseByte(JOptionPane.showInputDialog("esse m�s tem apenas 31 dias"));
		}
		
		System.out.println("A data digitada foi: " + dia + "/" + mes + "/" + ano);
			
		}
			

	}


