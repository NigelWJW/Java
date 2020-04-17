package Base;
/**
 * 异常处理
 */
class CTException extends Exception{//自定义异常类
    public CTException(){}
    public CTException(String msg){//带字符串的构造器
        super(msg);
    }
    public CTException(Throwable t){//接收throwable参数的构造器
        super(t);
    }
}
public class CatchThrowTest {
    private int count = 30;
    public void getCount(String s) throws CTException{
        double d = 0.0;
        try {
            d = Double.parseDouble(s);
        }
        catch (Exception e){//函数里捕获错误处理
            e.printStackTrace();//这里只是打印错误，然后丢给上层调用者解决throw和catch合用
            throw new CTException(s + "small");
        }
        if (count > d){
            throw new CTException("error");
        }
        d = count;
    }
    public void calCount(String s) throws CTException{
        double d = 0.0;
        try {
            d = Double.parseDouble(s);
        } catch (Exception e){
            e.printStackTrace();//记录原始异常
            throw new CTException(e);
        }
    }
    public static void main(String[] args){
        CatchThrowTest ct = new CatchThrowTest();
        try {
            ct.getCount("df");
        } catch (CTException e) {//再次捕获异常输出信息处理
            System.out.println(e.getMessage());
        }
        try {
            ct.calCount("df");
        } catch (CTException cte){
            System.out.println(cte.getMessage());
        }
    }

}
