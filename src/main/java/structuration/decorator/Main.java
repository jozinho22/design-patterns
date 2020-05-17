package structuration.decorator;

/*
 * Le motif de conception décorateur (decorator en anglais) permet d'ajouter des fonctionnalités à 
 * un objet en mettant en oeuvre une solution plus souple que l'héritage : 
 * il permet d'ajouter des fonctionnalités à une ou plusieurs méthodes 
 * existantes d'une classe dynamiquement.
 * 
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("traitement 1 2 3");
		Traitement traitement123 = new TraitementDecorateur3(new TraitementDecorateur2(new TraitementDecorateur1()));
		traitement123.operation();

//		System.out.println("traitement 1 3");
//		Traitement traitement13 = new TraitementDecorateur3(new TraitementDecorateur1());
//		traitement13.operation();

	}

}
