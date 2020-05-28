package facade;

/**
 * 具体功能类，用饿汉式单例创建，然后包含各自的功能
 */
public class Projector {

	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" Projector on ");
	}

	public void off() {
		System.out.println(" Projector ff ");
	}

	public void focus() {
		System.out.println(" Projector is Projector  ");
	}

	//...
}
