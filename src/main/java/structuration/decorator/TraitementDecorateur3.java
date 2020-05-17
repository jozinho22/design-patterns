package structuration.decorator;

public class TraitementDecorateur3 extends TraitementDecorateur {

	public TraitementDecorateur3() {
		super();
	}

	public TraitementDecorateur3(Traitement traitement) {
		super(traitement);
	}

	@Override
	public void operation() {
		if (traitement != null) {
			traitement.operation();
		}
		System.out.println("TraitementDecorateur3.operation()");
	}
}