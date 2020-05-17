package structuration.decorator;

/*
 * Le motif de conception d�corateur (decorator en anglais) permet d'ajouter des fonctionnalit�s � 
 * un objet en mettant en oeuvre une solution plus souple que l'h�ritage : 
 * il permet d'ajouter des fonctionnalit�s � une ou plusieurs m�thodes 
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
