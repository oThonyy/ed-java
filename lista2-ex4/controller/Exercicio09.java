package controller;

public class Exercicio09 {
	
	//metodo construtor
	public Exercicio09(){
		super();
	}
	
	//funcao recursiva
	public int fatorialDuplo(int n) {
		//condicao de parada
		if (n == 0) {
			return 1;
		} else {
			if(n % 2 != 0) {
				return n * fatorialDuplo(n- 1);
			}else {
				return fatorialDuplo(n - 1);
			}		
		}
	}
}
