package controller;

import bigu.quick.sort.*;

public class ordenacaoQuickSort {
	
	public ordenacaoQuickSort() {
		super();
	}
	
	public static void ordenar(int [ ] vetor) {
		Ordenacao qs = new Ordenacao();
		
		System.out.println("Quicksort");
		
		qs.quickSort(vetor, 0, vetor.length - 1);
		System.out.println();
	
	}
}
