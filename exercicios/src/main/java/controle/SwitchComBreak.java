package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("Informe a nota : ");
		int nota = entrada.nextInt();

		switch(nota) {
		
		case 10:
			conceito = "A";
			break;
		}
		
		
		System.out.println("conceito é "+conceito);
		entrada.close();
	}
}
