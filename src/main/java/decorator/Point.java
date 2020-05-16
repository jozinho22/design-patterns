package decorator;

import decorator.AffichablePoint;;

public class Point extends AffichablePoint {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void affiche() {
		System.out.println("Coordonnées : x = " + x + ", y = " + y);
	}

}
