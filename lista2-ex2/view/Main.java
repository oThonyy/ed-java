package view;

import controller.Exercicio07;

public class Main {

	public static void main(String[] args) {

		//2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
		//subtrações, exiba o resto da divisão.
		
		//variaveis
		int dividendo = 7; //valor que será dividido
		int divisor = 4; //valor que dividirá
		
		//instancia de classe
		Exercicio07 calculo = new Exercicio07();
		
		//exibindo resultado
		int resultado = calculo.subtraiDivide(dividendo, divisor);
		System.out.println("O resto de "+ dividendo +"/"+ divisor +" é "+ resultado);

		
	}

}
