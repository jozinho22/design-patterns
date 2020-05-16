package main;

import decorator.AffichablePoint;
import decorator.Coloration;
import decorator.Forme;
import decorator.Point;
import entities.Chat;
import observer.FelinObserver;
import utils.FabriqueFelin;
import utils.Felins;

public class Main {

	public static void main(String[] args) {

		Chat f1 = (Chat) FabriqueFelin.getFelin(Felins.CHAT.getType(), 10, "TOMY", 5, "JOSS");
		System.out.println(f1);
		
		//Observer
		FelinObserver obs = new FelinObserver();
		f1.addObserver(obs);

		//Decorator
		AffichablePoint pc = new Coloration(new Point(2, 3), 4);
		pc.affiche();
		AffichablePoint pf = new Forme(new Point(2, 3), '*');
		pf.affiche();		
		AffichablePoint pcf = new Forme(pc, '+');
		pcf.affiche();
	}

}
