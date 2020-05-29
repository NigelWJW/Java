package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * ����������ѧԺ�ӿڣ��б�������
 */
public class InfoColleageIterator implements Iterator {
	List<Department> departmentList; // ��Ϣ����ѧԺ����List��ʽ���ϵ
	int index = 0;//����

	public InfoColleageIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	//�ж�list�л���û����һ��Ԫ��
	@Override
	public boolean hasNext() {
		if (index >= departmentList.size()) {
			return false;
		} else {
			index += 1;
			return true;
		}
	}

	@Override
	public Object next() {
		return departmentList.get(index);
	}

	//��ʵ��remove
	public void remove() {
	}
}
