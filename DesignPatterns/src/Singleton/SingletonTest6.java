package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 静态内部类式：保证线程安全，首先singleton类加载时并不会立即实例化静态内部类实现懒加载
 * 然后在调用getInstance方法时，才装载内部类实例化，并且类的静态属性只会在第一次加载类时初始化
 * 所以JVM帮我们保证了线程的安全性，内部类初始化时别的线程是无法进入的。
 * 在实际开发中推荐使用这种方式
 */
public class SingletonTest6 {
    public static void main(String[] args){
        Singleton6 singleton1 = Singleton6.getInstance();
        Singleton6 singleton2 = Singleton6.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton6{
    //构造器初始化
    private Singleton6(){}
    //静态内部类，定义一个静态变量并实例化，类的静态属性只会在第一次加载类时初始化，所以JVM帮我们保证了线程的安全性，内部类初始化时别的线程是无法进入的。
    private static class SingletonInstance{
        private static final Singleton6 singletonInstance = new Singleton6();
    }
    //直接用内部类.变量名获取即可，后序的也返回相同的变量
    public static Singleton6 getInstance(){
        return SingletonInstance.singletonInstance;
    }
}