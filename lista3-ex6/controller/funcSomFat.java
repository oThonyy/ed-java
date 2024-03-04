package controller;

public class funcSomFat {
	
	public funcSomFat() {
		super();
	}
	
	public double fatRecursiva (double n) {
		//Condição, se o valor base do fatorial chegar a 1, retorne 1.
		if (n == 1) {
			return 1;
		}
		else {
			return n * fatRecursiva(n - 1);
		}
	}
	
	public double somRecursiva (double n, int i) {
		//Condição, se o valor do contador chegar ao limite proposto, retorne 1.
		double fat;
		if (n > i) {
			return 1;
		}
		else {
			fat = fatRecursiva(n);
			return 1 / fat + somRecursiva(n + 1, i);
		}
	}
	
}
