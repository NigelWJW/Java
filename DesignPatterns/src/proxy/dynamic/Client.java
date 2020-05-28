package proxy.dynamic;

/**
 * 动态代理类，代理对象不需要实现接口，目标对象需要实现接口，利用内存中构建代理对象。
 */
public class Client {
	public static void main(String[] args) {
		//创建目标对象
		ITeacherDao target = new TeacherDao();
		//给目标对象，返回代理对象, 可以转成 ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
		// proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
		System.out.println("proxyInstance=" + proxyInstance.getClass());
		//通过代理对象，调用目标对象的方法
		//proxyInstance.teach();
		proxyInstance.sayHello(" tom ");
	}
}
