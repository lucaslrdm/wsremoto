package br.com.bankofoz.interfaces;

import javax.swing.JOptionPane;

public class Magica {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static short sh(String msg) {
		return Short.parseShort(s(msg));

	}
	
	public static byte by(String msg) {
		return Byte.parseByte(s(msg));

	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static boolean b(String msg) {
		int opcao = JOptionPane.showConfirmDialog
				(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION);
		if(opcao==0)
			return true;
		else return false;
	}

}
