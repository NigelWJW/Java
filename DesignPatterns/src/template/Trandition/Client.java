package template.Trandition;

/**
 * ģ��ģʽ�����㷨�ĹǼܣ�һЩ�����ӳٵ����࣬�����಻�ı�һ���㷨�Ľṹ���Ϳ������ض����㷨��ĳЩ����
 */
public class Client {
	public static void main(String[] args) {
		//�����춹����
		System.out.println("----�����춹����----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		System.out.println("----������������----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
	}

}
