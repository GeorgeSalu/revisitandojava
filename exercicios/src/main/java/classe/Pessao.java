package classe;

public class Pessao {
	String nome;
	double peso;
	
	public Pessao(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "ola eu sou o "+nome+" e tenho "+peso+" kgs";
	}
}
