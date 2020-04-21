package Base;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 线程同步和传统通信操作，采用银行取钱
 */
class Account{//账户类
    private String accountNo;//账户编号
    private double balance;//余额
    private boolean flag = false;//表示账户是否已有存款标识，初始是没有人存钱
    private final ReentrantLock lock = new ReentrantLock();//使用可重入锁加锁
    private final Condition condition = lock.newCondition();//获取lock对象的condition
    public Account(){}
    public Account(String accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }//不建议这个方法
    public String getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj != null && obj.getClass() == Account.class){
            Account account = (Account)obj;
            return account.getAccountNo().equals(accountNo);
        }
        return false;
    }
    public void draw(double money){//第三种方法使用使用可重入锁加锁实现多个线程修改同一个共享数据，不同步会因为线程的不确定性出现错误
        lock.lock();//为当前对象加锁，同步方法系统隐式使用当前对象作为同步监视器，锁对象是显式使用lock做同步锁
        try{//取钱
            if (!flag){//如果flag为假没有人存钱，不取钱阻塞
                condition.await();
            }
            else {
                if (balance >= money){
                    balance -= money;
                    System.out.println(Thread.currentThread().getName() + " 成功！ " + money + " 余额是 " + balance);
                    flag = false;//将标识致反
                    condition.signalAll();//唤醒其他线程
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " 失败！ ");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//修改完成，释放锁
        }
    }
    public void deposit(double money){//第三种方法使用使用可重入锁加锁实现多个线程修改同一个共享数据，不同步会因为线程的不确定性出现错误
        lock.lock();//为当前对象加锁，同步方法系统隐式使用当前对象作为同步监视器，锁对象是显式使用lock做同步锁
        try{//存钱
            if (flag){//如果flag为假没有人取钱，不取钱阻塞
                condition.await();
            }
            else {
                if (balance >= money){
                    balance += money;
                    System.out.println(Thread.currentThread().getName() + " 成功！ " + money + " 余额是 " + balance);
                    flag = true;//将标识致反
                    condition.signalAll();//唤醒其他线程
                    try {
                        Thread.sleep(1);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " 失败！ ");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//修改完成，释放锁
        }
    }
//    public synchronized void draw1(double money){//第二种方法使用同步方法实现多个线程修改同一个共享数据，且相互通信相互切换，不同步会因为线程的不确定性出现错误
//        try{//取钱
//            if (!flag){//如果flag为假没有人存钱，不取钱阻塞
//                wait();
//            }
//            else {
//                if (balance >= money){
//                    balance -= money;
//                    System.out.println(Thread.currentThread().getName() + " 成功！ " + money + " 余额是 " + balance);
//                    flag = false;//将标识致反
//                    notifyAll();//唤醒其他线程
//                    try {
//                        Thread.sleep(1);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//                else {
//                    System.out.println(Thread.currentThread().getName() + " 失败！ ");
//                }
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }
//    public synchronized void deposit1(double money){//第二种方法使用同步方法实现多个线程修改同一个共享数据，且相互通信相互切换，不同步会因为线程的不确定性出现错误
//        try{//存钱
//            if (flag){//如果flag为真表明有人存钱，阻塞
//                wait();
//            }
//            else {
//                if (balance >= money){
//                    balance += money;
//                    System.out.println(Thread.currentThread().getName() + " 成功！ " + money + " 余额是 " + balance);
//                    flag = true;//将标识致反
//                    notifyAll();//唤醒其他线程
//                    try {
//                        Thread.sleep(1);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//                else {
//                    System.out.println(Thread.currentThread().getName() + " 失败！ ");
//                }
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }
}
class Deposit extends Thread{//模拟账户存钱
    private final Account account;//用户账户
    private double money;//存钱金额
    public Deposit(Account account){
        this.account = account;
    }
    public Deposit(String name,Account account,double money){
        super(name);
        this.account = account;
        this.money = money;
    }
    public Account getAccount(){
        return account;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

//    public void run(){//第一种方法使用同步代码块使多个线程修改同一个共享数据，不同步会因为线程的不确定性出现错误
//        synchronized(account){//使用同步代码块实现同步
//                account.setBalance(account.getBalance() + money);
//                System.out.println(getName() + " 成功！ " + money + " 余额是 " + account.getBalance());
//                try {
//                    Thread.sleep(1);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            account.deposit(money);//第三种方法使用使用可重入锁加锁，在这里直接调用对象的存钱方法，相比代码块封装更好，类似领域驱动设计模式
//            account.deposit1(money);//第二种方法使用同步方法在这里直接调用对象的存钱方法，相比代码块封装更好，类似领域驱动设计模式
        }
    }
}
class Draw extends Thread{//模拟账户取钱
    private final Account account;//用户账户
    private double money;//取钱金额
    public Draw(Account account){
        this.account = account;
    }
    public Draw(String name,Account account,double money){
        super(name);
        this.account = account;
        this.money = money;
    }
    public Account getAccount(){
        return account;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    //    public void run(){//第一种方法使用同步代码块使多个线程修改同一个共享数据，不同步会因为线程的不确定性出现错误
//        synchronized(account){//使用同步代码块实现同步
//            if (account.getBalance() >= money){
//                account.setBalance(account.getBalance() - money);
//                System.out.println(getName() + " 成功！ " + money + " 余额是 " + account.getBalance());
//                try {
//                    Thread.sleep(1);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//            else {
//                System.out.println(" 失败！ ");
//            }
//        }
//    }
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            account.draw(money);//第三种方法使用使用可重入锁加锁，在这里直接调用对象的取钱方法，相比代码块封装更好，类似领域驱动设计模式
//            account.draw1(money);//第二种方法使用同步方法在这里直接调用对象的取钱方法，相比代码块封装更好，类似领域驱动设计模式
        }
    }
}


public class ThreadSynchronizedTest {
    public static void main(String[] args){
        Account account = new Account("111",10000);
        new Draw("Tom取钱",account,500).start();
        new Deposit("Jerry存钱",account,500).start();
        new Deposit("Jack存钱",account,500).start();
        new Deposit("Lucy存钱",account,500).start();
    }
}
