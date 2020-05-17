package creation.abstractfactory;

public class TeslaFactoryUSA implements ITeslaFactory {

	public TeslaModelS getTeslaModelS() {
		return new TeslaModelSUSA();

	}

	public TeslaRoadster getTeslaRoadster() {
		return new TeslaRoadsterUSA();
	}


}
