package Aula4;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		
		int linha, coluna;
		
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.println("Escreva os números de N1: ");
				n1[linha][coluna] = leia.nextInt();
				System.out.println("Escreva os números de N2: ");
				n2[linha][coluna] = leia.nextInt();
				
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		}
		
		for(linha=0; linha < 4; linha++) {
			for(coluna = 0; coluna < 6; coluna++) {
				System.out.println("Matriz M1: " + m1[linha][coluna]);
				System.out.println("Matriz M2: " + m2[linha][coluna]);
			}
		}

	}

}
