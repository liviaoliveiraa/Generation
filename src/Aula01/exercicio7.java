package Aula01;

import java.util.Scanner;

public class exercicio7 {
	
	//Um sistema de equações lineares do tipo: ax + by = c e dx + ey = f, pode ser resolvido segundo mostrados abaixo: x=(ce-bf)/(ae-bd) e y=(af-cd)/(ae-bd). Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		
	public static void main(String[] args) {
			
		double A,B,C,D,E,F,X,Y;
			
		Scanner leia = new Scanner(System.in);
			
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
			
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
			
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
			
		System.out.println("Digite o valor de D: ");
		D = leia.nextDouble();
			
		System.out.println("Digite o valor de E: ");
		E = leia.nextDouble();
			
		System.out.println("Digite o valor de F: ");
		F = leia.nextDouble();
			
		X = ((C * E) - (B * F)) / ((A * E) - (B * D));
		Y = ((A * F) - (C * D)) / ((A * E) - (B * D));
			
		System.out.println("O resultado da equação de X é: " + X + " e Y é: " + Y);
			
		leia.close();

	}
}
