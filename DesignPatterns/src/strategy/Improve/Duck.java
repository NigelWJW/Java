package strategy.Improve;

/**
 * ����Ѽ����
 */
public abstract class Duck {
	//����, ���ԽӿھۺϽ�����һ������һ����
	FlyBehavior flyBehavior;
	//��������<->���Խӿ�
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public abstract void display();//��ʾѼ����Ϣ

	//��ͬ�Ĳ���
	public void quack() {
		System.out.println("Ѽ�Ӹ¸½�~~");
	}

	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}

	public void fly() {
		//�Ľ�
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
