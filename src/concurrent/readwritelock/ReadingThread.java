package concurrent.readwritelock;

// ReadingThread不断读取数据：
public class ReadingThread extends Thread {

    private DataHandler handler;

    public ReadingThread(DataHandler handler) {
        this.handler = handler;
    }

    public void run() {
        for(;;) {
            try {
                char[] data = handler.read(getName());
                Thread.sleep((long)(Math.random()*1000+100));
            }
            catch(InterruptedException ie) {
                break;
            }
        }
    }

}