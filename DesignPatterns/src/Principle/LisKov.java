package Principle;
/**
 *里式替换原则：引用基类的地方透明使用子类对象
 *且类尽量不要重写父类方法，可通过聚合组合依赖解决问题
 */
class Count{
    public int fun(int n1,int n2){
        return n1-n2;
    }
}
class CountNum extends Count{
    public int fun(int n1,int n2){
        return n1+n2;//super不考虑
    }
    public int fun1(int n1,int n2){
        return n1*n2;
    }
}

public class LisKov {
    public static void main(String[] args){
        Count c = new Count();
        c.fun(2,1);
        CountNum countNum = new CountNum();
        countNum.fun(2,1);//这里本来是相减
        countNum.fun1(2,1);
    }
}
