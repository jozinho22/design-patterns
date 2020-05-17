package creation.builder.item;

import creation.builder.Assiette;
import creation.builder.Service;

public abstract class Galette implements Item {

	public Service service() {
		return new Assiette();
	}

	public abstract float price();
}
