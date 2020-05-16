package utils;

public enum Felins {
	
	CHAT("Chat"), TIGRE("Tigre");

	private String type;

	public String getType() {
		return type;
	}
	
	private Felins(String type) {
		this.type = type;
	}
	

}
