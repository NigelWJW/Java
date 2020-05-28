package composite;

/**
 * Leaf��ϵ--Ҷ��û�к��ӣ����ܲ�������
 */
public class Department extends OrganizationComponent {
	//û�м���
	public Department(String name, String des) {
		super(name, des);
	}

	//add , remove �Ͳ���д�ˣ���Ϊ����Ҷ�ӽڵ�
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDes() {
		return super.getDes();
	}

	@Override
	protected void print() {
		System.out.println(getName());
	}

}
