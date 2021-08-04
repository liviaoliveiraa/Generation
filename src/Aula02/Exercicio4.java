package Aula02;

import java.util.Scanner;

public class Exercicio4 {
	
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número desejado: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número digitado é par e a sua raiz quadrada é: " + Math.sqrt(numero));
		} else {
			System.out.println("O seu número é impar e o seu número elevado ao quadrado é: " + Math.pow(numero, 2));
		}
		
		leia.close();
	}

}
