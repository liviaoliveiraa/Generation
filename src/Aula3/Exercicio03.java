package Aula3;

import java.util.Scanner;

public class Exercicio03 {
	
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.

	public static void main(String[] args) {
		int idade = 0, menos21 = 0;
		int mais50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		while(idade != -99) {
			System.out.println("Infome a sua idade: ");
			idade = leia.nextInt();
			
			if(idade > 0 && idade < 21) {
				menos21++;
			}else if(idade > 50) {
				mais50++;
			}
					
		} 
		System.out.println("Pessoas que tem menos de 21 anos são:" + menos21 + " e pessoas que tem mais de 50 anos são: " + mais50);

		leia.close();
	}
	

}
