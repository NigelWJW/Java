package mediator;

/**
 * �����ͬ����-TV��
 */
public class TV extends Colleague {
	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {//�����н��ߵķ��������Լ�
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	//�Լ��ķ���
	public void StartTv() {
		System.out.println("It's time to StartTv!");
	}

	public void StopTv() {
		System.out.println("StopTv!");
	}
}
