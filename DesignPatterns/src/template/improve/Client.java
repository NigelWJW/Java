package template.improve;

/**
 * 模板模式定义算法的骨架，一些不走延迟到子类，让子类不改变一个算法的结构，就可以了重定义算法的某些步骤
 * 在父类中定义一个方法，他默认不做事，子类看情况复用他
 * 实现了最大化代码复用，只是可能导致子类个数过多。
 * 在Spring的IOC容器初始化中，ConfigurableApplicationContext类就是抽象接口，他子类AbstractApplicationContext就是
 * 模板方法，里面的getBeanFactory	\refreshBeanFactory等就是抽象方法，onFresh就是钩子方法
 */
public class Client {
	public static void main(String[] args) {
		//制作红豆豆浆
		System.out.println("----制作红豆豆浆----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		System.out.println("----制作花生豆浆----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		System.out.println("----制作纯豆浆----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
