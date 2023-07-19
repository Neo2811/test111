package interestingTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test4 {
    static Lock lock = new ReentrantLock(true);
    static Condition condition = lock.newCondition();
    private int res;
    public  void add(int value) {
        try {
            lock.lock();
            res += value;
            condition.await();
        }catch (InterruptedException e ) {

        }finally {
            System.out.println(res);
            lock.unlock();
        }
    }
    public void prod() {
        lock.lock();
        condition.signalAll();
        lock.unlock();
    }

    public static void main(String[] args) {
        var test4 = new Test4();
        new Thread(() -> test4.add(1)).start();
        new Thread(() -> test4.add(2)).start();
        new Thread(() -> test4.prod()).start();
    }

}
