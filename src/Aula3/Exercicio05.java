package Aula3;

import java.util.Scanner;

public class Exercicio05 {
	
 //Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
	
	public static void main(String[] args) {
		
		int num = 0;
		int soma = 0;
		Scanner leia = new Scanner(System.in);
				
				do{
					System.out.println("Digite qualquer n�mero: ");
					num = leia.nextInt();
					soma = soma + num;
				} while(num != 0);
				
				
				System.out.println("A soma dos n�meros digitados �:  " + soma);
				
				
				leia.close();

	}

}
