package Aula01;

import java.util.Scanner;

public class exercicio8 {
	
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	
	public static void main(String[] args) {
		
		Scanner informe = new Scanner(System.in);
		
		double valor, carroConsumidor, carroImposto;
		
		System.out.println("Qual o custo do carro? ");
		valor = informe.nextInt();
		
		carroImposto = (valor + (valor * 0.45));
		carroConsumidor = carroImposto + (carroImposto * 0.28);
		
		System.out.println("O valor final para o consumidor será de R$" + carroConsumidor);
		
		informe.close();		

	}
}
