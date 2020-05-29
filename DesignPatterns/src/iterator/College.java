package iterator;

import java.util.Iterator;

/**
 * 迭代器学院接口，统一的聚合接口
 */
public interface College {
	public String getName();//返回系名称

	//增加系的方法
	public void addDepartment(String name, String desc);

	//返回一个迭代器,遍历
	public Iterator createIterator();
}
