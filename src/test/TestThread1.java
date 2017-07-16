package test;


/*t.yield()暂停当前正在执行的线程对象，并执行其他线程。
 * 
 * MIN_PRIORITY 1
 * NORM_PRIORITY 5
 * MAX_PRIORITY 10
 */
public class TestThread1 {
    public static void main(String[] args) {
        Thread4 t1 = new Thread4("t1");
        Thread4 t2 = new Thread4("t2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
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