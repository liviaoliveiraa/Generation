package Aula01;
import java.util.Scanner;

public class exercicio2 {
	
	//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int anos, meses, dias, idadeDias;
			
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
			
		anos = dias/365;
		meses = (dias % 365) / 30;
		idadeDias = ((dias % 365) % 30);
			
		System.out.println("Sua idade � " + anos + "anos" + meses + " meses" + idadeDias + " dias");
			
		leia.close();

	}

}

