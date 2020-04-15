package SetMap;
import java.util.TreeMap;
/**
 * 实现TreeMap类,其实就是红黑树，所以key必须实现Comparable接口而且必须是同一对象
 */
class C implements Comparable{
    int count;
    public C(int count){
        this.count = count;
    }
    @Override
    public String toString(){
        return "C[count:" + count + "]";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == C.class){
            C c = (C) obj;
            return c.count == this.count;
        }
        return false;
    }
    @Override//重写比较方法
    public int compareTo(Object obj) {
        C c = (C)obj;
        return count > c.count ? 1: count < c.count ? -1 : 0;//等同Integer.compare(count, t.count);
    }
}
public class TreeMapTest {
    public static void main(String[] args){
        TreeMap tm = new TreeMap();//自然排序
        tm.put(new C(3)," A class");
        tm.put(new C(7)," B class");
        tm.put(new C(-3)," C class");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastKey());
        System.out.println(tm.higherKey(new C(2)));

        TreeMap tm2 = new TreeMap((o1,o2)->{//定制排序
            C c1 = (C)o1;
            C c2 = (C)o2;
            return c1.count>c2.count?1:c1.count<c2.count?-1:0;
        });
        tm2.put(new C(6)," D class");
        tm2.put(new C(9)," E class");
        tm2.put(new C(-10)," F class");
        System.out.println(tm2.containsValue(" E class"));
        System.out.println(tm2);
        C test = new C(100);
        C test1 = new C(100);
        System.out.println(test.compareTo(test1));
    }
}
