package behavior.observer;

/*
 * Observer est utilis� lorsqu'i lexiste plusieurs relations OneToMany
 * entre diff�rents objets, tels que si un objet est modifi�, les autres
 * doivent �tre notifi�s de la modification
 * 
 */
public class Main {

	public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}

}
