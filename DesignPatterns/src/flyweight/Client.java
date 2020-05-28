package flyweight;

/**
 * 调用类，享元模式减少了对象的创建降低了内存的占用提高效率，适用于系统有大量对象且大部分状态会外部化。唯一标识码的话用HashMap
 * 或者HashTable。但是提高了系统的复杂性，需要分离出内部状态和外部状态。最经典的就是缓冲池
 * 享元模式在Integer中体现在，在valueOf方法中判断值是否在IntegerCache中(-128-127)
 * 在就返回HashMap池中已经有的对象，没有就创建Integer(new)。
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个工厂类
		WebSiteFactory factory = new WebSiteFactory();
		// 客户要一个以新闻形式发布的网站
		WebSite webSite1 = factory.getWebSiteCategory("新闻");
		webSite1.use(new User("tom"));
		// 客户要一个以博客形式发布的网站
		WebSite webSite2 = factory.getWebSiteCategory("博客");
		webSite2.use(new User("jack"));
		// 客户要一个以博客形式发布的网站
		WebSite webSite3 = factory.getWebSiteCategory("博客");
		webSite3.use(new User("smith"));
		// 客户要一个以博客形式发布的网站
		WebSite webSite4 = factory.getWebSiteCategory("博客");
		webSite4.use(new User("king"));
		System.out.println("网站的分类共=" + factory.getWebSiteCount());
	}
}
