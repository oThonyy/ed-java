package view;

import controller.Exercicio07;

public class Main {

	public static void main(String[] args) {

		//2. Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
		//subtra��es, exiba o resto da divis�o.
		
		//variaveis
		int dividendo = 7; //valor que ser� dividido
		int divisor = 4; //valor que dividir�
		
		//instancia de classe
		Exercicio07 calculo = new Exercicio07();
		
		//exibindo resultado
		int resultado = calculo.subtraiDivide(dividendo, divisor);
		System.out.println("O resto de "+ dividendo +"/"+ divisor +" � "+ resultado);

		
	}

}
