package structuration.decorator;

public class TraitementDecorateur1 extends TraitementDecorateur {

	public TraitementDecorateur1() {
		super();
	}

	public TraitementDecorateur1(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}
		System.out.println("TraitementDecorateur1.operation()");
	}
}