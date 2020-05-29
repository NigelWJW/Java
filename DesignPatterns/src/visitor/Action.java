package visitor;

/**
 * Visitor抽象访问类，为该对象的具体元素声明一个visit操作
 */
public abstract class Action {
	//得到男性 的测评
	public abstract void getManResult(Man man);

	//得到女的 测评
	public abstract void getWomanResult(Woman woman);
}
