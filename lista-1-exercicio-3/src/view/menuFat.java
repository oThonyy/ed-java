package view;

import Controller.funcaoFatorial;
import javax.swing.JOptionPane;

public class menuFat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcaoFatorial res = new funcaoFatorial();
		int num = 13;
		
		while (num > 12) {
		num = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor deseja calcular em fatorial? (Limite 12)"));
		}
		
		int fatorial = res.fatorial(num);
		
		//Chamada da função
		JOptionPane.showMessageDialog(null, "Resultado da recursividade foi "+ fatorial);
		
	}

}
