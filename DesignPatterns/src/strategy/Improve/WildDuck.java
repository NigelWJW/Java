package strategy.Improve;

/**
 * ҰѼ�ӿ�
 */
public class WildDuck extends Duck {
	//������������FlyBehavor �Ķ���
	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println(" ����ҰѼ ");
	}
}
