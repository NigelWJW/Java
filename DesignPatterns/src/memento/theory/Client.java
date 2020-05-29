package memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ��ͳ����¼ģʽ
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState(" ״̬#1 ������ 100 ");
		//�����˵�ǰ��״̬�ڼ�����
		caretaker.add(originator.saveStateMemento());

		originator.setState(" ״̬#2 ������ 80 ");
		caretaker.add(originator.saveStateMemento());

		originator.setState(" ״̬#3 ������ 50 ");
		caretaker.add(originator.saveStateMemento());

		System.out.println("��ǰ��״̬�� =" + originator.getState());
		//ϣ���õ�״̬ 1, �� originator �ָ���״̬1
		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("�ָ���״̬1 , ��ǰ��״̬��");
		System.out.println("��ǰ��״̬�� =" + originator.getState());
	}
}
