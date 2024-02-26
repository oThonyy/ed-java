package Controller;

public class funcaoSomatoria {
	
	public funcaoSomatoria() {
		super();
	}
	
	public double somatoriaN (double n) {
		//Caso n for igual a 1, retorne 1
		if (n == 1) {
			return 1;
		}
		else {
			return 1 / n + somatoriaN (n - 1);
		}
	}
}
