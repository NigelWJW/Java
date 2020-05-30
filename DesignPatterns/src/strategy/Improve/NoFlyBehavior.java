package strategy.Improve;

/**
 * 具体飞翔接口
 */
public class NoFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" 不会飞翔  ");
	}

}
