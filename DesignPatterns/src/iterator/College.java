package iterator;

import java.util.Iterator;

/**
 * ������ѧԺ�ӿڣ�ͳһ�ľۺϽӿ�
 */
public interface College {
	public String getName();//����ϵ����

	//����ϵ�ķ���
	public void addDepartment(String name, String desc);

	//����һ��������,����
	public Iterator createIterator();
}
