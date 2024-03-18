package bigu.bubble.sort;

public class OrdenacaoBs {
	
	public OrdenacaoBs() {
		super();
	}
	
	public int[ ] bubbleSort(int vetor[ ], int i, int j, int aux) {
		for (i = 0; i < vetor.length; i++){
			for (j = 0; j < vetor.length - 1; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux; 
				}
			}
		mostrarRodada(vetor);
		}
		return vetor;
	}
	
	private void mostrarRodada(int[] vetor) {
        for (int i = 0; i <= vetor.length - 1; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
