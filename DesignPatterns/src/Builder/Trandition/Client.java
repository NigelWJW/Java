package Builder.Trandition;

/**
 * 传统方式，写一个抽象类，具体子类实现。优点是简单，但是程序扩展和维护不好，房子和修房子
 * 封装在一起，耦合性高
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }

}
