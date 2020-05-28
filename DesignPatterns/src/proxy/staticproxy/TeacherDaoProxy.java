package proxy.staticproxy;

/**
 * 代理类，重写接口方法，并将接口聚合进来
 */
//代理对象,静态代理
public class TeacherDaoProxy implements ITeacherDao {
	private ITeacherDao target; // 目标对象，通过接口来聚合

	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {//实现目标代码的方法，还可以自己加入其它方法
		System.out.println("开始代理  完成某些操作。。。。。 ");//方法
		target.teach();//调用目标对象方法
		System.out.println("提交。。。。。");//方法
	}
}
