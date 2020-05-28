package template.Trandition;

/**
 * 模板模式定义算法的骨架，一些不走延迟到子类，让子类不改变一个算法的结构，就可以了重定义算法的某些步骤
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
	}

}
