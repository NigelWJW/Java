package proxy.staticproxy;

/**
 * 目标对象类。被代理类。
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }
}
