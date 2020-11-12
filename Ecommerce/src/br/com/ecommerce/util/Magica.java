package br.com.ecommerce.util;

import javax.swing.JOptionPane;

public class Magica {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static float f(String msg) {
		return Float.parseFloat(msg);
	}
	
	public static int i(String msg) {
		return Integer.parseInt(msg);
	}

}
