package Principle;

import java.util.Scanner;

/**
 * 开闭原则：类模块函数应该对扩展开放即开发方，对修改关闭即使用方。
 * 变化时尽量通过扩展软件实体的行为来实现变化，而不是修改已有的代码实现变化
 * 我们把Shape做抽象类，将draw做抽象方法，让不同的子类来实现他，添加
 * 新的图形也只用添加类即可，使用方不用修改
 */
abstract class Shape1{
    public int type;
    public abstract void draw();//抽象方法
}
class Rectangle1 extends Shape1 {
    public Rectangle1(){
        super.type = 1;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}
class Circle1 extends Shape1 {
    public Circle1(){
        super.type = 2;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}
class Triangle1 extends Shape1 {
    public Triangle1(){
        super.type = 3;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}
class Line extends Shape1 {
    public Line(){
        super.type = 4;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制线 ");
    }
}
class Graphic1{//使用方
    public void drawShape(Shape1 shape1){
        shape1.draw();
    }
}

public class OCP1 {
    public static void main(String[] args){
        Graphic1 graphic1 = new Graphic1();
        graphic1.drawShape(new Rectangle1());
        graphic1.drawShape(new Circle1());
        graphic1.drawShape(new Triangle1());
        graphic1.drawShape(new Line());
    }
}
