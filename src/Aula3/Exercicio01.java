package Aula3;

//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.

public class Exercicio01 {
	

	public static void main(String[] args) {
		
	
		for(int num =1000; num <=1999; num++) {
			if(num % 11 == 5) {
				System.out.println("Os n�meros entre 1000 e 1999 divididos por 11 restando 5 s�o: " + num);
			}
			
		}
		
	}

}