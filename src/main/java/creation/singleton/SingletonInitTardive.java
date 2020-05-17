package creation.singleton;

public class SingletonInitTardive {
/*
	- Le ou les contructeurs ont un attribut de visibilit� private pour 
	emp�cher toute instanciation de l'ext�rieur de la classe : 
	ne pas oublier de red�finir le constructeur par d�faut si aucun constructeur 
	n'est explicitement d�fini
	- L'unique instance est une variable de classe
	- Un getter static permet de renvoyer l'instance et de la cr�er au besoin
	- Redefinir la m�thode clone pour emp�cher son utilisation
	- La classe est d�clar�e final pour emp�cher la cr�ation d'une classe fille
		
*/


	/*
	 * - Le ou les contructeurs ont un attribut de visibilit� private pour 
	 * emp�cher toute instanciation de l'ext�rieur de la classe : 
	 * ne pas oublier de red�finir le constructeur par d�faut si aucun constructeur 
	 * n'est explicitement d�fini
	 * - L'unique instance est une variable de classe
	 * - Un getter static permet de renvoyer l'instance et de la cr�er au besoin
	 * - Redefinir la m�thode clone pour emp�cher son utilisation
	 * - La classe est d�clar�e final pour emp�cher la cr�ation d'une classe fille
	 * 
	 * Cette impl�mentation est simple mais malheureusement, elle n'est pas threadsafe. 
	 * Dans un contexte multithreads, il est possible que les deux premiers appels concomitants 
	 * puissent cr�er deux instances. 
	 * Chaque thread re�oit alors une instance distincte ce qui ne r�pond pas aux contraintes du design pattern.
	 * 
	 */
	 private static SingletonInitTardive instance;
	 
		private SingletonInitTardive() {
			// traitement du constructeur
		}

		public static SingletonInitTardive getInstance() {
			if (instance == null) {
				instance = new SingletonInitTardive();
			}
			return instance;
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
		}
}
