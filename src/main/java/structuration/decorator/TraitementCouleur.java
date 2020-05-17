package structuration.decorator;

/*
 * D�finir les d�corateurs qui h�ritent du d�corateur
 * de base et impl�mentent les fonctionnalit�s suppl�mentaires 
 * qu'ils sont charg�s de proposer.
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
