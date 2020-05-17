package structuration.decorator;

public class TraitementDecorateur2 extends TraitementDecorateur {

	public TraitementDecorateur2() {
		super();
	}

	public TraitementDecorateur2(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}

		System.out.println("TraitementDecorateur2.operation()");
	}
}
