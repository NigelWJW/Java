package flyweight;

/**
 * �����࣬��Ԫģʽ�����˶���Ĵ����������ڴ��ռ�����Ч�ʣ�������ϵͳ�д��������Ҵ󲿷�״̬���ⲿ����Ψһ��ʶ��Ļ���HashMap
 * ����HashTable�����������ϵͳ�ĸ����ԣ���Ҫ������ڲ�״̬���ⲿ״̬�����ľ��ǻ����
 * ��Ԫģʽ��Integer�������ڣ���valueOf�������ж�ֵ�Ƿ���IntegerCache��(-128-127)
 * �ھͷ���HashMap�����Ѿ��еĶ���û�оʹ���Integer(new)��
 */
public class Client {
	public static void main(String[] args) {
		// ����һ��������
		WebSiteFactory factory = new WebSiteFactory();
		// �ͻ�Ҫһ����������ʽ��������վ
		WebSite webSite1 = factory.getWebSiteCategory("����");
		webSite1.use(new User("tom"));
		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite2 = factory.getWebSiteCategory("����");
		webSite2.use(new User("jack"));
		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite3 = factory.getWebSiteCategory("����");
		webSite3.use(new User("smith"));
		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite4 = factory.getWebSiteCategory("����");
		webSite4.use(new User("king"));
		System.out.println("��վ�ķ��๲=" + factory.getWebSiteCount());
	}
}
