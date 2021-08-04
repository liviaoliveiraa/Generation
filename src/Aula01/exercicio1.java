package Aula01;

import java.util.Scanner;

public class exercicio1 {

	/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade, anos, meses, idadeTotal, dias;
		
		System.out.println("Digite a sua idade em anos: ");
		anos = entrada.nextInt();
		
		System.out.println("Após o mês do seu aniversário, quantos meses já se passaram?: ");
		meses = entrada.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = entrada.nextInt();
		
		idade = anos * 365;
		meses = meses *30;
		idadeTotal = idade + meses + dias;
		
		System.out.println("Sua idade é " + idadeTotal + " em dias");
		
		entrada.close();

	}

}
