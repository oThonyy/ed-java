package view;

import javax.swing.JOptionPane;
import controller.funcSomFat;

public class menuSomFat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcSomFat somFat = new funcSomFat();
		
		int i;
		double n = 2;
		
		i = Integer.parseInt(JOptionPane.showInputDialog("Digite at� onde vai a somat�ria (m�ximo 12"));
		
		double somRecursiva = somFat.somRecursiva(n, i);
		
		JOptionPane.showMessageDialog(null, "Resultado da somat�ria foi " + somRecursiva);
		
	}

}
