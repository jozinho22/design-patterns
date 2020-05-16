package decorator;

public class Forme extends AffichablePoint {

	private char f;
	private AffichablePoint p;

	public Forme (AffichablePoint p, char f) {
		this.f = f;
		this.p = p;
	}

	@Override
	public void affiche() {
		p.affiche();
		System.out.println("Forme : " + f);
	}

}
