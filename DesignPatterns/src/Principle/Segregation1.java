package Principle;
/**
 * 接口隔离原则：客户端不应该依赖不需要的接口，一个类对其他类的依赖应该建立在最小的接口上
 * 将接口分解成3个接口
 */
//分解成3接口
interface interface1{
    public void operation1();
}
interface interface2{
    public void operation2();
    public void operation3();
}
interface interface3{
    public void operation4();
    public void operation5();
}
//利用java可继承多接口，实现对应的方法
class B1 implements interface1,interface2{
    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }
    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }
    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }
}
class D1 implements interface1,interface3{
    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }
    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }
    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}
//单一职责每个函数对应一个接口的功能
class A1{
    public void depend1(interface1 i1){
        i1.operation1();
    }
    public void depend2(interface2 i2){
        i2.operation2();
    }
    public void depend3(interface2 i2){
        i2.operation3();
    }
}
class C1{
    public void depend1(interface1 i1){
        i1.operation1();
    }
    public void depend4(interface3 i3){
        i3.operation4();
    }
    public void depend5(interface3 i3){
        i3.operation5();
    }
}
public class Segregation1 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.depend1(new B1()); // A类通过接口去依赖B类
        a.depend2(new B1());
        a.depend3(new B1());
        C1 c = new C1();
        c.depend1(new D1()); // C类通过接口去依赖(使用)D类
        c.depend4(new D1());
        c.depend5(new D1());
    }
}
