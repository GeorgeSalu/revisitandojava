package oo.heranca;

public class Heroi extends Jogador {

	boolean atacar(Jogador oponente) {
		boolean atacar1 = super.atacar(oponente);
		boolean atacar2 = super.atacar(oponente);
		boolean atacar3 = super.atacar(oponente);
		return atacar1 || atacar2 || atacar3;
	}

}
