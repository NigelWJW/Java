package strategy.Improve;

/**
 * ���Ѽ�ӿ�
 */
public class ToyDuck extends Duck {
	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println("���Ѽ");
	}
	//��Ҫ��д��������з���

	public void quack() {
		System.out.println("���Ѽ���ܽ�~~");
	}

	public void swim() {
		System.out.println("���Ѽ������Ӿ~~");
	}


}
