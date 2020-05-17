package structuration.decorator;

/*
 * D�finir les d�corateurs qui h�ritent du d�corateur
 * de base et impl�mentent les fonctionnalit�s suppl�mentaires 
 * qu'ils sont charg�s de proposer.
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