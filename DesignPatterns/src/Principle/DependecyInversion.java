package Principle;
/**
 * 依赖倒置原则：高层不应该依赖底层，都依赖抽象，细节也依赖抽象，中心思想就是面向接口编程
 * 简单但是违背原则，如果我们接收的对象是QQ、短信，不仅增加类，还要加接收方法
 */
class Email{
    public String getInfo(){
        return "电子邮件信息 ：hello world";
    }
}
class Person{
    public void Receive(Email email){
        System.out.println(email.getInfo());
    }
}
public class DependecyInversion {
    public static void main(String[] args){
        Person person = new Person();
        person.Receive(new Email());
    }
}
