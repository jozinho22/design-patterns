package structuration.decorator;

/*
 * Définir un décorateur de base qui implémente l'interface et possède une 
 * référence sur une instance de l'interface. 
 * Cette référence est le décoré qui va être enrichi des fonctionnalités du décorateur.
 * 
 */
public abstract class TraitementDecorateur implements Traitement {

	protected Traitement traitement;

	public TraitementDecorateur() {
	}

	public TraitementDecorateur(Traitement traitement) {
		this.traitement = traitement;
	}

	public abstract void operation();
	
}