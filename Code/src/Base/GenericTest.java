package Base;
import java.util.*;
/**
 * 泛型类测试
 */
class Generic<E>{//测试泛型构造器
    public <T> Generic(T t){//菱形语法和泛型构造类
        System.out.println("t的值是： " + t);
    }
}
class Generic2<E extends Number>{//测试泛型擦除
    private E size;
    public Generic2(){}
    public Generic2(E size){
        this.size = size;
    }
    public <T> Generic2(T t){//菱形语法和泛型构造类
        System.out.println("t的值是： " + t);
    }
    public void setSize(E size){
        this.size = size;
    }
    public E getSize(){
        return size;
    }
}
public class GenericTest {
    public GenericTest(){}//默认构造函数

    public <T> void trans(T[] a, Collection<T> c){//使用泛型方法定义类型转换
        c.addAll(Arrays.asList(a));
    }
    public <T> void trans(Collection<? extends T> from,Collection<T> to){//使用限定的类型通配符和泛型方法结合，前面的集合是后面集合的子类。
        to.addAll(from);
    }
    public void iterators(Collection<?> c){
        Iterator it = c.iterator();//使用集合迭代器
        it.forEachRemaining(obj -> System.out.println("element: " + obj));
    }
    public static void main(String[] args){
        String[] s = new String[]{"q","w","e","r","t"};
        Collection<String> c = new ArrayList<>();
        c.add("q");
        c.add("w");
        c.add("e");
        Collection<Object> o = new ArrayList<>();
        GenericTest g = new GenericTest();
        g.trans(s,c);//测试数组转集合
        g.iterators(c);
        g.trans(c,o);//测试集合转换
        g.iterators(o);
        Generic<String> g1 = new Generic<>(5);//类声明是String，泛型构造器是Integer
        Generic<String> g2 = new <Integer>Generic<String>(5);//类声明是String,泛型显示声明是Integer
//        Generic<String> g3 = new <Integer>Generic<>(5);//报错，显示声明Integer，就不能用菱形语法
        Generic2<Integer> g4 = new Generic2<>(6);//泛型擦除：将由泛型信息的的对象赋给无泛型对象，所有类型信息都会消失。
        Integer a = g4.getSize();//g4的getSize方法返回Integer对象
        Generic2 b = g4;//将g4赋给b丢失尖括号信息
        Number size1 = b.getSize();//size的类型是Number
//        Integer size2 = b.getSize();//报错

    }

}
