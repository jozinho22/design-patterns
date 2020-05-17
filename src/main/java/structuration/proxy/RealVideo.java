package structuration.proxy;

public class RealVideo implements Video {

	private String name;

	public RealVideo(String name) {
		super();
		this.name = name;
	    loadFromDisk(name);
	}

	private void loadFromDisk(String name) {
		System.out.println("Loading " + name);
	}

	public void play() {
		System.out.println("Playing music : " + name);
	}
}
