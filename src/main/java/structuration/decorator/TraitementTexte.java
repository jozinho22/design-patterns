package structuration.decorator;

/*
 * Définir les décorateurs qui héritent du décorateur
 * de base et implémentent les fonctionnalités supplémentaires 
 * qu'ils sont chargés de proposer.
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