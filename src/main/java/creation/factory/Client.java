package creation.factory;

public class Client {

	  public static void main(String[] args) {
		  
		TeslaFactory factory = new TeslaFactory();
		Tesla tesla = null;
		
		tesla = factory.getTesla(TeslaType.MODEL_S);
		tesla.rouler();
		
		tesla = factory.getTesla(TeslaType.ROADSTER);
		tesla.rouler();
		

	  }
	}
