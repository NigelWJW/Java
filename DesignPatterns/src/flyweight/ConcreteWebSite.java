package flyweight;

/**
 * 具体享元角色，网站类，包含了共享的内容，即较稳定内部状态
 */
public class ConcreteWebSite extends WebSite {
	//共享的部分，内部状态
	private String type = ""; //网站发布的形式(类型)

	//构造器
	public ConcreteWebSite(String type) {
		this.type = type;
	}

	@Override
	public void use(User user) {//不同的外部状态在这里体现
		System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
	}
}
