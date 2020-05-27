package Prototype.Clone;

/**
 * 原型模式，更好的效率和扩展性，动态克隆，不用重新初始化对象，但是因为每个原型类都要重写clone方法，会修改源代码破坏OCP原则
 * spring的bean - getBean() - doGetBean() 中的isProtoType方法中用到了原型模式
 */
public class Client2 {
    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep2 sheep = new Sheep2("tom", 1, "白色");
        sheep.friend = new Sheep2("jack", 2, "黑色");//sheep的朋友

        Sheep2 sheep2 = (Sheep2) sheep.clone(); //使用sheep克隆
        Sheep2 sheep3 = (Sheep2) sheep.clone(); //克隆
        Sheep2 sheep4 = (Sheep2) sheep.clone(); //克隆
        Sheep2 sheep5 = (Sheep2) sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }

}
