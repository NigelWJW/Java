package Adapter.interfaceadapter;

/**
 * 接口适配器模式：不需要全部实现接口的方法，设计抽象类实现接口，空写方法。抽象类的子类
 * 可选择性实现父类方法，灵活
 * 安卓的属性动画添加监听器是用这种思想
 */
public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			//只需要去覆盖我们 需要使用 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};

		absAdapter.m1();
	}
}
