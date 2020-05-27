package Adapter.objectadapter;

/**
 * ����������ģʽ��ʹ���������̳й�ϵ������˾����Ե����⣬����Ŀ����Ҳ��һ���ǽӿ���
 * �����
 * SpringMVC��HandleAdapterʹ������������Controller�˵�DispatchServlet��doDispatch����������
 * request��Model��ʹ��controller�ӿڻ�ȡHandleAdapter�ӿڣ�HandleAdapter���ݲ�ͬ��������
 * ƥ��SimpleHandleAdapter\HTTPHandleAdapter\AnnotationHandleAdapter���õ�controller
 * HTTPController��SimpleController��AnnotationController��󷵻ظ�View��
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(" === ����������ģʽ ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
