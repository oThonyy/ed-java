package view;

import javax.swing.JOptionPane;

import controller.ordenacoes;

public class Main {

	public static void main(String[] args) {

		ordenacoes ord = new ordenacoes();

		int[] vetor = new int[1500];
		int n;

		
		int se = 0;
		
		while (se != 9) {
			
			n = 1499;
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = n;
				n--;
			}
			
			se = Integer.parseInt(JOptionPane.showInputDialog("MENU\nDigite 1 para Mergesort\nDigite 2 para Quicksort\nDigite 3 para Bubblesort\n\nDigite 9 para sair"));
			if (se == 1) {
				long tempoInicia = System.nanoTime();
				vetor = ord.ordenaMs(vetor);
				long tempoFinal = System.nanoTime();
				double tempoDecorridoNs = (tempoFinal - tempoInicia) / Math.pow(10, 9);
				System.out.println("Mergesort -> " + tempoDecorridoNs + "s");
			}
			else if (se == 2) {
				long tempoInicial = System.nanoTime();
				vetor = ord.ordenaQs(vetor);
				long tempoFinal = System.nanoTime();
				double tempoDecorridoNs = (tempoFinal - tempoInicial) / Math.pow(10, 9);
				System.out.println("Quicksort -> " + tempoDecorridoNs + "s");
			}
			else if (se == 3) {
				long tempoInicial = System.nanoTime();
				vetor = ord.ordenaBs(vetor);
				long tempoFinal = System.nanoTime();
				double tempoDecorridoNs = (tempoFinal - tempoInicial) / Math.pow(10, 9);
				System.out.println("Bubblesort -> " + tempoDecorridoNs + "s");
			}
			else if (se == 9) {
				JOptionPane.showMessageDialog(null, "Programa encerrado.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Valor inválido, retornando...");
			}
		}
	}
}
