package Adapter.interfaceadapter;

/**
 * �ӿ�������ģʽ������Ҫȫ��ʵ�ֽӿڵķ�������Ƴ�����ʵ�ֽӿڣ���д�����������������
 * ��ѡ����ʵ�ָ��෽�������
 * ��׿�����Զ�����Ӽ�������������˼��
 */
public class Client {
	public static void main(String[] args) {

		AbsAdapter absAdapter = new AbsAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
			@Override
			public void m1() {
				System.out.println("ʹ����m1�ķ���");
			}
		};

		absAdapter.m1();
	}
}
