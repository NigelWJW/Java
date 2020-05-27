package decorator;

/**
 * 饮品店类，动态将新功能附加到对象上，体现了OCP，即将装饰包裹在主体外面，即组合进去
 * 在IO结构中，InputStream是抽象主体父类,下面的子类包括FileInputStream\StringBufferInputStream\
 * ByteArrayInputStream都是类似coffee的具体主体类，FilterInputStream就类似装饰父类，下面有
 * BufferInputStream\DataInputStream\LineNumberInputStream就是具体的装饰类
 */
public class CoffeeBar {
	public static void main(String[] args) {
		// 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
		// 1. 点一份 LongBlack
		Drink order = new LongBlack();
		System.out.println("费用1=" + order.cost());
		System.out.println("描述=" + order.getDes());
		// 2. order 加入一份牛奶
		order = new Milk(order);
		System.out.println("order 加入一份牛奶 费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 描述 = " + order.getDes());
		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());
		// 3. order 加入一份巧克力
		order = new Chocolate(order);
		System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
		System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());
		System.out.println("===========================");
		Drink order2 = new DeCaf();
		System.out.println("order2 无因咖啡  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 描述 = " + order2.getDes());
		order2 = new Milk(order2);
		System.out.println("order2 无因咖啡 加入一份牛奶  费用 =" + order2.cost());
		System.out.println("order2 无因咖啡 加入一份牛奶 描述 = " + order2.getDes());
	}
}
