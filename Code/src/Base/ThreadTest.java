package Base;
import java.util.concurrent.FutureTask;
/**
 * 多线程创建及控制测试
 */
class FirstThread extends Thread{//继承Thread类创建线程子类，简单但不能继承其他父类了
    private int i;
    public void run(){//重写run函数，也就是子线程执行体
        for (;i<20;i++){
            System.out.println("线程" + this.getName() + "的第" + i + "次循环");
        }
    }
}
class SecondThread implements Runnable{//Runnable接口创建线程类，共享实例，但复杂些要使用Thread.currentThread()来获取当前对象
    private int i;
    public void run(){
        for (;i<20;i++){//重写run函数，也就是子线程执行体
            System.out.println(Thread.currentThread().getName() +"的第" + i + "次循环");
        }
    }
}
class JoinThread extends Thread{//测试join线程
    public JoinThread(String name){//提供一个有参数的构造器
        super(name);
    }
    public void run(){//重写run方法
        for (int i = 0 ;i<20;i++){
            System.out.println(Thread.currentThread().getName() +"的第" + i + "次循环");
        }
    }
}
class DaemonThread extends Thread{//测试守护线程
    public DaemonThread(String name){//提供一个有参数的构造器
        super(name);
    }
    public void run(){//重写run方法
        for (int i = 0 ;i<20;i++){
            System.out.println(Thread.currentThread().getName() +"的第" + i + "次循环");
        }
    }
}
class YieldThread extends Thread{//测试yield线程让步
    public YieldThread(String name){//提供一个有参数的构造器
        super(name);
    }
    public void run(){//重写run方法
        for (int i = 0 ;i<100;i++){
            System.out.println(Thread.currentThread().getName() +"的第" + i + "次循环");
            if (i == 20){
                Thread.yield();//当i=20时为当前线程让步
            }
        }
    }
}
public class ThreadTest {
    public static void firstTest(){
        for (int i = 0;i<100;i++){//程序会自动创建一个主线程（也就是main方法(主线程的线程执行体)确定而不是run方法）
            System.out.println(Thread.currentThread().getName() + " 这是主线程的操作的第" + i + "次操作");//主线程的main方法
            if (i == 20){
                new FirstThread().start();//显示创建2个子线程,可以看到子线程间的互相切换不连续说明没有共享数据
                new FirstThread().start();
//                new FirstThread().run();//系统会将线程对象看成普通对象，run方法普通方法不是线程执行体了，且退化为单线程
            }//对已经start过的线程使用isAlive方法判断，不能再start方法

        }
    }
    public static void secondTest(){
        for (int i = 0;i<100;i++){//程序会自动创建一个主线程（也就是main方法(主线程的线程执行体)确定而不是run方法）
            System.out.println(Thread.currentThread().getName() + " 这是主线程的操作的第" + i + "次操作");//主线程的main方法
            if (i == 20){//当在处于第几个主线程的时候加入子线程，每次的
                SecondThread st = new SecondThread();
                new Thread(st,"线程1").start();//显示创建2个子线程,可以看到子线程间的互相切换连续说明是共享数据，因为Runnable(SecondThread类)
                new Thread(st,"线程2").start();//对象只是线程的target，多个线程共享一个target所以多线程共享一个线程类的实例变量
            }
        }
    }
    public static void thirdTest(){//使用Callable和Future接口创建线程，共享实例，但复杂些要使用Thread.currentThread()来获取当前对象
        FutureTask<Integer> task = new FutureTask<>(() -> {//Lambda表达式直接创建Callable<Integer>对象，无需创建实现类再创建对象
            int i = 0;//使用FutureTask包装Callable对象--Call方法，可以有返回值且可以抛出异常
            for (; i < 100; i++) {//子线程执行体
                System.out.println(Thread.currentThread().getName() + "的第" + i + "次循环");
            }
            return i;//Call方法返回值
        });
        for (int i = 0;i<100;i++){//主线程执行体main方法
            System.out.println(Thread.currentThread().getName() + " 这是主线程的操作的第" + i + "次操作");//主线程的main方法
            if (i == 10){
                new Thread(task,"线程A").start();//可以看到主线程和call方法交替执行的情形最后输出返回值
                new Thread(task,"线程B").start();//可以看到主线程和call方法交替执行的情形最后输出返回值
            }
        }
        try {
            System.out.println("返回值： " + task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void joinTest(){//测试join线程
        JoinThread jt = new JoinThread("新线程");//启动子进程
        jt.start();
        for (int i = 0;i<50;i++){
            if (i == 20){
                JoinThread jt2 = new JoinThread("join进程");//join进程
                jt2.start();
                try {//也可在方法开头throws抛出给上层处理
                    jt2.join();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 这是主线程的操作的第" + i + "次操作");//主线程的main方法
        }
    }
    public static void daemonTest(){//测试守护线程
        DaemonThread dt = new DaemonThread("守护线程");
        dt.setDaemon(true);//将该线程设置成守护线程
        dt.start();
        for (int i = 0;i<50;i++){
            System.out.println(Thread.currentThread().getName() + " 这是主线程的操作的第" + i + "次操作");//主线程的main方法
            try {//也可在方法开头throws抛出给上层处理
                Thread.sleep(1000);//让当前线程暂停1s
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void yieldTest(){//测试让步线程
        YieldThread yt1 = new YieldThread("让步线程A");
//        try {//也可在方法开头throws抛出给上层处理
//            yt1.setPriority(Thread.MAX_PRIORITY);//设置成最高优先级
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        yt1.start();
        YieldThread yt2 = new YieldThread("让步线程B");
//        try {//也可在方法开头throws抛出给上层处理
//            yt2.setPriority(Thread.MIN_PRIORITY);//设置成最低优先级
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        yt2.start();
    }
    public static void main(String[] args){
//        firstTest();//测试继承Thread类创建线程类
//        secondTest();//测试Runnable接口创建线程类
//        thirdTest();//使用Callable和Future接口创建线程
//        joinTest();//测试join线程
//        daemonTest();//测试守护线程
//        yieldTest();//测试让步线程
    }
}
