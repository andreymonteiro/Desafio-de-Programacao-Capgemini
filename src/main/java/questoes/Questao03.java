package questoes;

import java.util.List;
import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		//Declaração de variaveis
		/*
        * int t = 0;//Numero de caracteres
        * int x = 0;//Posicao de caracteres na fraseJunta
        * String fraseJunta = "";//String contendo todas palavras juntas
        * String[] lista;//Vetor de palavras da frase
        * double raiz;//Calculo de raiz de t
        * int tRaiz;//Arredondando raiz para cima
        * String[][] saida;//Criando vetor bidimensional das letras
        */
		Scanner entrada = new Scanner(System.in);
		String[] lista;//Vetor de palavras da frase

        System.out.print("Digite uma frase:");
        String frase = entrada.nextLine();

        lista = frase.split(" ");
        
        textoEncriptado(lista);
        
        
        
	}

	
	public static String textoEncriptado(String[] lista) {
		int t = 0;//Numero de caracteres
        int x = 0;//Posicao de caracteres na fraseJunta
        String fraseJunta = "";//String contendo todas palavras juntas
        double raiz;//Calculo de raiz de t
        int tRaiz;//Arredondando raiz para cima
        String[][] saida;//Criando vetor bidimensional das letras

		for(String palavra: lista) {
            t += palavra.length();
        }

        raiz = Math.sqrt(t);
        tRaiz = (int) Math.ceil(raiz);
        saida= new String[tRaiz][tRaiz];

        for(String palavra: lista){
            fraseJunta = fraseJunta + palavra;
        }

        /*
         * Metodo responsável por criar um vetor contendo um caractere da frase por posição
         * Exception tratativa de quando o .charAt tenta retornar um valor null de uma posição
         */
        for(int i = 0; i < tRaiz; i++) {
            for(int j = 0; j < tRaiz; j++) {
                try {
                    saida[i][j] = fraseJunta.charAt(x)+"";
                }catch(Exception e) {
                    saida[i][j] = "";
                }
                x++;
            }
        }

        /*
         * Saida
         */
        String exit = "";
        for(int i = 0; i < tRaiz; i++) {
            for(int j = 0; j < tRaiz; j++) {
                System.out.print(saida[j][i]);
                exit += saida[j][i];
                
            }
            System.out.print(" ");
            exit += " ";
        }
        return exit;
	}
	
	
}
