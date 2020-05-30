package strategy.Improve;

/**
 * 具体飞翔接口
 */
public class BadFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println(" 飞翔技术一般 ");
	}
}
