package facade;

/**
 * 具体功能类，用饿汉式单例创建，然后包含各自的功能
 */
public class Popcorn {

	private static Popcorn instance = new Popcorn();

	public static Popcorn getInstance() {
		return instance;
	}

	public void on() {
		System.out.println(" popcorn on ");
	}

	public void off() {
		System.out.println(" popcorn ff ");
	}

	public void pop() {
		System.out.println(" popcorn is poping  ");
	}
}
