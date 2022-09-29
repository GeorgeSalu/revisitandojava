package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();			
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;			
		} else {
			velocidadeAtual = 0;
		}
	}
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	@Override
	public String toString() {
		return "velocidade atual é"+velocidadeAtual;
	}
	
}
