package Singleton;
/**
 * 设计模式的单例类，使得一个类始终只能创建一个对象实例，
 * 不允许自由创建对象，应用于打印机等多对象无太大的意义的场景。
 * 枚举类式：避免多线程同步问题，而且防止反序列化重新创建新的对象
 * 在实际开发中推荐使用这种方式
 */
public class SingletonTest7 {
    public static void main(String[] args){
        Singleton7 singleton1 = Singleton7.INSTANCE;
        Singleton7 singleton2 = Singleton7.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.print();
    }
}
enum Singleton7{
    INSTANCE;//属性
    public void print(){
        System.out.println("yes,it`s ok!");
    }
}
