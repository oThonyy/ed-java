package view;
import controller.Exercicio06;

public class Main {

	public static void main(String[] args) {

		//1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
		//mul�plicação de A por B.
		
		//variaveis
		int a = 3;
		int b = 5;
		
		//instancia de classe
		Exercicio06 calculo = new Exercicio06();
		
		//exibindo resultado
		int resultado = calculo.somaMultiplica(a, b);
		System.out.println("O resultado de "+ a +"x"+ b +" é "+ resultado);
		
		
	}

}
