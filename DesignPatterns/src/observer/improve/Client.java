package observer.improve;

/**
 * 观察者模式：对象之间多对一依赖，会以集合的方式管理用户，增加观察者方便，客户端不用变化
 * 在Observable类：Observable类作用就是subject类但是集合了接口和类，实现了核心的方法。
 */
public class Client {
	public static void main(String[] args) {
		//创建一个WeatherData
		WeatherData weatherData = new WeatherData();

		//创建两个观察者
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();

		//将两个观察者注册到weatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);

		//测试
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(10f, 100f, 30.3f);


		weatherData.removeObserver(currentConditions);
		//测试
		System.out.println();
		System.out.println("通知各个注册的观察者, 看看信息");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
