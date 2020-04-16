package Base;
/**
 * 内部类解析
 */
class Out{//其他类访问
    class In{//非静态内部类
        public In(String s){
            System.out.println(s);
        }
    }
    static class In2{//静态内部类
        public In2(String s){
            System.out.println(s);
        }
    }
}
public class Outside {
    private int count;//外部实例变量
    private static int num;//外部静态变量
    public Outside(int count){//构造器
        this.count = count;
    }
    public void info1(){//输出外部实例变量
        System.out.println("this is Outside and the count is " + count);
    }
//    public void info2(){//输出内部实例变量出错
//        System.out.println("this is Outside  and the data is " + data);
//    }
    private class Inside{//非静态内部类
        private String data;//内部实例变量
        public Inside(String data){//构造器
            this.data = data;
        }
        public void info1(){
            System.out.println("this is Inside  and the data is " + data); }
        public void info2(){
            System.out.println("this is Outside  and the count is " + count);}
    }
    private static class Inside2{//静态内部类
        private static String c;
        public void access(){
//            System.out.println(count);//访问非静态失败
            System.out.println(num);
        }
    }
    public void test(){
        Inside i = new Inside("me");
        i.info1();//测试获取内部实例变量
        i.info2();//测试获取外部实例变量
        Inside2 i2 = new Inside2();
        i2.access();//测试获取外部实例变量
    }
    public static void main(String[] args){
        Outside o = new Outside(10);
        o.test();
        Out.In in = new Out().new In("in");//访问其他类非静态方法
        Out.In2 in2 = new Out.In2("in2");//访问其他类静态方法
    }
}
