package flyweight;

import java.util.HashMap;

/**
 * ��Ԫ�����࣬����һ����������ͬʱ�ӳ��л�ȡ���󷽷�
 */
// ��վ�����࣬������Ҫ����ѹһ����վ
public class WebSiteFactory {
	//���ϣ� �䵱�ص�����
	private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

	//������վ�����ͣ�����һ����վ, ���û�оʹ���һ����վ�������뵽����,�����أ���ͬ��
	//���������˹�������
	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {//����û�и����;ʹ���
			//�ʹ���һ����վ�������뵽����
			pool.put(type, new ConcreteWebSite(type));
		}
		return (WebSite) pool.get(type);//���ض�Ӧ��վ
	}

	//��ȡ��վ��������� (�����ж��ٸ���վ����)
	public int getWebSiteCount() {
		return pool.size();
	}
}
