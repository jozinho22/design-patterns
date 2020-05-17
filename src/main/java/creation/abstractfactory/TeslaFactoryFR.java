package creation.abstractfactory;

public class TeslaFactoryFR implements ITeslaFactory {

	public TeslaModelS getTeslaModelS() {
		return new TeslaModelSFR();
	}

	public TeslaRoadster getTeslaRoadster() {
		return new TeslaRoadsterFR();

	}

}