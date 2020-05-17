package structuration.proxy;

/*
 * Avec le Proxy, une classe repr�sente la fonctionnalit� d'une autre classe
 * On cr�e un objet ayant l'objet principal pout cr�er une interface avec le monde ext�rieur
 * 
 */
public class Main {

	public static void main(String[] args) {
		Video video = new ProxyVideo("Snatch.movie");

		// image will be loaded from disk
		video.play();
		System.out.println("");

		// image will not be loaded from disk
		video.play();
	}

}
