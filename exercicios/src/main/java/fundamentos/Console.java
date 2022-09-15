package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.println("bom");
		System.out.println(" dia \n\n");
		
		System.out.println("bom");
		System.out.println("dia");
		
		System.out.printf("megasena: %d %d %d", 1,2,3);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome : ");
		String nome = entrada.nextLine();
		
		System.out.printf("%s", nome);
		
		entrada.close();
	}
}
