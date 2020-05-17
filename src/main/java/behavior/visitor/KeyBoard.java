package behavior.visitor;

public class KeyBoard implements ComputerPart {
	   
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
}
