import java.util.TreeSet;
/**
 * 实现TreeSet类
 */
class T implements Comparable{
    int count;
    public T(int count){
        this.count = count;
    }
    @Override
    public String toString(){
        return "T[count:" + count + "]";
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == T.class){
            T t = (T) obj;
            return t.count == this.count;
        }
        return false;
    }

    @Override//重写比较方法
    public int compareTo(Object obj) {
        T t = (T)obj;
        return count > t.count ? 1: count < t.count ? -1 : 0;//等同Integer.compare(count, t.count);
    }
}

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();//自然排序
        T t1 = new T(5);//添加元素
        ts.add(t1);
        T t2 = new T(-3);
        ts.add(t2);
        T t3 = new T(9);
        ts.add(t3);
        T t4 = new T(-2);
        ts.add(t4);
        System.out.println(ts);//TreeSet顺序是按红黑树值来排序
        T first = (T)ts.first();
        first.count = 20;
        T last = (T)ts.last();
        last.count = -2;
        System.out.println(ts);//TreeSet顺序是按红黑树值来排序
        System.out.println(ts.remove(t4));//删除实例变量被改变的元素出错
        System.out.println(ts);
        System.out.println(ts.remove(t1));//删除实例变量未被改变的元素正确
        System.out.println(ts);

        TreeSet ts1 = new TreeSet((o1,o2) ->{//定制排序使用lambda表达式实现comparator
            T t5 = (T)o1;
            T t6 = (T)o2;
            return t5.count > t6.count ? -1 : t5.count < t6.count ? 1 : 0; });
        T t11 = new T(5);//添加元素
        ts1.add(t11);
        T t21 = new T(-3);
        ts1.add(t21);
        T t31 = new T(9);
        ts1.add(t31);
        T t41 = new T(-2);
        ts1.add(t41);
        System.out.println(ts1);


    }
}
