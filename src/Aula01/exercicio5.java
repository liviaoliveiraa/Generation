package Aula01;

import java.util.Scanner;

public class exercicio5 {
	
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	
	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
			
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = digite.nextDouble();
			
		System.out.println("Digite a nota 2: ");
		nota2 = digite.nextDouble();
			
		System.out.println("Digite a nota 3: ");
		nota3 = digite.nextDouble();
			
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			
		System.out.println("A sua m�dia de notas �: " + media);
			
		digite.close();

	}

}
