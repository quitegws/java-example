package concurrent.taskqueue;

public class Main {

    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();
        ThreadPool pool = new ThreadPool(queue);
        for(int i=0; i<10; i++) {
            queue.putTask(new CalculateTask());
            queue.putTask(new TimerTask());
        }
        pool.addWorkerThread();
        pool.addWorkerThread();
        doSleep(8000);
        pool.currentStatus();
        pool.addWorkerThread();
        pool.addWorkerThread();
        pool.addWorkerThread();
        pool.addWorkerThread();
        pool.addWorkerThread();
        doSleep(5000);
        pool.currentStatus();
    }

    private static void doSleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch(InterruptedException ie) {}
    }

}