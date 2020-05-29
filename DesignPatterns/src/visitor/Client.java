package visitor;

/**
 * 调用类。访问者模式：封装一些作用于某种数据结构的各元素操作，他可以在不改变数据结构的前提下定义作用于这些元素的
 * 新的操作，将数据结构和数据操作分离，即在被访问的类里面加一个对外提供接待访问者的接口，访问者根据被访问类会有对应的
 * 方法。主要应用场景是对一个对象结构的对象进行不同毫无相关的操作，同时不免相互污染。优点是符合单一职责，扩展性好
 * 对功能进行统一，可以做报表等相对稳定的系统。但是具体元素对访问者公布细节，违反迪米特，违背依赖倒转，没有依赖抽象元素
 * 如果系统有比较稳定的数据结构又有经常变化的功能需求，就适合访问者模式
 */
public class Client {
	public static void main(String[] args) {
		//创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		//成功
		Success success = new Success();
		objectStructure.display(success);

		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);

		System.out.println("=======给的是待定的测评========");

		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
