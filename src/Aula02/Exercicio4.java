package Aula02;

import java.util.Scanner;

public class Exercicio4 {
	
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero desejado: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero digitado � par e a sua raiz quadrada �: " + Math.sqrt(numero));
		} else {
			System.out.println("O seu n�mero � impar e o seu n�mero elevado ao quadrado �: " + Math.pow(numero, 2));
		}
		
		leia.close();
	}

}
