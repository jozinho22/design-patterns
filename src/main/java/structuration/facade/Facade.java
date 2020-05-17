package structuration.facade;

/*
 * Le mod�le Fa�ade peut �tre utilis� pour :
 * Faciliter l'utilisation partielle d'un sous-syst�me complexe ou de plusieurs classes
 * Masquer l'existence d'un sous-syst�me
 * Ajouter des fonctionnalit�s sans modifier le sous-syst�me
 * Assurer un d�couplage entre le client et le sous-syst�me 
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
