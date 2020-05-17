package structuration.decorator;

/*
 * D�finir les d�corateurs qui h�ritent du d�corateur
 * de base et impl�mentent les fonctionnalit�s suppl�mentaires 
 * qu'ils sont charg�s de proposer.
 * 
 */
public class TraitementTexte extends TraitementDecorateur {

	private String texte;
	
	public TraitementTexte(String texte) {
		super();
		this.texte = texte;
	}

//	public TraitementTexte(Traitement traitement) {
//		super(traitement);
//	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}
		System.out.println("Ajout du texte " + texte);
	}
}