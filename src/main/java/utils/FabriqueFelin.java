package utils;

import entities.Chat;
import entities.Felin;
import entities.Tigre;

public class FabriqueFelin {
	
	public static Felin getFelin(String type, int age, String name, int poids, String responsable) {
		if(Felins.CHAT.getType().equals(type)) {
			return new Chat(age, name, poids, responsable);
		}
		if(Felins.TIGRE.getType().equals(type)) {
			return new Tigre(age, name, poids, responsable);
		}
		else
			return null;
	}

}
