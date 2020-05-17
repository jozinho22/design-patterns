package creation.factory;

public class TeslaFactory {

	public Tesla getTesla(TeslaType teslaType) {
		Tesla tesla = null;
		
		switch(teslaType) {
			case MODEL_S:
				tesla = new TeslaModelS();
				break;
			case ROADSTER:
				tesla = new TeslaRoadster();
				break;
		}
		
		return tesla;
		
	}

}
