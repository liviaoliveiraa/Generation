package Aula4;

import java.util.Scanner;

public class Exercicio1 {
	
	//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.

	public static void main(String[] args) {

		int x, maior = 0;
		
		int[] arrayVetor = new int[5];
		
		Scanner leia = new Scanner(System.in);
				
		for( x = 0; x <5; x++) {
			System.out.println("Digite as pontua��es: ");
			arrayVetor[x] = leia.nextInt();
			if(maior < arrayVetor[x]) {
				maior = arrayVetor[x];
			}
			
			leia.close();
		} 
		
		System.out.println("O maior n�mero foi: " + maior);
		

		}
}

