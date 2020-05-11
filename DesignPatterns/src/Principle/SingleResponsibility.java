package Principle;
/**
 * 单一职责原则：一个类负责一个职责
 * 实例A违反原则飞机不可能在地上行驶，而且不好扩展，交通工具行驶，而每个交通工具运行方式不同，分解不同类
 */
class Vehicle{
    public void run(String name){
        System.out.println(name + "在路上运行");
    }
}
public class SingleResponsibility {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

