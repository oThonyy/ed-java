package view;

import controller.Exercicio10;

public class Main {

	public static void main(String[] args) {

		//5. O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou
//		mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a
//		fatoração por meio da decomposição em fatores primos dos números indicados.
//		Para exemplificar, vamos calcular através da fatoração o MDC do 20 e 24:
//		Para saber o MDC dos números, devemos olhar à direita da fatoração e ver quais números dividiram,
//		simultaneamente, nas duas colunas e mul�plicá-los.
//		Assim, pela fatoração podemos concluir que o 4 (2 x 2) é o maior número que divide ambos e, portanto,
//		é o máximo divisor comum de 20 e 24.
//		Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.
		
		//variaveis
		int n1 = 20; 
		int n2 = 24; 
		
		//instancia de classe
		Exercicio10 calculo = new Exercicio10();
		
		//exibindo resultado
		int resultado = calculo.mdc(n1, n2);
		System.out.println("O maximo divisor comum de "+ n1 +" e "+ n2 + " é " + resultado);

	}

}
