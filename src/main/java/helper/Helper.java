package helper;

public class Helper {

	public static void getResults(int param, String complexite, double t1, double t2) {
		System.out.println("Param�tre n = " + param +" - Complexit� de " + complexite);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Vitesse d'�x�cution : " + (double)(t2-t1) + "ms");
		System.out.println("---------------------------------------");
	}
}
