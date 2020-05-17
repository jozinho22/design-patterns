package behavior.iterator;

/*
 * Iterator est utilis� our acc�der aux �l�ments d'une collection de mani�re s�quentielle
 * sans avoir besoin de conna�tre sa repr�sentation sous-jacente.
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
