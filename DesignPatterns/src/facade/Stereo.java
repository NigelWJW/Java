package facade;

/**
 * 具体功能类，用饿汉式单例创建，然后包含各自的功能
 */
public class Stereo {

	private static Stereo instance = new Stereo();

	public static Stereo getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" Stereo on ");
	}

	public void off() {
		System.out.println(" Screen off ");
	}

	public void up() {
		System.out.println(" Screen up.. ");
	}

	//...
}
