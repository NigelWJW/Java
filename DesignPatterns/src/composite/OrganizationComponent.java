package composite;

/**
 * ��֯�࣬��ӦComponent�࣬Ϊ���ж����壬�����ǽڵ㻹��Ҷ��
 */
public abstract class OrganizationComponent {

	private String name; // ����
	private String des; // ˵��

	//������
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	protected void add(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException();//�׸��¼������ﲻ�ó������ԭ������������Ҷ�ӽڵ�Ҳ��Ҫʵ�ָ÷���������Ҷ�ӽڵ㲻��Ҫ
	}

	protected void remove(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ��
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	//����print, ���ɳ����, ���඼��Ҫʵ��
	protected abstract void print();


}
