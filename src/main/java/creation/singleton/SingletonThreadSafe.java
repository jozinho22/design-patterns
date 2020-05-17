package creation.singleton;

public final class SingletonThreadSafe {

	/*
	 * Le plus simple et le plus sûr pour éviter ce problème est de sécuriser 
	 * l'accès au getter avec le mot clé synchronized.
	 * 
	 * Cette solution est thread-safe mais elle induit un coût en terme de performance, 
	 * lié à la synchronisation de la méthode, qui peut devenir génant si la méthode est appelée 
	 * fréquemment de façon concomitante.
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