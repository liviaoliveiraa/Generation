package Aula02;

import java.util.Scanner;

public class exercicio1 {
	
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		int x, y, z, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite 3 n�meros: ");
		x = leia.nextInt();
		y = leia.nextInt();
		z = leia.nextInt();
		 
		if(x > y && x > z) {
			maior = x;
			
		} if(x > z && x > y) {
			maior = x;
			
		} if(y > z && y > x) {
			maior = y; 
		
		} if(y > x && y > z) {
			maior = y;
			
		} if(z > x && z > y) {
			maior = z;
			        
		} if (z > y && z > x) {
			maior = z;
		}
		
		System.out.println("O maior �: " + maior);
		
		leia.close();
		
	}

}
