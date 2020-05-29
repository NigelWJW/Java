package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 迭代器信软学院接口，列表方法迭代
 */
public class InfoColleageIterator implements Iterator {
	List<Department> departmentList; // 信息工程学院是以List方式存放系
	int index = 0;//索引

	public InfoColleageIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	//判断list中还有没有下一个元素
	@Override
	public boolean hasNext() {
		if (index >= departmentList.size()) {
			return false;
		} else {
			index += 1;
			return true;
		}
	}

	@Override
	public Object next() {
		return departmentList.get(index);
	}

	//空实现remove
	public void remove() {
	}
}
