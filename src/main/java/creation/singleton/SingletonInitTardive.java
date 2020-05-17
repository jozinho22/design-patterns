package creation.singleton;

public class SingletonInitTardive {
/*
	- Le ou les contructeurs ont un attribut de visibilité private pour 
	empêcher toute instanciation de l'extérieur de la classe : 
	ne pas oublier de redéfinir le constructeur par défaut si aucun constructeur 
	n'est explicitement défini
	- L'unique instance est une variable de classe
	- Un getter static permet de renvoyer l'instance et de la créer au besoin
	- Redefinir la méthode clone pour empêcher son utilisation
	- La classe est déclarée final pour empêcher la création d'une classe fille
		
*/


	/*
	 * - Le ou les contructeurs ont un attribut de visibilité private pour 
	 * empêcher toute instanciation de l'extérieur de la classe : 
	 * ne pas oublier de redéfinir le constructeur par défaut si aucun constructeur 
	 * n'est explicitement défini
	 * - L'unique instance est une variable de classe
	 * - Un getter static permet de renvoyer l'instance et de la créer au besoin
	 * - Redefinir la méthode clone pour empêcher son utilisation
	 * - La classe est déclarée final pour empêcher la création d'une classe fille
	 * 
	 * Cette implémentation est simple mais malheureusement, elle n'est pas threadsafe. 
	 * Dans un contexte multithreads, il est possible que les deux premiers appels concomitants 
	 * puissent créer deux instances. 
	 * Chaque thread reçoit alors une instance distincte ce qui ne répond pas aux contraintes du design pattern.
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
