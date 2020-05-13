package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 懒汉式(线程安全,同步代码块)，懒汉含义就是要用时才创建，优点是起到了懒加载的效果解决了线程安全的问题
 * 改为同步代码块并不能解决线程同步的问题，而且会出现前面多个线程同时进入if判断产生多个实例的情况
 * 在实际开发中不能使用这种方式
 */
public class SingletonTest4 {
    public static void main(String[] args){
        Singleton4 singleton1 = Singleton4.getInstance();
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton4{
    //定义成员变量
    private static Singleton4 instance;
    //初始化构造器
    private Singleton4(){}
    //改为同步代码块并不能解决线程同步的问题，而且会出现前面多个线程同时进入if判断产生多个实例的情况
    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized(Singleton4.class){
                instance = new Singleton4();
            }
        }
        return instance;
    }
}
