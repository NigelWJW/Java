package Bridge;

/**
 * 抽象类即桥梁，维护实现类，其实没做什么，只是调用具体实现类，二者是聚合关系
 */
public abstract class Phone {

	//组合品牌
	private Brand brand;//将实现类聚合进来

	//构造器
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();//调用手机品牌的具体方法
	}

	protected void close() {
		brand.close();
	}

	protected void call() {
		brand.call();
	}

}
