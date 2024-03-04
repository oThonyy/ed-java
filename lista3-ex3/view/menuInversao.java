package view;
import javax.swing.JOptionPane;

import controller.funcInversao;

public class menuInversao {

	public static void main(String[] args) {
		
		String txt = String.parseString(JOptionPane.showInputDialog("Insira uma palavra ou nome"));

		funcInversao inv = new funcInversao();
		String inversaoRecursiva = inv.inversaoRecursiva(txt); 
		
		System.out.println("O contrario de "+ txt +" é " + inversaoRecursiva);
		
	}

}
