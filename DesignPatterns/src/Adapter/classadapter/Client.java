package Adapter.classadapter;

/**
 * 类适配模式，适配器继承于被适配类，实现目标接口，但是有一定局限性，且在适配器暴露源方法
 * 增加成本，但是因为重写父类方法，灵活
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(" === 类适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
