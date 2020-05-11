package Principle;
/**
 * 单一职责原则实例B，职责类分离，但是修改较大，建太多实例类，修改客户端
 */
class RoadVehicle{
    public void run(String name){
        System.out.println(name + "在公路上运行");
    }
}
class WaterVehicle{
    public void run(String name){
        System.out.println(name + "在水上运行");
    }
}
class FlyVehicle{
    public void run(String name){
        System.out.println(name + "在空上运行");
    }
}
public class SingleResponsibility2 {
    public static void main(String[] args){
        RoadVehicle roadVehicle = new RoadVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
        FlyVehicle flyVehicle = new FlyVehicle();
        roadVehicle.run("自行车");
        waterVehicle.run("游艇");
        flyVehicle.run("飞机");
    }
}
