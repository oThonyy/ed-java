package controller;

import bigu.merge.sort.OrdenacaoMs;
import bigu.bubble.sort.OrdenacaoBs;
import bigu.quick.sort.OrdenacaoQs;

public class ordenacoes {

	public ordenacoes() {
		super();
	}
	
	public int[] ordenaMs (int [] vetor) {
		
		OrdenacaoMs ord = new OrdenacaoMs();	
	
		ord.mergeSort(vetor);
	
		return vetor;
	 }
	
	public int[] ordenaQs (int [] vetor) {
		
			OrdenacaoQs ord = new OrdenacaoQs();	
			
			ord.quickSort(vetor, 0, vetor.length - 1);
			
			return vetor;
	}
	
	public int[] ordenaBs (int [] vetor) {
		
			OrdenacaoBs ord = new OrdenacaoBs();
		
			ord.bubbleSort(vetor, 0, 0, 0);
		
			return vetor;
	}
}
