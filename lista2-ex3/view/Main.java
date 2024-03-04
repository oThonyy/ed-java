package view;

import controller.Exercicio08;

public class Main {

	public static void main(String[] args) {

		//3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
		//números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
		//diferentes de zero.
		
		//variaveis
		int [ ] v = {8, 5, 3, 4, 9, 11, 2, 42}; //vetor, 11 posicoes, 4 pares
		int vt = v.length; //tamanho do vetor
		
		//instancia de classe
		Exercicio08 calculo = new Exercicio08();
		
		//exibindo resultado
		int resultado = calculo.numeroPares(v, vt);
		System.out.println("O numero de pares no vetor � "+ resultado);

	}

}
