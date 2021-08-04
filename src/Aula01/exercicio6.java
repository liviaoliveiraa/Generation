package Aula01;

import java.util.Scanner;

public class exercicio6 {
	
	// Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
	
	public static void main(String[] args) {
		
		Scanner informe = new Scanner(System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		System.out.println("Digite o valor de X do Primeiro Ponto: ");
		x1 = informe.nextDouble();
		
		System.out.println("Digite o valor de Y do Primeiro Ponto: ");
		y1 = informe.nextDouble();
		
		System.out.println("Digite o valor de X do Segundo Ponto: ");
		x2 = informe.nextDouble();
		
		System.out.println("Digite o valor de Y do Segundo Ponto: ");
		y2 = informe.nextDouble();
		
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y2-y1), 2.0);
		d = Math.sqrt((p1 + p2));
		
		System.out.println("A distância entre os pontos é: " + d);
		
		informe.close();
		
	}


}
