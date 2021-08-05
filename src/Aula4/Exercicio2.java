package Aula4;

import java.util.Scanner;

public class Exercicio2 {
	
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] dado = new double[10];
		double media=0, maior=0, soma=0;
		int x, maiorPontuacao=0;
		
		for(x = 0; x <=9; x++) {
			System.out.println("Digite os lançamentos: ");
			dado[x] = ler.nextInt();
			
			soma = soma + dado[x];
			media = soma/10;
			
			if(dado[x] == maior) {
				maiorPontuacao++;
			}if(maior < dado[x]) {
				maior = dado[x];
			}
		}
		System.out.println("A soma dos lançamentos é: " + soma);
		System.out.println("A média dos lançamentos é: " + media);
		System.out.println("A quantidade do maior lançamento é: " + (maiorPontuacao+1) + " e o maior lançamento foi: " + maior);
		

	}

}
