package Adapter.objectadapter;

/**
 * 对象适配器模式：使用组合替代继承关系，解决了局限性的问题，而且目标类也不一定是接口了
 * 更灵活
 * SpringMVC的HandleAdapter使用了适配器，Controller端的DispatchServlet的doDispatch方法接收了
 * request，Model端使用controller接口获取HandleAdapter接口，HandleAdapter根据不同的请求在
 * 匹配SimpleHandleAdapter\HTTPHandleAdapter\AnnotationHandleAdapter对用的controller
 * HTTPController、SimpleController、AnnotationController最后返回给View端
 */
public class Client {
	public static void main(String[] args) {
		System.out.println(" === 对象适配器模式 ====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
