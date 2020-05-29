package mediator;

import java.util.HashMap;

/**
 * ������н�����
 */
public class ConcreteMediator extends Mediator {
	//���ϣ��������е�ͬ�¶���
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {//��ʼ��
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	//ע��ͬ�·���
	@Override
	public void Register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);//����ͬ����-ͬ�¼���
		if (colleague instanceof Alarm) {//����ͬ��������-ͬ��������
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}
	}

	//�����н��ߵĺ��ķ���
	//1. ���ݵõ���Ϣ����ɶ�Ӧ����
	//2. �н��������������Э�����������ͬ�¶����������
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		//�������ӷ�������Ϣ
		if (colleagueMap.get(colleagueName) instanceof Alarm) {//�������͵ķ���Ϣ
			if (stateChange == 0) {//��ʶ��0������¿�ʼ�󿧷Ⱥʹ򿪵���
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();//�����������Ȼ�ȡͬ�������ٻ�ȡͬ��
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {//��ʶ��1�͹رյ���
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {//���Ȼ����ͷ���Ϣ
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();//������������
		} else if (colleagueMap.get(colleagueName) instanceof TV) {//���TV����Ϣ
			//����TV��Ϣ������
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {//��������Ϣ
			//������Դ�����������Ϣ�����ﴦ��...
		}
	}

	@Override
	public void SendMessage() {
	}
}
