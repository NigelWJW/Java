package Base;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 匿名内部类及Lambda表达式的使用
 */
interface A{//定义一个接口
    public void getNum();//抽象方法
}
interface C{
    public void getData(int e);
}
class B implements A{//匿名内部类的等价形式
    public void getNum() {
        System.out.println("A 实现");
    }
}
class D implements C{//匿名内部类的等价形式
    public void getData(int e) {
        System.out.println("C 实现");
    }
}
public class Anonymous {
    public void test1(A a){
        System.out.println("interface A 的getNum是：  ");
        a.getNum();
    }
    public void test2(C c){
        System.out.println("interface C 的getData是：  " );
        c.getData(10);
    }
    public static void main(String[] args){
        Anonymous an = new Anonymous();
        an.test1(new A() {//匿名内部类实现
            public void getNum() {
                System.out.println("A 实现");
            }
        });
        an.test2(new C() {//匿名内部类实现
            public void getData(int e) {
                System.out.println("C 实现");
            }
        });
        an.test1(()->{//Lambda表达式，形参表为空，代码体中直接写方法体
            System.out.println("A 实现");
                });
        an.test2(c->{//Lambda表达式
            System.out.println("C 实现");
        });
        Runnable r = ()->{
            for(int i = 0;i<10;i++){
                System.out.println(i+" ");
            }
        };

        HashSet hs = new HashSet();//创建一个集合
        hs.add("books");
        hs.add("fish");
        hs.add("table");
        hs.forEach(obj->System.out.println("迭代元素： " + obj));//Lambda作为函数接口

        Iterator it = hs.iterator();
        while (it.hasNext()){//Iterator遍历集合
            String book = (String) it.next();
            System.out.println(book);
        }
        it.forEachRemaining(obj->System.out.println("迭代元素： " + obj));//使用Lambda遍历Iterator







    }


}
