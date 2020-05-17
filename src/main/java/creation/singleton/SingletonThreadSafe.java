package creation.singleton;

public final class SingletonThreadSafe {

	/*
	 * Le plus simple et le plus s�r pour �viter ce probl�me est de s�curiser 
	 * l'acc�s au getter avec le mot cl� synchronized.
	 * 
	 * Cette solution est thread-safe mais elle induit un co�t en terme de performance, 
	 * li� � la synchronisation de la m�thode, qui peut devenir g�nant si la m�thode est appel�e 
	 * fr�quemment de fa�on concomitante.
	 * 
	 */
	  private static SingletonThreadSafe instance;

	  private SingletonThreadSafe() {
	    // traitement du constructeur
	  }

	  public static synchronized SingletonThreadSafe getlnstance() {
	    if (instance == null) {
	      instance = new SingletonThreadSafe();
	    }
	    return instance;
	  }

	  @Override
	  public Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException();
	  }
	}