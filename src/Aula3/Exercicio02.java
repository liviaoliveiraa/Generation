package Aula3;

import java.util.Scanner;

public class Exercicio02 {
	
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 
		int x = 0;
		int y = 0;
		
		System.out.println("Entre com os números:");
		for(int num = 0; num < 10; num++) {
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				x++; 
			} else {
				y++;
			}	
			
			System.out.println("É impar:" + y + " É par:" + x);
		}
		
		ler.close();
	}

}
