package behavior.visitor;

/*
 * Dans ce pattern, on utilise une classe Visitor qui change l'algorithme à exécuter selon la classe.
 * 
 */
public class Main {

	public static void main(String[] args) {
		
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	      
	}

}
