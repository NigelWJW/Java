package mediator;

/**
 * �н������
 */
public abstract class Mediator {
	//�����н��߶��󣬼��뵽������
	public abstract void Register(String colleagueName, Colleague colleague);

	//������Ϣ, �����ͬ�¶�����ã�������
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();//��ʱδ��
}
