package Base;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * 使用阻塞队列控制线程通信，使用生产者消费者做例子
 */
class Producer extends Thread{//生产者
    private BlockingQueue<String> bq;//建立阻塞队列
    public Producer(BlockingQueue<String> bq){
        this.bq = bq;
    }
    public void settBq(BlockingQueue<String> bq){
        this.bq = bq;
    }
    public void run(){
        String[] str = new String[]{
                "Tom",
                "Jack",
                "Lucy"
        };
        for (int i = 0;i<100;i++){
            System.out.println(getName() + " 生产者生产ing ");
            try {
                Thread.sleep(100);
                bq.put(str[i%3]);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{//消费者
    private BlockingQueue<String> bq;
    public Consumer(BlockingQueue<String> bq){
        this.bq = bq;
    }
    public void settBq(BlockingQueue<String> bq){
        this.bq = bq;
    }
    public void run(){
        while(true){
            System.out.println(getName() + " 消费者开始消费 ");
            try {
                Thread.sleep(100);
                bq.take();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(getName() + " 消费者完成消费 ");
        }

    }
}
public class BlockQueueTest {
    public static void main(String[] args){
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        new Consumer(bq).start();
    }

}
