package Aula01;

import java.util.Scanner;

import java.lang.Math;

public class exercicio4 { 

	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D = (R+S)/2 onde R = (A+B)² e S = (B + C)² 
		
	public static void main(String[] args) {
			
		double a,b,c,r,s,soma1, soma2;
			
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Informe o valor de A");
		a = leia.nextDouble();
			
		System.out.println("Informe o valor de B");
		b = leia.nextDouble();
			
		System.out.println("Informe o valor de C");
		c = leia.nextDouble();
			
		soma1 = a + b;
		soma2 = b + c;
			
		r = Math.pow(soma1, 2);
		s = Math.pow(soma2, 2);
			

			
		System.out.println("O valor de R é: " + r);
		System.out.println("O valor de C é: " + s);
			
		leia.close();

	}

}
