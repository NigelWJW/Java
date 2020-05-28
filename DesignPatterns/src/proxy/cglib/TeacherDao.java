package proxy.cglib;

/**
 * cglib类，代理对象不需要实现接口，目标对象需要实现接口
 */
public class TeacherDao {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
