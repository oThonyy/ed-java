package Controller;

public class somaInteiros {

	public somaInteiros() {
			super();
	}
	
	public int somatoria(int i) {
		//Caso i for igual a 0, retorne 0
		if(i == 0) {
			return 0;
		}
		else {
			return i + somatoria(i - 1);
		}
	}

}
