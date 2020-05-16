package entities;

import java.util.Observable;

import service.Services;

@SuppressWarnings("deprecation")
public class Felin extends Observable implements Services {
	
	private int age;
	private String nom;
	private int poids;
	
	public Felin() {	
	}
	
	public Felin(int age, String nom, int poids) {
		super();
		this.age = age;
		this.nom = nom;
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
			setChanged();
			notifyObservers();
		}

	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}

	
	@Override
	public String toString() {
		return "Felin [age=" + age + ", nom=" + nom + ", poids=" + poids + "]";
	}

	@Override
	public String crier() {
		// TODO Auto-generated method stub
		return "un cri de félin";
	}
	
	public boolean isIdentique(Felin f) {
		return this.getAge() == f.getAge() 
				&& this.getNom() == f.getNom()
				&& this.getPoids() == f.getPoids();
	}
	

}
