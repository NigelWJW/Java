package Principle;
/**
 *里式替换原则：引用基类的地方透明使用子类对象
 *重写父类方法会使得复用型较差，因此将父类和子类都继承一个更通俗的基类，将原来的继承改成依赖关系
 */
class Base{
}
class Count1 extends Base{
    public int fun(int n1,int n2){
        return n1-n2;
    }
}
class CountNum1 extends  Base{
    Count count = new Count();//组合关系替代泛化关系
    public int fun(int n1,int n2){
        return n1+n2;//super不考虑
    }
    public int fun1(int n1,int n2){
        return n1*n2;
    }
    public int fun2(int n1,int n2){//使用Count1中的方法
        return count.fun(n1,n2);
    }
}

public class Liskov2 {
    public static void main(String[] args){
        Count1 c = new Count1();
        c.fun(2,1);
        CountNum1 countNum = new CountNum1();
        countNum.fun(2,1);
        countNum.fun1(2,1);
        countNum.fun2(2,1);
    }
}
