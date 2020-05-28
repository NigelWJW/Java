package facade;

/**
 * 具体功能类，用饿汉式单例创建，然后包含各自的功能
 */
public class Screen {

	private static Screen instance = new Screen();

	public static Screen getInstance() {
		return instance;
	}

	public void up() {
		System.out.println(" Screen up ");
	}

	public void down() {
		System.out.println(" Screen down ");
	}


}
