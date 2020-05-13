package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 懒汉式(线程不安全)，懒汉含义就是要用时才创建，优点是起到了懒加载的效果，但是只能在
 * 单线程下使用，因为在多线程下，同时进入if判断会产生多个实例，就不是单例模式了,而且线程不安全
 * 在实际开发中不要使用这种方式
 */
public class SingletonTest2 {
    public static void main(String[] args){
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton2{
    //定义实例变量
    private static Singleton2 instance;
    //私有的构造函数
    private Singleton2(){}
    //当getInstance方法时才创建单例模式，饱汉式
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
