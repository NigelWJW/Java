package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 懒汉式(线程安全同步方法)，懒汉含义就是要用时才创建，优点是起到了懒加载的效果解决了线程安全的问题
 * 但是每次线程进入都要进行同步代码效率太低了，每次想获得实例时，执行方法都要进行同步，而只用执行一次实例化代码就行了，后面的直接return就行了
 * 在实际开发中不推荐使用这种方式
 */
public class SingletonTest3 {
    public static void main(String[] args){
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton3{
    //定义成员变量
    private static Singleton3 instance;
    //初始化构造器
    private Singleton3(){}
    //加入同步标识符解决线程不安全的问题，但是效率低下
    public static synchronized Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
