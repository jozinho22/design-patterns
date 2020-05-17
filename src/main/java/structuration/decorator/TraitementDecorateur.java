package structuration.decorator;

/*
 * D�finir un d�corateur de base qui impl�mente l'interface et poss�de une 
 * r�f�rence sur une instance de l'interface. 
 * Cette r�f�rence est le d�cor� qui va �tre enrichi des fonctionnalit�s du d�corateur.
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