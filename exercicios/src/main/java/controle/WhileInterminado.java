package controle;

import java.util.Scanner;

public class WhileInterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("voce diz : ");
			valor = entrada.next();
		}
		
		entrada.close();
	}
}
