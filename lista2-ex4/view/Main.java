package view;

import controller.Exercicio09;

public class Main {

	public static void main(String[] args) {

		//4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
		//desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
		//produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
		//duplo de 5 é:
		
		//variaveis
		int n = 5; //valor para fatorar
		
		//instancia de classe
		Exercicio09 calculo = new Exercicio09();
		
		//exibindo resultado
		int resultado = calculo.fatorialDuplo(n);
		System.out.println("O fatorial duplo de "+ n +" é " + resultado);

	}

}
