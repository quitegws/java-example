package concurrent;

/**
 * @Author: gws
 * @Date: 22/03/2018 10:17
 * @Description:
 */
public class ThreadTest {
    public static void main(String[] args){

        System.out.println(Thread.currentThread().getName());

        for(int i=0; i<10; i++){

            new Thread("" + i){
                public void run(){

                    System.out.println("Thread: " + getName() + " running");

                }
            }.start();

        }

    }

}
