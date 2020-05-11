package Singleton;

/**
 * 设计模式的简单单例类，使得一个类始终只能创建一个实例，不允许自由创建对象，应用于打印机等多对象无太大的意义，
 */
public class Singleton {
    private static Singleton singleton;//定义曾经的类变量
    private Singleton(){}//隐藏构造器
    public static Singleton getInstance() {//提供一个静态方法，只产生唯一实例化对象
        if (singleton == null) {
            singleton = new Singleton();//实例为空创建一个实例
        }
        return singleton;
    }
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();//只能通过getInstance创建
        Singleton singleton2 = Singleton.getInstance();
        Singleton s = new Singleton();//使用传统new对象
        System.out.println(singleton1 == singleton2);//getInstance方法创建的成功，返回true
        System.out.println(s.equals(singleton2));//普通构造器创建的失败，返回false
    }
}
