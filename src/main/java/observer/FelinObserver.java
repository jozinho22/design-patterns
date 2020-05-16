package observer;

import java.util.Observable;
import java.util.Observer;

import entities.Felin;

@SuppressWarnings("deprecation")
public class FelinObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof Felin) {
			System.out.println("Observer : voici le nouvel age");
			System.out.println(((Felin) o).getAge());
		}
	}

}
