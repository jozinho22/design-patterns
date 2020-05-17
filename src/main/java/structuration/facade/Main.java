package structuration.facade;

/*
 * Une bonne pratique de conception est d'essayer de limiter le couplage 
 * existant entre des fonctionnalités proposées par différentes entités. 
 * Dans la pratique, il est préférable de développer un petit nombre de classes
 * et de proposer une classe pour les utiliser. 
 * C'est ce que propose le motif de conception façade.
 * 
 * Le but est de proposer une interface facilitant la mise en oeuvre
 * d'un ensemble de classes généralement regroupées dans un ou plusieurs sous-systèmes.
 * Le motif Façade permet d'offrir un niveau d'abstraction entre l'ensemble de
 * classes et celles qui souhaitent les utiliser en proposant une interface
 * de plus haut niveau pour utiliser les classes du sous-système.
 *  
 */
public class Main {

	public static void main(String[] args) {
		
	    Facade facade = Facade.getFacade();

	    facade.methode1();
	    facade.methode2();
	}

}
