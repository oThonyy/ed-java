package view;

import Controller.somaInteiros;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		somaInteiros som = new somaInteiros();
		
		int i = 6;
		
		int somatoria = som.somatoria(i);
		
		//Chamada função
		JOptionPane.showMessageDialog(null, "Somat�ria com recursividade " + somatoria);
	}

}
