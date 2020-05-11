package Principle;
/**
 * 单一职责原则实例C,修改服务器端，写成不同方法(构造器)，但依旧是单一职责
 */
class Vehicle2{
    public void run(String name){
        System.out.println(name + "在公路上运行");
    }
    public void fly(String name){
        System.out.println(name + "在空上运行");
    }
    public void water(String name){
        System.out.println(name + "在水上运行");
    }
}
public class SingleResponsibility3 {

    public static void main(String[] args){
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.fly("飞机");
        vehicle2.water("游艇");
    }
}
