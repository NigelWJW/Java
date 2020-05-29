package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用类，迭代器迷失提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层；
 * 提供统一方法遍历对象不用考虑聚合类型，使用一种方法就可以遍历对象。隐藏了聚合的内部结构，把
 * 管理对象集合和遍历对象集合的责任分开。但是每个聚合对象要一个迭代器，可以会很对不好管理
 * 在ArrayList中使用了。内部类Itr实现迭代器的类最为ArrayList的内部类，List就是聚合接口含有迭代方法，返回了迭代器对象
 * Object类类似学院类Department类，而Itr和EnumIterator是对应的迭代器，LinkedList和ArrayList是具体聚合类
 */
public class Client {
	public static void main(String[] args) {
		//创建学院
		List<College> collegeList = new ArrayList<College>();

		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();

		collegeList.add(computerCollege);
		collegeList.add(infoCollege);

		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}
}
