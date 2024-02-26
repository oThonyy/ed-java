package Controller;

public class funcaoFatorial {
	
	public funcaoFatorial() {
		super();
	}
	
	public int fatorial(int num) {
        // Caso num for 0 ou 1, retorne 1
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // Senao, calcular fatorial
            return num * fatorial(num - 1);
        }
	}
}