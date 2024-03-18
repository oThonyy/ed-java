package view;

import controller.ordenacaoQuickSort;

public class Main {

	public static void main(String[] args) {

		//Exercicio 1
		int [ ] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		//Exercicio 2
		int [ ] vetor2 = {44, 43, 42, 41, 40, 39, 38}; 
		//Exercicio 3
		int [ ] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96}; 
		
		System.out.println("Exercicio 1");
		ordenacaoQuickSort.ordenar(vetor);
		
		System.out.println();
		
		System.out.println("Exercicio 2");
		ordenacaoQuickSort.ordenar(vetor2);
		
		System.out.println();
		
		System.out.println("Exercicio 3");
		ordenacaoQuickSort.ordenar(vetor3);
	}

}
