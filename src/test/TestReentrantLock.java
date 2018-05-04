package test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: gws
 * @Date: 21/04/2018 14:18
 * @Description:
 */
public class TestReentrantLock implements Runnable{
    public static ReentrantLock lock=new ReentrantLock(true);

    public static void main(String[] args) {
        TestReentrantLock mm=new TestReentrantLock();
                Thread t1=new Thread(mm);
                Thread t2=new Thread(mm);
                t1.start();
                t2.start();
               t2.interrupt();
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"running");
            Thread.sleep(5000);
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+" finished");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" InterruptedException");
            //lock方法比较死板，必须得等当前线程结束，才会响应其他线程的中断
        }
    }
}
