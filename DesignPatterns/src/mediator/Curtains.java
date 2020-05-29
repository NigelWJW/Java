package mediator;

/**
 * �����ͬ����-������
 */
public class Curtains extends Colleague {
	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	//�Լ��ķ���
	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}
}
