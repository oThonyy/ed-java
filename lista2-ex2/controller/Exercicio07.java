package controller;

public class Exercicio07 {
	
	//metodo construtor
	public Exercicio07() {
		super();
	}
	
	//funcoes recursivas
	public int subtraiDivide(int dividendo, int divisor) {
		//condicao de parada
		if (dividendo < divisor) {
			return dividendo;
		} else {
			return subtraiDivide(dividendo - divisor, divisor);
		}
		
	}
	
}
