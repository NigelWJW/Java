package decorator;

/**
 * 不同的调料类，包含描述和价钱
 */
public class Soy extends Decorator {
	public Soy(Drink obj) {
		super(obj);//继承饮品的属性
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
