package EstruturaCondicional;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroImparOuPar;
		
		numeroImparOuPar = sc.nextInt();
		
		if(numeroImparOuPar % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
