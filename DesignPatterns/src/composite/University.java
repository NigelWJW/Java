package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite��ѧУ--��Ͽ��Բ����ӽڵ��Ҷ�ӣ������ܲ�����Ҷ�ӵ�ĳЩ����
 */
//University ���� Composite , ���Թ���College
public class University extends OrganizationComponent {
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	// ������
	public University(String name, String des) {
		super(name, des);
	}

	// ��дadd
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponents.add(organizationComponent);
	}

	// ��дremove
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponents.remove(organizationComponent);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	// print�������������University ������ѧԺ
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//���� organizationComponents 
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
