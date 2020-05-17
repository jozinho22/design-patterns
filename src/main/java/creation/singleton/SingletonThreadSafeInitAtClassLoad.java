package creation.singleton;

public class SingletonThreadSafeInitAtClassLoad {

	/*
	 * Cette impl�mentation qui exploite une sp�cificit� de Java est simple, rapide et s�re.
	 * 
	 */
	  private static SingletonThreadSafeInitAtClassLoad instance = new SingletonThreadSafeInitAtClassLoad();

	  public static SingletonThreadSafeInitAtClassLoad getlnstance() {
	    return instance;
	  }

	  private SingletonThreadSafeInitAtClassLoad() {
	  }
}
