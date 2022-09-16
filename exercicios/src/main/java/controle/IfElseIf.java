package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("nota invalida");
		} else if(nota >= 8.1) {				
			System.out.println("conceito a");
		} else if(nota >= 6.1) {
			System.out.println("conceito b");
		} else if(nota >= 4.1) {
			System.out.println("conceito c");
		} else if(nota >= 1.1) {
			System.out.println("conceito d");
		} else {
			System.out.println("conceito e");
		}
		
		entrada.close();
	}
}
