package strategy.Trandition;

/**
 * Ѽ�ӳ�����
 */
public abstract class Duck {
	public Duck() {
	}

	public abstract void display();//��ʾѼ����Ϣ

	public void quack() {
		System.out.println("Ѽ�Ӹ¸½�~~");
	}//����ѡ����д

	public void swim() {
		System.out.println("Ѽ�ӻ���Ӿ~~");
	}

	public void fly() {
		System.out.println("Ѽ�ӻ����~~~");
	}
}
