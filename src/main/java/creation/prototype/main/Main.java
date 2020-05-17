package creation.prototype.main;

import creation.prototype.Shape;
import creation.prototype.ShapeCache;

/*
 * 
 * Le Prototype est utile pour dupliquer des objets tout en conservant un niveau de performance
 * 
 */
public class Main {

	public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	
	}

}
