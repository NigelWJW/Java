package flyweight;

import java.util.HashMap;

/**
 * 享元工厂类，构建一个池容器，同时从池中获取对象方法
 */
// 网站工厂类，根据需要返回压一个网站
public class WebSiteFactory {
	//集合， 充当池的作用
	private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

	//根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中,并返回；相同的
	//返回体现了共享类型
	public WebSite getWebSiteCategory(String type) {
		if (!pool.containsKey(type)) {//池中没有该类型就创建
			//就创建一个网站，并放入到池中
			pool.put(type, new ConcreteWebSite(type));
		}
		return (WebSite) pool.get(type);//返回对应网站
	}

	//获取网站分类的总数 (池中有多少个网站类型)
	public int getWebSiteCount() {
		return pool.size();
	}
}
