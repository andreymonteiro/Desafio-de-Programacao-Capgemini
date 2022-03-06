package questoes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Questao01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Float> numeros = new ArrayList<Float>();
		
		System.out.println("Quantos números você vai digitar? ");
	    int qnt = entrada.nextInt();
	
	    for (int i = 0; i < qnt; i++) {
		    System.out.println("Digite o "+ (i+1) +"° número: ");
		    float vet = entrada.nextFloat();
		    numeros.add(vet);
	    }
	    
	    Collections.sort(numeros);
		calcularMediana(numeros);
	}
	
	public static float calcularMediana(List<Float> numeros) {

		float resultado = 0.0f;

		if (numeros.size() % 2 != 0) {
			int posicaoNumero = ((numeros.size() + 1) / 2) - 1;
			resultado = numeros.get(posicaoNumero); 
			
		} else {
			int posicaoNumero = Math.round((numeros.size() + 1) / 2) - 1;
			resultado = (numeros.get(posicaoNumero) + numeros.get(posicaoNumero + 1)) / 2;
		}
		
		System.out.println("A Mediana dos números citados é " + resultado);
		return resultado;
	}
}
