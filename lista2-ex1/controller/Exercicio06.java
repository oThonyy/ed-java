package controller;

public class Exercicio06 {
	
	//metodo construtor
	public Exercicio06() {
		super();
	}
	
	//funcoes recursivas
	public int somaMultiplica(int a, int b) {
		//condicao de parada
		if (b == 0) {
			return 0;
		} else {
			return a + somaMultiplica(a, b-1);
		}
		
	}
	
}
