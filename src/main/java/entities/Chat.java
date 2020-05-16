package entities;

public class Chat extends Felin {

	private String maitre;
	
	public Chat(int age, String nom, int poids, String maitre) {
		super(age, nom, poids);
		this.maitre = maitre;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String crier() {
		return "Miaou";
	}

	public String getMaitre() {
		return maitre;
	}

	public void setMaitre(String maitre) {
		this.maitre = maitre;
	}
	
	public boolean isIdentique(Chat c) {
		return super.isIdentique(c) && this.maitre == c.maitre;
	}

}
