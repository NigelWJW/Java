package flyweight;

/**
 * 不可共享角色，不会出现在享元工厂，但在具体的享元角色里有体现
 */
public class User {
	private String name;//不同用户名

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
