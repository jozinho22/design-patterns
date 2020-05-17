package creation.builder.item;

import creation.builder.Bouteille;
import creation.builder.Service;

public abstract class Boisson implements Item {

	public Service service() {
		return new Bouteille();
	}

	public abstract float price();
}
