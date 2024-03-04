package controller;

public class Exercicio08 {
	
	//metodo construtor
	public Exercicio08(){
		super();
	}
	
	//funcao recursiva
	public int numeroPares(int [] v, int vt) {
		//condicao de parada
		if (vt == 0) {
			return 0;
		} else {
			if(v[vt -1] % 2 == 0) {
				return 1 + numeroPares(v, vt - 1);
			}else {
				return numeroPares(v, vt - 1);
			}		
		}
	}
}
