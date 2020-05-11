package Principle;
/**
 * 依赖倒置原则：高层不应该依赖底层，都依赖抽象，细节也依赖抽象，中心思想就是面向接口编程
 * 使用统一接口来接收，使Person类依赖接口.依赖传递除了用接口传递还可以用构造器，setter方法
 */
interface IReceive{//接口类
    public String getInfo();
}
class Email1 implements IReceive{//邮件实现类
    @Override
    public String getInfo() {
        return "电子邮件信息 ：hello world";
    }
}
class WeiXin1 implements IReceive{//微信实现类
    @Override
    public String getInfo() {
        return "WeiXin ：hello world";
    }
}
class Person1{
    public void receive(IReceive iReceive){//接口做形参统一处理
        System.out.println(iReceive.getInfo());
    }
}
public class DependencyInversion2 {
    public static void main(String[] args){
        Person1 person1 = new Person1();
        person1.receive(new Email1());
        person1.receive(new WeiXin1());
    }
}
