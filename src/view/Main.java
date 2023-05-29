package view;

import controller.Arvore;

public class Main {

	public static void main(String[] args) {

		Arvore tree = new Arvore();

		String[] vetor = { "K", "D", "B", "C", "F", "M", "L", "T", "P", "R", "Z" };

		for (String letras : vetor) {
			tree.insert(letras);
		}

		// Removendo a letra M da árvore
		try {
			tree.remove("M");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Realizando os atravessamentos
		try {
			System.out.println("Atravessamento PRE =============");
			tree.prefixSearch();
			System.out.println("");
			System.out.println("Atravessamento IN =============");
			tree.infixSearch();
			System.out.println("");
			System.out.println("Atravessamento POS =============");
			tree.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
