package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，节约资源使用方法创建，频繁使用的工具类
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 饿汉式(静态常量)：饿汉含义就是有就接收，优点是简单runtime就是这种方法，类加载时就完成实例化避免了线程同步的问题，但是可能存在内存浪费，而且可以通过
 * 其他类加载方法跳过getInstace方法
 * Runtime类就是这种模式，里面的currentRuntime就是静态变量
 */
public class SingletonTest {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
//饿汉式静态变量
class Singleton{
    // 内部创建一个对象实例并初始化,final可以底层优化
    private final static Singleton instance = new Singleton();
    //私有化构造器，外部不能new
    private Singleton(){ }
    //提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
