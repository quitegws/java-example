package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: gws
 * @Date: 23/03/2018 14:39
 * @Description:
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            pool.execute(new TestRunnable("thread: " + i));
        }
        pool.shutdown();
    }
}


class TestRunnable implements Runnable {

    private final String name ;
    TestRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name);
    }
}