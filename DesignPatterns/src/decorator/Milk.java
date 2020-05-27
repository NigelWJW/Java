package decorator;

/**
 * 不同的调料类，包含描述和价钱
 */
public class Milk extends Decorator {
	public Milk(Drink obj) {
		super(obj);
		setDes(" 牛奶 ");
		setPrice(2.0f);
	}

}
