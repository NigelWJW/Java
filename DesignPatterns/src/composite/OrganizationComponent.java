package composite;

/**
 * 组织类，对应Component类，为所有对象定义，不管是节点还是叶子
 */
public abstract class OrganizationComponent {

	private String name; // 名字
	private String des; // 说明

	//构造器
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	protected void add(OrganizationComponent organizationComponent) {
		//默认实现
		throw new UnsupportedOperationException();//抛给下级，这里不用抽象类的原因是若抽象则叶子节点也需要实现该方法，但是叶子节点不需要
	}

	protected void remove(OrganizationComponent organizationComponent) {
		//默认实现
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

	//方法print, 做成抽象的, 子类都需要实现
	protected abstract void print();


}
