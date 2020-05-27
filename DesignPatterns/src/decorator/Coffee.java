package decorator;

/**
 * 作为主体类和具体主类的中间隔离层
 */
public class Coffee extends Drink {
	@Override
	public float cost() {
		return super.getPrice();
	}
}
