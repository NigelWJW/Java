package Thread;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 线程池操作
 */
class PrintTask extends RecursiveAction {//继承RecursiveAction，来实现可分解任务，代表没有返回值的任务
    private static final int THRESHOLD = 50;//每个任务打印50个
    private int start;
    private int end;

    public PrintTask(int start, int end) {
        this.end = end;
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    public void setStart(int start) {
        this.start = start;
    }
    @Override
    protected void compute() {
        if (end - start < THRESHOLD) {//小于阈值打印
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName() + " 当前值是 " + i);
            }
        } else {
            int middle = (start + end) >> 2;//分解任务
            PrintTask left = new PrintTask(start, middle);
            PrintTask right = new PrintTask(middle, end);
            left.fork();
            right.fork();
        }
    }
}

class CalTask extends RecursiveTask<Integer> {//继承RecursiveTask，来实现可分解任务，代表有返回值的任务
    private static final int THRESHOLD = 20;//每个任务打印20个
    private int[] a;
    private int start;
    private int end;

    public CalTask(int[] a, int start, int end) {
        this.a = a;
        this.end = end;
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    public void setStart(int start) {
        this.start = start;
    }

    public void setA(int[] a) {
        this.a = a;
    }
    @Override
    protected Integer compute() {
        int sum =0;
        if (end - start < THRESHOLD) {//小于阈值打印
            for (int i = start; i < end; i++) {
                sum += a[i];
            }
            return sum;
        } else {//大于阈值分解
            int middle = (start + end) / 2;//分解任务
            CalTask left = new CalTask(a, start, middle);
            CalTask right = new CalTask(a, middle, end);
            left.fork();//执行任务
            right.fork();
            return left.join() + right.join();//合并返回值
        }
    }
}

public class ThreadPoolTest {
    public static void pool() {//使用线程池操作，有效控制并发线程数，彼此仿佛不共享
        ExecutorService pool = Executors.newFixedThreadPool(6);//创建固定数量线程池
        Runnable target = () -> {//使用lambda实现runnable或者callable接口的实例作为target对象
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " 的值是 " + i);
            }
        };
        pool.submit(target);//将对象提交给线程池
        pool.submit(target);
        pool.shutdown();//关闭线程池
    }

    public static void printTask() {//RecursiveAction，来实现可分解任务，代表没有返回值的任务实现分解线程任务
        try {
            ForkJoinPool pool = new ForkJoinPool();
            pool.submit(new PrintTask(0, 300));//提交任务
            pool.awaitTermination(2, TimeUnit.SECONDS);
            pool.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void calTask() {////继承RecursiveTask，来实现可分解任务，代表有返回值的任务实现分解线程任务
        int[] arr = new int[100];
        Random rand = new Random();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int tmp = rand.nextInt(20);
            total += (arr[i] = tmp);
        }
        System.out.println(total);
        try {
            ForkJoinPool pool = ForkJoinPool.commonPool();//创建一个通用池
            Future<Integer> future = pool.submit(new CalTask(arr, 0, arr.length));//提交分解任务
            System.out.println(future.get());
            pool.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        pool();//使用线程池操作
        printTask();//RecursiveAction，来实现可分解任务，代表没有返回值的任务
        calTask();////RecursiveTask，来实现可分解任务，代表有返回值的任务

    }
}
