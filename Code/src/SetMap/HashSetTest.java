package SetMap;

import java.util.*;
/**
 * HashSet集合类
 */
class R{
    int count;
    public R(int count){
        this.count = count;
    }
//重写相关函数
    @Override
    public String toString() {
        return "SetMap.R{" +
                "count=" + count +
                '}';
    }
//HashSet需要同时验证equal和hashcode值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null && o.getClass() != R.class) {
            R r = (R) o;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
public class HashSetTest {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        R r1 = new R(5);
        hs.add(r1);
        R r2 = new R(-3);
        hs.add(r2);
        R r3 = new R(9);
        hs.add(r3);
        R r4 = new R(-2);
        hs.add(r4);
        System.out.println(hs);//HashSet顺序是按hashcoding值来排序
        Iterator it = hs.iterator();//使用迭代器取第一个数
        R first = (R) it.next();
        first.count = -3;
        System.out.println(hs);
        hs.remove(r2);//删除-3，会进行比较，然后删除的是第二个-3，但第一个原-2的位置已经修改为-3，会导致集合容易出错，所以建议不要轻易修改
        System.out.println(hs);
        System.out.println(hs.contains(r2));
        LinkedHashSet linkedHashSet = new LinkedHashSet();//定义LinkedHashSet类，是其子类。用链表维护顺序这样添加顺序就是元素顺序，但性能略低
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("4");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("3");
        System.out.println(linkedHashSet);
        linkedHashSet.add("6");
        System.out.println(linkedHashSet);


    }
}
