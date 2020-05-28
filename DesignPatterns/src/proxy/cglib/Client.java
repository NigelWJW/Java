package proxy.cglib;

/**
 * Cglib��̬�����࣬���������Ҫʵ�ֽӿڣ�Ŀ�������Ҫʵ�ֽӿ�
 * Ŀ���ǵ����Ķ������û��ʵ���κν�ڣ���ʹ��Ŀ�����������ʵ�ִ��������ֽ�����������ڴ��й���һ���������Ӷ�ʵ�ֶ�Ŀ�����
 * ���ܵ���չ��ԭ����ʹ�����������з������أ��ײ���ʹ���ֽ��봦����ASM��ת���ֽ��������µ��࣬���಻����final��
 */
public class Client {
	public static void main(String[] args) {
		//����Ŀ�����
		TeacherDao target = new TeacherDao();
		//��ȡ��������󣬲��ҽ�Ŀ����󴫵ݸ��������
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		//ִ�д������ķ���������intecept �������Ӷ�ʵ�� ��Ŀ�����ĵ���
		String res = proxyInstance.teach();
		System.out.println("res=" + res);
	}
}
