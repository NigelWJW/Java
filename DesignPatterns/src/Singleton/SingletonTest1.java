package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 饿汉式(静态构造器)，饿汉含义就是有就接收，优点是简单，类加载时就完成实例化避免了线程同步的问题，但是可能存在内存浪费，而且可以通过
 * 其他类加载方法跳过getInstace方法
 */
public class SingletonTest1 {
    public static void main(String[] args){
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton1{
    //定义一个对象实例没有初始化
    private static Singleton1 instance;
    //初始化块创建实例
    static{
        instance = new Singleton1();
    }
    //提供一个公有的方法
    public static Singleton1 getInstance(){
        return instance;
    }
}
