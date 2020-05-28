package proxy.cglib;

/**
 * Cglib动态代理类，代理对象不需要实现接口，目标对象需要实现接口
 * 目标是单独的对象或者没有实现任何借口，就使用目标对象子类来实现代理，所以又叫子类代理，在内存中构建一个子类对象从而实现对目标对象
 * 功能的扩展，原理是使用拦截器进行方法拦截，底层是使用字节码处理框架ASM来转换字节码生成新的类，子类不能是final型
 */
public class Client {
	public static void main(String[] args) {
		//创建目标对象
		TeacherDao target = new TeacherDao();
		//获取到代理对象，并且将目标对象传递给代理对象
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		//执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
		String res = proxyInstance.teach();
		System.out.println("res=" + res);
	}
}
