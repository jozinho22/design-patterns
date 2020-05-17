package creation.abstractfactory;

public class Client {

	  public static void main(String[] args) {
		  
		    ITeslaFactory factory1 = new TeslaFactoryFR();
		    ITeslaFactory factory2 = new TeslaFactoryUSA();

		    TeslaModelS modelS = null;
		    TeslaRoadster roadster = null;

		    System.out.println("Utilisation de la premiere fabrique");
		    modelS = factory1.getTeslaModelS();
		    roadster = factory1.getTeslaRoadster();
		    modelS.rouler();
		    roadster.rouler();

		    System.out.println("Utilisation de la seconde fabrique");
		    modelS = factory2.getTeslaModelS();
		    roadster = factory2.getTeslaRoadster();
		    modelS.rouler();
		    roadster.rouler();
		

	  }
	}
