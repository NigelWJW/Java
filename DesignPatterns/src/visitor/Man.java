package visitor;

/**
 * ConcreteElement类，具体实现accept方法
 */
public class Man extends Person {
	@Override
	public void accept(Action action) {//Man对象调用Action对象，Action对象调用Man对象自己
		action.getManResult(this);
	}
}
