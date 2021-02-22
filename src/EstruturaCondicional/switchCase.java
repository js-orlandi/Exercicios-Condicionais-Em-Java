package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int diaSemana;
		
		diaSemana = sc.nextInt();
		String dia;
		
		switch(diaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
			default:
				dia ="Valor Invalido";
				break;
			
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();

	}

}
