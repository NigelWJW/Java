package visitor;

/**
 * Element类，定义accept方法接收访问者对象
 */
public abstract class Person {
	//提供一个方法，让访问者可以访问
	public abstract void accept(Action action);
}
