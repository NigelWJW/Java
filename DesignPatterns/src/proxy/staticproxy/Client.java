package proxy.staticproxy;

/**
 * 静态代理类，在不修改目标对象的功能下通过代理对象进行扩展。但是实现一样的接口，会有很多
 * 代理类，一旦增加方法，目标和代理对象都要维护
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象(被代理对象)
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象, 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用到被代理对象的方法
        //即：执行的是代理对象的方法，代理对象再去调用目标对象的方法
        teacherDaoProxy.teach();
    }
}
