package visitor;

/**
 * ConcreteElement�࣬����ʵ��accept����
 */
public class Man extends Person {
	@Override
	public void accept(Action action) {//Man�������Action����Action�������Man�����Լ�
		action.getManResult(this);
	}
}
