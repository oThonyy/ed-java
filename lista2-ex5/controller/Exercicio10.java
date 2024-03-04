package controller;

public class Exercicio10 {
	
	//metodo construtor
	public Exercicio10(){
		super();
	}
	
	//funcao recursiva
	public int mdc(int n1, int n2) {
		//condicao de parada
		if (n1 > n2) {
			return mdc(n1 - n2, n2);
		} else if (n1 == n2) {
			return n1;
		} else {
			return mdc(n2, n1);
		}
	}
}
