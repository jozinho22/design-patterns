package structuration.facade;

/*
 * Le modèle Façade peut être utilisé pour :
 * Faciliter l'utilisation partielle d'un sous-système complexe ou de plusieurs classes
 * Masquer l'existence d'un sous-système
 * Ajouter des fonctionnalités sans modifier le sous-système
 * Assurer un découplage entre le client et le sous-système 
 * (par exemple pour chaque couche d'une architecture logicielle N tiers)
 * 
 */
public class Facade {

	private static Facade instance;

	public static Facade getFacade() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public void methode1() {
		System.out.println("Methode 1 : ");
		ClasseA.methodeA();
		ClasseD.methodeD();
		ClasseC.methodeC();
	}

	public void methode2() {
		System.out.println("Methode 2 : ");
		ClasseB.methodeB();
		ClasseC.methodeC();
	}
}
