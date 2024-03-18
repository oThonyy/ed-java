package bigu.merge.sort;

public class OrdenacaoMs {
	
	public OrdenacaoMs() {
		super();
	}
	
public void mergeSort(int [] vetor) {
		
		int t = vetor.length; //adquirindo tamanho do vetor
		if (t <= 1) return; //caso o tamanho for menor que um, retornar 
		
		//declaração de variáveis
		int meio = t / 2;
		int [ ] esquerdaVetor = new int [meio]; //tamanho do vetor é metade
		int [ ] direitaVetor = new int [t - meio]; //tamanho do vetor é o total - metade
		int i = 0; //esquerda 
		int j = 0; //direita
		
		//fazendo a divisão de forma recursiva
		
		for (i = 0; i < t; i++) {
			if (i < meio) {
				esquerdaVetor[i] = vetor[i];  
				//enquanto i não chegar a metade, metade do vetor original será armazenado
				//na esquerdavetor
			} else {
				direitaVetor[j] = vetor[i];
				//após a primeira metade ser preenchida, a segunda começará a ser também
				j++; //contador da segunda parte do vetor
			}
		}
		
		//chamando as funcoes recursivamente
		mergeSort(esquerdaVetor);
		mergeSort(direitaVetor);
		merge(esquerdaVetor, direitaVetor, vetor); //função de suporte
		mostrarRodada(vetor); //mostrando o passo a passo do sorting
		
	}
	
	private static void merge(int [ ] esquerdaVetor, int [ ] direitaVetor, int [ ] vetor) {
		
		int esquerda = vetor.length / 2; //tamanho da esquerda é metade do vetor
		int direita = vetor.length - esquerda; //tamanho da direita é o total - esquerda
		int i = 0; //indice do vetor
		int e = 0; //indice da esquerda
		int d = 0; //indice da direita
		
		//fazendo a junção
		//enquanto o contador da esquerda e direita não chegarem aos respectivos
		//valores totais dos vetores, juntar os valores no vetor original
		while (e < esquerda && d < direita) {
			if (esquerdaVetor[e] < direitaVetor[d]) {
				vetor[i] = esquerdaVetor[e];
				i++;
				e++;
			}else {
				vetor[i] = direitaVetor[d];
				i++;
				d++;
			}
		}
		
		//verificador para ultimo numero restante
		while (e < esquerda) {
			vetor[i] = esquerdaVetor[e];
			i++;
			e++; 
		}
		while (d < direita) {
			vetor[i] = direitaVetor[d];
			i++;
			d++; 
		}
	}
	
	private void mostrarRodada(int[] vetor) {
        for (int i = 0; i <= vetor.length - 1; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
