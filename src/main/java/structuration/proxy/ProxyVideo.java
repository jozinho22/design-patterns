package structuration.proxy;

public class ProxyVideo implements Video {

	private RealVideo realVideo;
	private String name;

	public ProxyVideo(String name) {
		this.name = name;
	}

	public void play() {
		if (realVideo == null) {
			realVideo = new RealVideo(name);
		}
		realVideo.play();
	}
}
