package visitor;

/**
 * Visitor��������࣬Ϊ�ö���ľ���Ԫ������һ��visit����
 */
public abstract class Action {
	//�õ����� �Ĳ���
	public abstract void getManResult(Man man);

	//�õ�Ů�� ����
	public abstract void getWomanResult(Woman woman);
}
