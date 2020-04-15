import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * HsahMap测试类
 */
public class HashMapTest {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put(new A(50)," A level");
        hm.put(new A(60)," B level");
        hm.put(new A(-70)," C level");
        Iterator it = hm.keySet().iterator();//使用迭代器
        A f = (A)it.next();
        f.count = 100;
        System.out.println(hm);
        hm.remove(100);//只能删除没有修改过的key
        System.out.println(hm);
        System.out.println(hm.get(100));//无法获取value都输出null。所以尽量不要使用可变对象作为key
        System.out.println(hm.get(50));
        LinkedHashMap lhm = new LinkedHashMap();//双向链表HashMap顺序同插入顺序
        lhm.put("chinese",80);
        lhm.put("english",90);
        lhm.put("math",100);
        lhm.forEach((key, value) -> System.out.println(key + " -> " +value));//lambda遍历
    }
}
