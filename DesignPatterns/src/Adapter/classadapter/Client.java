package Adapter.classadapter;

/**
 * ������ģʽ���������̳��ڱ������࣬ʵ��Ŀ��ӿڣ�������һ�������ԣ�������������¶Դ����
 * ���ӳɱ���������Ϊ��д���෽�������
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(" === ��������ģʽ ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
