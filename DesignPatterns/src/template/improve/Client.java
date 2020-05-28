package template.improve;

/**
 * ģ��ģʽ�����㷨�ĹǼܣ�һЩ�����ӳٵ����࣬�����಻�ı�һ���㷨�Ľṹ���Ϳ������ض����㷨��ĳЩ����
 * �ڸ����ж���һ����������Ĭ�ϲ����£����࿴���������
 * ʵ������󻯴��븴�ã�ֻ�ǿ��ܵ�������������ࡣ
 * ��Spring��IOC������ʼ���У�ConfigurableApplicationContext����ǳ���ӿڣ�������AbstractApplicationContext����
 * ģ�巽���������getBeanFactory	\refreshBeanFactory�Ⱦ��ǳ��󷽷���onFresh���ǹ��ӷ���
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
		System.out.println("----����������----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
