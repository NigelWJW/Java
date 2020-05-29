package mediator;

/**
 * �н���ģʽ����һ���н�����װһϵ�ж��󽻻����Ӷ������ɢ��MVC��C�����м��ˣ��������״���н��߸ĳ����ͽ�����������������
 * �������ң��������㡣�����м���е��˽϶����Σ����ܳ���
 */
public class Client {
	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();

		//����Alarm ���Ҽ��뵽ConcreteMediator �����HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		//������CoffeeMachine���󣬲��Ҽ��뵽ConcreteMediator �����HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//���� Curtains,���Ҽ��뵽ConcreteMediator �����HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		//����TV,���Ҽ��뵽ConcreteMediator �����HashMap
		TV tV = new TV(mediator, "TV");

		//�����ӷ�����Ϣ
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}
}
