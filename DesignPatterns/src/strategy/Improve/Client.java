package strategy.Improve;

/**
 * �����ࣺ����ģʽ�ؼ��Ƿ�����Ŀ�еı仯����(��д���෽��)�Ͳ��䲿��(���Խӿڼ���������Ͻ�����Ŀ����)
 * ������Ͼۺ����ü̳У�����Ϊ����϶�������Ϊ��Ϊ�̳У�����OCP�����ܻᵼ����Ŀ�Ӵ�
 * ��JDK��Arrays��ʹ���˲���ģʽ������sort�е�Comparator�ӿ�ʹ���˲��Խӿڣ��������compare�������ǲ��Է������Ʒ���ӿڵķɷ���
 */
public class Client {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//��ȡ����fly���������Լ��ķ��нӿ�

		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();

		//��̬�ı�ĳ���������Ϊ, ����Ѽ ���ܷ�
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("����Ѽ��ʵ�ʷ�������");
		pekingDuck.fly();
	}

}
