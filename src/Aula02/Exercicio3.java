package Aula02;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	 10-14 infantil
	 15-17 juvenil
	 18-25 adulto*/

	public static void main(String[] args) {
		
		int idade;
		
		Scanner digite = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		
		idade = digite.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é infantil.");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é juvenil.");
		} else {
			System.out.println("Sua categoria é adulto.");
		}
		
		digite.close();
		
	}

}
