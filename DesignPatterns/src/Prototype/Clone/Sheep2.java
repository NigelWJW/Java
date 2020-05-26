package Prototype.Clone;

/**
 * 原型模式，更好的效率和扩展性
 */
public class Sheep2 implements Cloneable {
    public Sheep2 friend; //是对象, 克隆是会如何处理
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";//默认是浅拷贝

    public Sheep2(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {

        Sheep2 sheep = null;
        try {
            sheep = (Sheep2) super.clone();//强制转换成sheep2类型
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }


}
