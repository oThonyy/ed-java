package view;

import Controller.funcaoSomatoria;
import javax.swing.JOptionPane;

public class menuSomatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcaoSomatoria soma = new funcaoSomatoria();
		
		double n = 5;
		n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N para calculo da somatoria"));
		
		double somatoriaN = soma.somatoriaN(n);
		
		//Chamada da função
		JOptionPane.showMessageDialog(null, "Resultado da somatoria até N foi "+ somatoriaN);
	}

}
