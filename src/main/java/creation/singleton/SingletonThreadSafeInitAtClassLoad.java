package creation.singleton;

public class SingletonThreadSafeInitAtClassLoad {

	/*
	 * Cette implémentation qui exploite une spécificité de Java est simple, rapide et sûre.
	 * 
	 */
	  private static SingletonThreadSafeInitAtClassLoad instance = new SingletonThreadSafeInitAtClassLoad();

	  public static SingletonThreadSafeInitAtClassLoad getlnstance() {
	    return instance;
	  }

	  private SingletonThreadSafeInitAtClassLoad() {
	  }
}
