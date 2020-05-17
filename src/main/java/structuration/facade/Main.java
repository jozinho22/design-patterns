package structuration.facade;

/*
 * Une bonne pratique de conception est d'essayer de limiter le couplage 
 * existant entre des fonctionnalit�s propos�es par diff�rentes entit�s. 
 * Dans la pratique, il est pr�f�rable de d�velopper un petit nombre de classes
 * et de proposer une classe pour les utiliser. 
 * C'est ce que propose le motif de conception fa�ade.
 * 
 * Le but est de proposer une interface facilitant la mise en oeuvre
 * d'un ensemble de classes g�n�ralement regroup�es dans un ou plusieurs sous-syst�mes.
 * Le motif Fa�ade permet d'offrir un niveau d'abstraction entre l'ensemble de
 * classes et celles qui souhaitent les utiliser en proposant une interface
 * de plus haut niveau pour utiliser les classes du sous-syst�me.
 *  
 */
public class Main {

	public static void main(String[] args) {
		
	    Facade facade = Facade.getFacade();

	    facade.methode1();
	    facade.methode2();
	}

}
