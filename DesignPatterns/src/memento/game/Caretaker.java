package memento.game;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * �ػ��߼�����-����¼��
 */
//�ػ��߶���, ������Ϸ��ɫ��״̬
public class Caretaker {
	//���ֻ����һ��״̬
	private Memento memento;
	//��GameRole �����α�����״̬�����������ͷ�����
	private ArrayList<Memento> mementos;
	//�Զ����Ϸ��ɫ������״̬
	private HashMap<String, ArrayList<Memento>> rolesMementos;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
