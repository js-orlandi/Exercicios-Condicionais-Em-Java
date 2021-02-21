package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;


public class Exercício05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double codigo, quantidade, valorPagar;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			valorPagar = quantidade * 4.00;
		}else if(codigo == 2) {
			valorPagar = quantidade * 4.50;
		}else if(codigo == 3) {
			valorPagar = quantidade * 5.00;
		}else if(codigo == 4) {
			valorPagar = quantidade * 2.00;
		}else {
			valorPagar = quantidade * 1.50;
		}
  
		System.out.printf("Total: %.2f", valorPagar);
		sc.close();
	}

}
