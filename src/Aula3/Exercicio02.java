package Aula3;

import java.util.Scanner;

public class Exercicio02 {
	
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 
		int x = 0;
		int y = 0;
		
		System.out.println("Entre com os n�meros:");
		for(int num = 0; num < 10; num++) {
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				x++; 
			} else {
				y++;
			}	
			
			System.out.println("� impar:" + y + " � par:" + x);
		}
		
		ler.close();
	}

}
