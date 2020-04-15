package SetMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Properties;
/**
 * HsahMap测试类
 */
public class HashMapTest {
    public static void main(String[] args) throws IOException {
        HashMap hm = new HashMap();
        hm.put(new A(50)," SetMap.A level");
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


        Properties p = new Properties();//Properties是hashmap的子类，主要处理属性文件，相当于一个key和value都是string的map
        p.setProperty("username","wu");
        p.setProperty("passport","12345678");
        p.store(new FileOutputStream("a.ini"),"comment");
        Properties p2 = new Properties();
        p2.setProperty("gender","25");
        p2.load(new FileInputStream("a.ini"));
        System.out.println(p2);
    }
}
