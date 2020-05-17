package structuration.decorator;

/*
 * Définir les décorateurs qui héritent du décorateur
 * de base et implémentent les fonctionnalités supplémentaires 
 * qu'ils sont chargés de proposer.
 * 
 */
public class TraitementCouleur extends TraitementDecorateur {

	private String couleur;
	
//	public TraitementCouleur() {
//		super();
//	}

	public TraitementCouleur(Traitement traitement, String couleur) {
		super(traitement);
		this.couleur = couleur;
	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}

		System.out.println("Ajout de la couleur " + couleur);
	}
}
