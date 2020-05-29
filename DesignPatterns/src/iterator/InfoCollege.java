package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����ѧԺ���ۺϽӿ�
 */
public class InfoCollege implements College {
	List<Department> departmentList;

	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("��Ϣ��ȫרҵ", " ��Ϣ��ȫרҵ ");
		addDepartment("���簲ȫרҵ", " ���簲ȫרҵ ");
		addDepartment("��������ȫרҵ", " ��������ȫרҵ ");
	}

	@Override
	public String getName() {
		return "��Ϣ����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		return new InfoColleageIterator(departmentList);
	}
}
