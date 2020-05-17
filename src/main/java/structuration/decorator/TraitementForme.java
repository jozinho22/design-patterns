package structuration.decorator;

/*
 * Définir les décorateurs qui héritent du décorateur
 * de base et implémentent les fonctionnalités supplémentaires 
 * qu'ils sont chargés de proposer.
 * 
 */
public class TraitementForme extends TraitementDecorateur {

	private String forme;
	
//	public TraitementForme() {
//		super();
//	}

	public TraitementForme(Traitement traitement, String forme) {
		super(traitement);
		this.forme = forme;
	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}
		System.out.println("Transformation en la forme : " + forme);
	}
}