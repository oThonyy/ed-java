package view;

import javax.swing.JOptionPane;
import controller.qtdDigRecursiva;

public class menuQtdDig {

	public static void main(String[] args) {
		
		int cont = 0;
		int tester = 10;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		QuantidadeDigitosController qdc = new QuantidadeDigitosController();
		JOptionPane.showMessageDialog(null, "A quantidade de dígitos no número inteiro é " 
										   + qdc.qtdDigRecursiva(numero, cont, tester));
		
	}

}
