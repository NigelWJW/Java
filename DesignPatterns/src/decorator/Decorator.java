package decorator;

/**
 * 调料装饰父类
 */
public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) { //组合饮品类，获取不同饮品的属性
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice 是调料自己价格加上obj饮品的价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息加上obj饮品的描述
		return des + " " + getPrice() + " && " + obj.getDes();
	}
}
