package mediator;

/**
 * �����ͬ����-������
 */
public class Alarm extends Colleague {
	//������
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//�ڴ���Alarm ͬ�¶���ʱ�����Լ����뵽ConcreteMediator ������[����]
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		//���õ��н��߶����getMessage
		this.GetMediator().GetMessage(stateChange, this.name);//�����н��ߵ���Ϣ��ȡ��ʶ
	}

	//�Լ��ķ���
	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);//���ͱ�ʶ
	}
}
