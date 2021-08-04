package Aula3;

import java.util.Scanner;

public class Exercicio05 {
	
 //Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.
	
	public static void main(String[] args) {
		
		int num = 0;
		int soma = 0;
		Scanner leia = new Scanner(System.in);
				
				do{
					System.out.println("Digite qualquer número: ");
					num = leia.nextInt();
					soma = soma + num;
				} while(num != 0);
				
				
				System.out.println("A soma dos números digitados é:  " + soma);
				
				
				leia.close();

	}

}
