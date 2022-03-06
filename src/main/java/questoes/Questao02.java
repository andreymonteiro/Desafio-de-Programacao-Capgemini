package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		ArrayList<Integer> n = new ArrayList();
		boolean loop = true;

		while (loop) {
			System.out.println("Digite os numeros do vetor (Para concluir digite uma letra): ");
			if (entrada.hasNextInt()) {
				n.add(entrada.nextInt());
			} else {
				loop = false;
			}
		}
		
		vetorLista(n);
	}

	public static int vetorLista(List<Integer> n) {
		int x = 2;
		int pares = 0;

		for (int i = 0; i < n.size(); i++) {
			for (int o = 0; o < n.size(); o++) {
				if (n.get(i) - n.get(o) == x) {
					pares++;
				}
			}
		}
		System.out.print("Saida:" + pares);
		return pares;

	}

}