package Aula3;

import java.util.Scanner;

public class Exercicio06 {
	
	//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int media = 0;
		int x = 0;
		
		do {
			
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0) {
				media = media + num;
				x++;
				
			}
			
		} while(num !=0);
		
		media = media / x;
		
		System.out.println("A m�dia dos n�meros digitados m�ltiplos de 3 �: " + media);
		
		leia.close();

	} 

}
