package Aula4;

import java.util.Scanner;

public class Exercicio2 {
	
	/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o.*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] dado = new double[10];
		double media=0, maior=0, soma=0;
		int x, maiorPontuacao=0;
		
		for(x = 0; x <=9; x++) {
			System.out.println("Digite os lan�amentos: ");
			dado[x] = ler.nextInt();
			
			soma = soma + dado[x];
			media = soma/10;
			
			if(dado[x] == maior) {
				maiorPontuacao++;
			}if(maior < dado[x]) {
				maior = dado[x];
			}
		}
		System.out.println("A soma dos lan�amentos �: " + soma);
		System.out.println("A m�dia dos lan�amentos �: " + media);
		System.out.println("A quantidade do maior lan�amento �: " + (maiorPontuacao+1) + " e o maior lan�amento foi: " + maior);
		

	}

}
