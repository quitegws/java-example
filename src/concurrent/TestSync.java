package concurrent;

public class TestSync extends  Thread{
    Object object;



    public TestSync(Object o){
        this.object = o;
    }

    public synchronized void slp(){
        System.out.println(Thread.currentThread().getName() + " is going to sleep 10000ms");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " is interupted");
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        slp();
    }

    public static void main(String[] args){
        String s = "";
        TestSync t = new TestSync(s);
        TestSync t2 = new TestSync(s);

        t.start();

        t.interrupt();
        boolean interrupted = Thread.interrupted();


    }


}
