package proxy.dynamic;

/**
 * ��̬�����࣬���������Ҫʵ�ֽӿڣ�Ŀ�������Ҫʵ�ֽӿڣ������ڴ��й����������
 */
public class Client {
	public static void main(String[] args) {
		//����Ŀ�����
		ITeacherDao target = new TeacherDao();
		//��Ŀ����󣬷��ش������, ����ת�� ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
		// proxyInstance=class com.sun.proxy.$Proxy0 �ڴ��ж�̬�����˴������
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		//ͨ��������󣬵���Ŀ�����ķ���
		//proxyInstance.teach();
		proxyInstance.sayHello(" tom ");
	}
}
