package entities;

import service.Services;

public class Tigre extends Felin implements Services {

	private String zoo;
	
	public Tigre(int age, String nom, int poids, String zoo) {
		super(age, nom, poids);
		this.zoo = zoo;
		// TODO Auto-generated constructor stub
	}

	public String getZoo() {
		return zoo;
	}

	public void setZoo(String zoo) {
		this.zoo = zoo;
	}

	@Override
	public String crier() {
		return "Grrrr";
		
	}
	
}
