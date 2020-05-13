package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 双重检查式：保证线程安全，实例代码只执行一次，延迟加载，效率较高
 * 在实际开发中推荐使用这种方式
 */
public class SingletonTest5 {
    public static void main(String[] args){
        Singleton5 singleton1 = Singleton5.getInstance();
        Singleton5 singleton2 = Singleton5.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton5{
    //定义成员变量,volatile是稍弱的同步机制
    private static volatile Singleton5 instance;
    //初始化构造器
    private Singleton5(){}
    //改为同步代码块并不能解决线程同步的问题，而且会出现前面多个线程同时进入if判断产生多个实例的情况
    public static Singleton5 getInstance(){
        if (instance == null){
            synchronized(Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
