package composite;

/**
 * 用户类，组合模式创建了类似树形模式表示整体和局部的关系，简化了客户端操作，客户端只用面对一致的对象而不是整体和部分
 * 也有较强的可扩展性，方便增加，建立和树形适合，但是要求较高的抽象性，差异较大就不适合
 * HashMap中使用了组合模式，其中Map作为Component，子类包括AbstractHashMap和HashMap是Composite，HashMap的
 * Node子类是叶子节点
 */
public class Client {
	public static void main(String[] args) {
		//从大到小创建对象 学校
		OrganizationComponent university = new University("清华大学", " 中国顶级大学 ");
		//创建 学院
		OrganizationComponent computerCollege = new College("计算机学院", " 计算机学院 ");
		OrganizationComponent infoEngineercollege = new College("信息工程学院", " 信息工程学院 ");
		//创建各个学院下面的系(专业)
		computerCollege.add(new Department("软件工程", " 软件工程不错 "));
		computerCollege.add(new Department("网络工程", " 网络工程不错 "));
		computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));
		//
		infoEngineercollege.add(new Department("通信工程", " 通信工程不好学 "));
		infoEngineercollege.add(new Department("信息工程", " 信息工程好学 "));
		//将学院加入到 学校
		university.add(computerCollege);
		university.add(infoEngineercollege);
		//university.print();
		infoEngineercollege.print();
	}
}
