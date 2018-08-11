package test;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/*t.yield()暂停当前正在执行的线程对象，并执行其他线程。
 * 
 * MIN_PRIORITY 1
 * NORM_PRIORITY 5
 * MAX_PRIORITY 10
 */
public class TestThread1 {
    public static void mian(String[] args) {
        Thread4 t1 = new Thread4("t1");
        Thread4 t2 = new Thread4("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 50; i++) {
            new Thread(new CounterRunner(counter)).start();
        }

        Thread.sleep(3000);
        System.out.println(counter.count);
    }
}
class Thread4 extends Thread{
    public Thread4(String s) { 
        super(s);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是"+getName()+"线程"+i);
            if(i%10 == 0){
                yield();
            }
        }
    }
}

class CounterRunner implements Runnable{
    private Counter counter;
    CounterRunner(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.add(1L);
        }
        System.out.println(Thread.currentThread().getName() + " done, count is " + counter.get());
    }
}

class Counter {
    protected  long count = 0;
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(long value){
        lock.writeLock().lock();
        try{
            this.count = this.count + value;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public long get(){
        lock.readLock().lock();
        try{
            return count;
        } finally {
            lock.readLock().unlock();
        }
    }
}