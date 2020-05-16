package decorator;

import decorator.AffichablePoint;

public class Coloration extends AffichablePoint {

	private int c;
	private AffichablePoint p;

	public Coloration(AffichablePoint p, int c) {
		this.p = p;
		this.c = c;
	}

	@Override
	public void affiche() {
		p.affiche();
		System.out.println("Couleur : " + c);
	}

}
