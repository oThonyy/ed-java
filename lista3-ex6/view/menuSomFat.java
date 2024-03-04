package view;

import javax.swing.JOptionPane;
import controller.funcSomFat;

public class menuSomFat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcSomFat somFat = new funcSomFat();
		
		int i;
		double n = 2;
		
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite até onde vai a somatória (máximo 12"));
		
		double somRecursiva = somFat.somRecursiva(n, i);
		
		JOptionPane.showMessageDialog(null, "Resultado da somatória foi " + somRecursiva);
		
	}

}
