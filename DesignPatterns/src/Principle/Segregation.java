package Principle;
/**
 * 接口隔离原则：客户端不应该依赖不需要的接口，一个类对其他类的依赖应该建立在最小的接口上
 * 违反原则，A通过接口依赖B,C通过接口依赖D，接口不是最小接口，B、D就会实现不需要的方法
 */
interface Interface1{//接口
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class B implements Interface1{//B实现接口
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
    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }
    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}
class D implements Interface1{//D实现接口
    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }
    @Override
    public void operation2() {
        System.out.println("D 实现了operation2");
    }
    @Override
    public void operation3() {
        System.out.println("D 实现了operation3");
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
class A{//A只需要1、2、3方法
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}
class C{//C只需要1、4、5方法
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend4(Interface1 interface1){
        interface1.operation4();
    }
    public void depend5(Interface1 interface1){
        interface1.operation5();
    }
}
public class Segregation {
    public static void main(String[] args){
        //省略
    }
}