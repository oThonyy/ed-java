package controller;

public class funcInversao {
	
	//construtor
	public funcInversao() {
		super();
	}
	
	//funcao recursiva
	public String inversaoRecursiva(String txt) {
		//apos pegar todas as letras
		if(txt.isEmpty()) {
			return txt;
		} else {
			//se ainda ouver caracteres na variavel txt, trocar posicao
			//está sendo somada a funcao recursiva mais a ultima letra da variavel, enquanto a primeira é removida
				return invText(txt.substring(1)) + txt.substring(0, 1);
		}
	}
	
}

