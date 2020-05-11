package Principle;
/**
 * 开闭原则：类模块函数应该对扩展开放即开发方，对修改关闭即使用方。
 * 变化时尽量通过扩展软件实体的行为来实现变化，而不是修改已有的代码实现变化
 * 违反原则，修改Graphic类的代码
 */
class Graphic{//使用方
    public void draw(Shape s){
        if (s.type == 1){//根据type来判断绘制什么图形
            drawRectangle(s);
        }
        else if (s.type == 2){
            drawCircle(s);
        }
        else if (s.type == 3){
            drawTriangle(s);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println(" 绘制矩形 ");
    }
    public void drawCircle(Shape shape){
        System.out.println(" 绘制圆形 ");
    }
    public void drawTriangle(Shape shape){
        System.out.println(" 绘制三角形 ");
    }
}
class Shape{//基类
    int type;
}
class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }
}
class Circle extends Shape{
    Circle(){
        super.type = 2;
    }
}
class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }
}

public class OCP {
    public static void main(String[] args){
        Graphic graphic = new Graphic();
        graphic.draw(new Rectangle());
        graphic.draw(new Circle());
        graphic.draw(new Triangle());
    }


}
