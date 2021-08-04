package Aula01;

import java.util.Scanner;

public class exercicio3 {
	
	 
	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		
	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
			
		int segundos, minutos, horas;
			
		System.out.println("Informe o valor em segundos: ");
		segundos = leia.nextInt();
			
		horas = segundos/3600;
		minutos = (segundos - (horas*3600))/60;
		segundos = segundos - (horas*3600)-(minutos*60);
			
		System.out.println(horas + " horas" + minutos + " minutos e" + segundos + " segundos");
			
		leia.close();
			

	}

}

