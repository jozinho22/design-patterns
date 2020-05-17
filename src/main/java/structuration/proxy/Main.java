package structuration.proxy;

/*
 * Avec le Proxy, une classe représente la fonctionnalité d'une autre classe
 * On crée un objet ayant l'objet principal pout créer une interface avec le monde extérieur
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
