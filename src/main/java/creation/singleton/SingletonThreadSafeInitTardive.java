package creation.singleton;

public class SingletonThreadSafeInitTardive {
	
	/*
	 *  L'utilisation d'une classe interne statique permet une initialisation tardive garantie 
	 *  par les spécifications de la JVM.  
	 * 
	 */
	  private SingletonThreadSafeInitTardive() {
	  }

	  private static class SingletonThreadSafeInitTardiveWrapper {
	    private final static SingletonThreadSafeInitTardive instance = new SingletonThreadSafeInitTardive();
	  }

	  public static SingletonThreadSafeInitTardive getInstance() {
	    return SingletonThreadSafeInitTardiveWrapper.instance;
	  }

}
