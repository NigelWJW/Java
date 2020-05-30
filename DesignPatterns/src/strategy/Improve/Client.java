package strategy.Improve;

/**
 * 调用类：策略模式关键是分析项目中的变化部分(重写父类方法)和不变部分(属性接口集合起来组合进抽象目标类)
 * 多用组合聚合少用继承，用行为类组合而不是行为行为继承，满足OCP，可能会导致数目庞大
 * 在JDK的Arrays中使用了策略模式。里面sort中的Comparator接口使用了策略接口，在里面的compare方法就是策略方法类似飞翔接口的飞方法
 */
public class Client {
	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//获取父类fly方法调用自己的飞行接口

		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();

		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("北京鸭的实际飞翔能力");
		pekingDuck.fly();
	}

}
